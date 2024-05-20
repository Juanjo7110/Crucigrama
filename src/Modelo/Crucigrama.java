package Modelo;

public class Crucigrama {
	
	String nivel;
	int dificultadNivel;	
	
	public Crucigrama (String nivel, int dificultadNivel) {
		this.nivel = nivel;
		this.dificultadNivel = dificultadNivel;
		
		int [][] tablero = new int [dificultadNivel][dificultadNivel];
	}
	
	public String getNivel() {
		return nivel;
	}
	
	public int getDificultadNivel() {
		return dificultadNivel;
	}
	

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public void setDificultadNivel(int dificultadNivel) {
        this.dificultadNivel = dificultadNivel;
    }
    
 
}
