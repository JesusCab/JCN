package practica.pkg2;
import java.util.Scanner;
public class Practica2 {

    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int Suma,Resta,Mult,a,b;
        float Div;
    
        Calculadora Cal= new Calculadora() {};
            
        
           
        System.out.println("Ingrese la variable a:");
        a= scan.nextInt();
        System.out.println("Ingrese la variable b:");
        b=scan.nextInt();
      
        
        Suma= Cal.Suma(a, b);
        System.out.println("Suma: "+Suma);
        Resta= Cal.Resta(a, b);
        System.out.println("Resta: "+Resta);
        Div= Cal.Div(a, b);
        System.out.println("Division: "+Div);
        Mult= Cal.Mult(a, b);
        System.out.println("Multiplicacion: "+Mult);
        
    }
    
}
