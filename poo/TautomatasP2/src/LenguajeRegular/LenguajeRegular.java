package LenguajeRegular;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class LenguajeRegular {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad;
        boolean val,reiniciar;
        String opc;  
        char []Arraycadena;
        char caracter;
        int contador;
        do{
       //014jacnjacn014014014 System.out.println("\n\n\tID.1816014\tIniciales.JACN\tIniInv.NCAJ\tapellido:CABALLERO\n\n\n\tIntroduzca una cadena en el lenguaje regular(esta debe contener matricula,luego iniciales\n\t,seguido apellido y al final inicales inversa el doble de veces que introdujo iniciales): ");    
        cad=sc.nextLine();
        Arraycadena=cad.toCharArray();
        ValidacionN val1 = new ValidacionN();
        val = val1.validarF(cad);
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
    
