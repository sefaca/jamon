/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 *
 * @author portatil_profesorado
 */
public class Main {
    
    public static void main(String[] args) {
        Jamon miJamonFalconDeLaCalleSergio2122;
        int stockActual;
        
        miJamonFalconDeLaCalleSergio2122 = new Jamon("5Jotas",580,100);
        vendeJamFalconDeLaCalleSergio2122(miJamonFalconDeLaCalleSergio2122, "Espa\u00f1a");
        
        compraJamFalconDeLaCalleSergio2122(miJamonFalconDeLaCalleSergio2122);
        stockActual = miJamonFalconDeLaCalleSergio2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    private static void compraJamFalconDeLaCalleSergio2122(Jamon miJamonFalconDeLaCalleSergio2122) {
        try
        {
            System.out.println("Compra de Jamones");
            miJamonFalconDeLaCalleSergio2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    private static void vendeJamFalconDeLaCalleSergio2122(Jamon miJamonFalconDeLaCalleSergio2122, String paisFalconDeLaCalleSergio2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonFalconDeLaCalleSergio2122.vender(80, "España");
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}
