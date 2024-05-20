package Modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Crucigrama {
	
	String crucigrama;
	int nivel;
	int [][] tablero;
	
	public Crucigrama (String cricigrama, int nivel) {
		this.crucigrama = cricigrama;
		this.nivel = nivel;
		
		
		this.tablero = new int [nivel][nivel];
		
		for (int i = 0; i < tablero.length; i++) {
			int x = i*nivel;
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j] = crucigrama.charAt(x);
				System.out.print(crucigrama.charAt(x));
				x++;
			
			}
			System.out.println("");
		}
		
	}
	
	public String getNivel() {
		return crucigrama;
	}
	
	public int getDificultadNivel() {
		return nivel;
	}
	

    public void setNivel(String nivel) {
        this.crucigrama = crucigrama;
    }
    
    public void setDificultadNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public Boolean validarCrucigrama (Crucigrama tablero) {
    	
    	return false;
    	
    }
    
    public void imprimirCrucigrama () {
    	
    	for (int i = 0; i < tablero.length ; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.println(tablero[i][j]);
			}
		}
		
	}
   }
    
    
 

