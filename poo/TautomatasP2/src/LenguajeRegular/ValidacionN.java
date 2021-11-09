package LenguajeRegular;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidacionN {
    
    public boolean validarN(String texto){
       String reg="(1816014)*(jacn)*(caballero)*(ncajncaj)";
       String ini= "JACN";
       String inv="NCAJNCAJ";
       String m="1816014";
       String j="CABALLERO";
       
    Pattern patt = Pattern.compile(ini);
    Matcher mat = patt.matcher(texto);
    int w=0,wI=0;
    while(mat.find()){
        w++;}
    Pattern patt2 =Pattern.compile(inv);
    Matcher mat2 = patt2.matcher(texto);
    while(mat2.find()){
        wI++;}
    boolean iniciales;
    if(w==wI){
    iniciales=true;}
    else{
        iniciales=false;}    
   // System.out.println(""+iniciales);
    String regaux;
    int i;
    w=w-1;
    for(i=1;i<=w;i++){
    ini=ini.concat("JACN");
    inv=inv.concat("NCAJNCAJ");
    }
    String M="("+m+"[A-Z])\\w+";
    boolean regM=texto.matches(M);
        System.out.println("Matricula: "+regM);
   String iniV="(\\d+"+ini+"[A-Z])\\w+";
   boolean regI=texto.matches(iniV);
        System.out.println("Iniciales:"+regI);
   String ape="(\\d+\\w+"+j+"[A-Z])\\w+";
    boolean regA=texto.matches(ape);
    System.out.println("Apellido:"+regA);
    String invV="(\\d+\\w+"+inv+")";
    boolean regIV=texto.matches(invV);
    System.out.println("InversaIni:"+regIV); 
    
    regaux ="("+m+")+("+ini+")+("+j+")+("+inv+")$";    
        boolean regex=texto.matches(regaux);
       regex=regex&&iniciales;
        return regex;}
    
    
    public boolean pedircadenaotravez(String texto){
   
    boolean regex = texto.matches("^[1-2]$");
    
    return regex;
    
    }
    
    
}
