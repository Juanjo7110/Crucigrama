/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.poli.crucigrama.vista;

import java.util.Scanner;

public class InterfazUsuario {
    private Scanner scanner;

    public InterfazUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public String solicitarNickname() {
        System.out.print("Ingrese su nickname: ");
        return scanner.nextLine();
    }

    public void mostrarMensajeBienvenida(String nickname) {
        System.out.println("Bienvenido, " + nickname + "!");
    }
}
