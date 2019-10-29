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
public class Cuenta {
    private double saldo;
    private String ncuenta;
    private String nombreC;
    
    public Cuenta(){
        saldo=0;
        ncuenta=null;
        nombreC=null;
    }
    public Cuenta(double sal, String ncuen, String nomb){
        saldo=sal;
        ncuenta=ncuen;
        nombreC=nomb;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getNcuenta(){
        return ncuenta;
    }
    public String getNombreC(){
        return nombreC;
    }
    
    public void setSaldo(double sal){
        saldo=sal;
    }
    public void setNcuenta(String ncuen){
        ncuenta=ncuen;
    }
    public void setNombreC(String nomb){
        nombreC=nomb;
    }
    
    public boolean ingreso(double cantidad){
        if(cantidad>0){
            saldo=saldo+cantidad;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean reintegro(double cantidad){
        if(cantidad>0){
            if(saldo>cantidad){
                saldo=saldo-cantidad;
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    public void mostrar_datos(){
        System.out.println("Nombre del cliente: " + nombreC);
        System.out.println("numero de cuenta: " + ncuenta);
        System.out.println("Saldo: " + saldo);
    }
    
    public boolean transferencia(Cuenta destino, double importe){
        if(reintegro(importe)){
            return destino.ingreso(importe);
        }else{
            return false;
        }
    }
}
