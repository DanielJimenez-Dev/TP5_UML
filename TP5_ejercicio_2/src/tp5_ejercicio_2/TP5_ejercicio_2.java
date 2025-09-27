/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ejercicio_2;

/**
 *
 * @author jimen
 */
public class TP5_ejercicio_2 {

   
    public static void main(String[] args) {
       
         Bateria b1 = new Bateria("Samsung-EBBG530BBC", 4000);
        Celular c1 = new Celular("123456789012345", "Samsung", "Galaxy S21", b1);
        Usuario u1 = new Usuario("Daniel", "12345678");

        // Relacionamos usuario y celular
        c1.setUsuario(u1);

        // Mostrar información
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(u1);
    }
 }
  
