package senasalud;

import java.util.Scanner;

public class Senasalud {
    
    public static void main(String[] args) {
        String nombre;
        Scanner n = new Scanner(System.in);
        System.out.println("digite su nombre");
        nombre= n.next();
        System.out.println("su nombre es:"+nombre);
        
        
        String as;
        Scanner no = new Scanner(System.in);
        System.out.println("ingrese su apellido");
        as= no.next();
        System.out.println("su apellido es:"+as);
        
        
        int aso;
        Scanner nin = new Scanner(System.in);
        System.out.println("ingrese un numero");
        aso = nin.nextByte();
        
        for (int i = 0; i <= 10; i++) {
            int m=aso*i;
            System.out.println(aso+" x "+i+" = "+m);
        }

        
             
        
    }
    
}
