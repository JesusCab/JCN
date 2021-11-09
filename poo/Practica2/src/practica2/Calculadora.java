/*Jesus Adrian Caballero Nagaya ID.1816014*/
package practica2;


public class Calculadora implements ICalculadora {
    float a; float b;
    public Calculadora(float a, float b){
        this.a=a;
        this.b=b;
    }
    public float Suma(float a,float b){
        return a+b;
    }
    public float Resta(float a,float b){
        return a-b;
    }
    @Override
    public float Mult(float a,float b){
        return a*b;
    }
    @Override
    public float Div(float a,float b){
        return a/b;
    }
    
}
