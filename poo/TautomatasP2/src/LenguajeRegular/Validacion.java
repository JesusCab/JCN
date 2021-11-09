package LenguajeRegular;

public class Validacion {

public boolean validar(String texto){
   
    boolean regex = texto.matches("1816014[(a-z)(0-9)]*jacn[(a-z)(0-9)]*[.]$");
    
    return regex;
    
}

public boolean pedircadenaotravez(String texto){
   
    boolean regex = texto.matches("^[1-2]$");
    
    return regex;
    
}



    
}
