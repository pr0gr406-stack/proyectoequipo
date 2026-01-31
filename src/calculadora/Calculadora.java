package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa opcion: ");
        int a = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int b = sc.nextInt();
        
      Suma suma = new Suma();
        
      System.out.println("La suma es "+suma.calculadora(a,b));
        
    }
    
}
