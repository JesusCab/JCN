package LenguajeRegular;
import java.util.Scanner;

public class LenguajeRegular {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad;
        boolean val,reiniciar;
        String opc;  
        do{
        System.out.println("\n\tID.1816014\tiniciales.jacn\n\tIntroduzca una cadena en el lenguaje regular(esta debe contener matricula y luego iniciales): ");    
        cad=sc.nextLine();
        Validacion val1 = new Validacion();
        val = val1.validar(cad);
        if(val == true)System.out.println("La expresion "+cad+" es valida");
        if(val == false)System.out.println("La expresion "+cad+" no es valida");
          do{
            System.out.println("¿Desea ingresar otra cadena? [1]Si ,[2]No");
            opc=sc.nextLine();  
            reiniciar = val1.pedircadenaotravez(opc);
            } while(reiniciar == false);
        }while("1".equals(opc));  
    }
    
    
}
    
