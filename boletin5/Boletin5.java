/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author xdeantabelisario
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta c1, c2;
        c1=new Cuenta(25000,"12345","Javier");
        c2=new Cuenta(1000,"12346","Jose");
        System.out.println("C1 a C2: 200");
        if(c1.transferencia(c2, 200)){
            System.out.println("Transferencia realizada");
            c1.mostrar_datos();
            c2.mostrar_datos();
        }else{
            System.out.println("Saldo insuficiente");
            c1.mostrar_datos();
            c2.mostrar_datos();
        }
        System.out.println("C2 a C1: 1500");
        if(c2.transferencia(c1, 1500)){
            System.out.println("Transferencia realizada");
            c1.mostrar_datos();
            c2.mostrar_datos();
        }else{
            System.out.println("Saldo insuficiente");
            c1.mostrar_datos();
            c2.mostrar_datos();
        }
    }
    
}
