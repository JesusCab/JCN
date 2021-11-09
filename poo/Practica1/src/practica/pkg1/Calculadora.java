
package practica.pkg1;
import java.util.Scanner;

public class Calculadora {
    Scanner Sc = new Scanner(System.in);
    public int Suma(int a,int b){
       int c=a+b;
       return c;
    }
    public int Resta(int a,int b){
        int c=a-b;
        return c;
    }
    public int Mult(int a, int b){
        int c=a*b;
        return c;
    }
    public int Div(int a,int b){
        return a/b;
    }
    
    
    
}
