/*Jesus ADrian Caballero Nagaya ID.1816014 */
package practica.pkg11;

public class Practica11 {

    public static void main(String[] args) {
      Funciones f = new Funciones();
     int j = f.convStr2Int("155");
      System.out.println("Funcion String 2 Int: "+j);
     int l = f.StrLong("laboratorio");
        System.out.println("Funcion Longitud: "+l);
      
     
        String[] c = {"java","perro","lanix","lunix","carton","mochila","Carlos","Trompetas","Network","Pepe"};
        String[] b = f.containsStr(c);
        for(String a: b){
        System.out.println(a);
        }
    }
    
}
