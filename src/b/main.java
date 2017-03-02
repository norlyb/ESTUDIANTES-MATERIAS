
import b.A;
import b.B;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class main {
    public static void main (String[] args){
        A estudiante = new A ();
        Scanner tec= new Scanner(System.in);
                
        System.out.println("dato");
        B m1 = new B(tec.nextLine());
        B m2 = new B("inglés");
        B m3 = new B("fisica");
        B m4 = new B("quimica");
        B m5 = new B("artes");
        B m6 = new B("biologia");
        
        
        
        estudiante.addB(m1);
        estudiante.addB(m2);
        estudiante.addB(m3);
        estudiante.addB(m4);
        estudiante.addB(m5);
        estudiante.addB(m6);
        estudiante.imprimirB();
        
        
        
        
    }
    
}
