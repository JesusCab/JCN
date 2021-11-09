/*Jesus Adrian Caballero Nagaya ID.1816014*/
package practica.pkg1;
import java.util.Scanner;
public class Practica1 {

    public static void main(String[] args) {
        int Suma,Resta,Mult,Div,a,b;
        Scanner Sc =new Scanner(System.in);
        Calculadora Cal=new Calculadora();
        System.out.println("Introduce un numero a:");
        a=Sc.nextInt();
        System.out.println("Introduce un numero b:");
        b=Sc.nextInt();
        
        Suma = Cal.Suma(a, b);
        Resta= Cal.Resta(a, b);
        Mult= Cal.Mult(a, b);
        Div= Cal.Div(a, b);
        
        System.out.println("suma:"+Suma);
        System.out.println("Resta:"+Resta);
        System.out.println("Multiplicacion:"+Mult);
        System.out.println("Division:"+Div);
    }
    
}
