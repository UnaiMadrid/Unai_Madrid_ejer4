/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unai_madrid_ejer4;

import java.util.Scanner;

/**
 *
 * @author Unai
 */
public class Unai_Madrid_ejer4 {
static Scanner teclado =new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nAlum=10, arrNotaAlum[]=new int [nAlum];
        String []arrNomAlum= new String [nAlum];
        for (int i=0; i<arrNomAlum.length; i++){
        arrNomAlum[i]=cargarNombresAlumnos(arrNomAlum, i);
        arrNotaAlum[i]=cargarNotasAlumnos(arrNotaAlum, i);
        }
    }
    public static String cargarNombresAlumnos (String arrNomAlum[], int i){
        System.out.println("Introduce el nombre");
        arrNomAlum[i]=teclado.next();
        return arrNomAlum[i];
    }
    public static int cargarNotasAlumnos (int arrNotaAlum[], int i){
        System.out.println("Introduce la nota");
        arrNotaAlum[i]=teclado.nextInt();
        while (arrNotaAlum[i]>10||arrNotaAlum[i]<0){
        System.out.println("Introduce una nota valida");
        arrNotaAlum[i]=teclado.nextInt();    
        }
        return arrNotaAlum[i];
    }
    
    
}
