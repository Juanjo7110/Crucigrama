/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.poli.crucigrama.controlador;

public class ControladorJuego {
    private Jugador jugador;
    private InterfazUsuario vista;

    public ControladorJuego() {
        this.jugador = new Jugador();
        this.vista = new InterfazUsuario();
    }

    public void iniciarJuego() {
        String nickname = vista.solicitarNickname();
        jugador.setNickname(nickname);
        vista.mostrarMensajeBienvenida(jugador.getNickname());
    }
}

public class Main {
    public static void main(String[] args) {
        ControladorJuego controlador = new ControladorJuego();
        controlador.iniciarJuego();
    }
}

