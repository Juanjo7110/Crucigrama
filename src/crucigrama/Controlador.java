package crucigrama;
public class Controlador {

    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Agregar listeners a los campos de texto
        addListeners();
    }

    private void addListeners() {
        // Listener para el campo de nombre
        vista.getNombre().textProperty().addListener((observable, oldValue, newValue) -> {
            // Verificar si la longitud del texto es mayor a 10
            if (newValue.length() > 10) {
                // Si es mayor a 10, truncar el texto a 10 caracteres
                vista.getNombre().setText(newValue.substring(0, 10));
            }
            
            // Verificar si el nuevo texto contiene caracteres no alfabéticos
            if (!newValue.matches("[a-zA-Z]*")) {
                // Si contiene, eliminar los caracteres no alfabéticos
                vista.getNombre().setText(newValue.replaceAll("[^a-zA-Z]", ""));
            }
        });

        // Listener para el campo de código
        vista.getCodigo().textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) { // Verificar si el nuevo valor contiene solo dígitos
                vista.getCodigo().setText(newValue.replaceAll("[^\\d]", "")); // Eliminar caracteres no numéricos
            }
            if (newValue.length() > 7) { // Verificar si la longitud supera los 7 dígitos
                String truncatedValue = newValue.substring(0, 7); // Truncar el valor a 7 dígitos
                vista.getCodigo().setText(truncatedValue); // Establecer el nuevo valor truncado
            }
        });
    }

    public void inicializar() {
        vista.show();
    }
}
