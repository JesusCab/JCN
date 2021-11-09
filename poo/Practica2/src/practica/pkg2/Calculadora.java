package practica.pkg2;

import java.util.Scanner;

public abstract class Calculadora implements Calculadora2{
     Scanner scan= new Scanner(System.in);
    public int Suma(int a,int b){
        int c=a+b;
        return c;
    }
    public int Resta(int a,int b){
        int c=a-b;
        return c;
    }
    
     @Override
        public float Div(float a, float b) {
        return a/b;
      }
        

    @Override
        public int Mult(int a, int b) {
        return a*b;
      }
        
    
     
}
