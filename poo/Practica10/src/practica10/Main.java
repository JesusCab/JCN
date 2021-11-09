/*Jesus Adrian Caballero Nagaya ID.1816014*/
package practica10;

public class Main {

    public static void main(String[] args) {
     Man superHombre=new Man();
     superHombre.setNombre("Jesus");
     superHombre.setEdad("19");
     
     try{
         Man SH[]=new Man[3];
         int j[]=new int[5];
         String a[]=new String[10];
         
         for(int i=0;i<3;i++){
             SH[i]=new Man();
             SH[i].setNombre("Jesus"+Integer.toString(i));
             SH[i].setEdad("19"+Integer.toString(i));
         }
         Man[] sho =ImprimeArreglo(SH);
         ImprimeArreglo(sho);
     }catch(Exception ex){
         System.out.println(ex.getMessage());         
     }       
    }
    public static void ImprimeArreglo(Man[]m){
       for(Man n:m){
           System.out.println(n.getNombre()+" "+n.getEdad());
       } 
    }
    
}
