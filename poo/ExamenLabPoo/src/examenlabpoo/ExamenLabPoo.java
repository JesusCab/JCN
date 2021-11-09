/*Jesus Adrian Caballero Nagaya ID.1816014*/
package examenlabpoo;

public class ExamenLabPoo {

    public static void main(String[] args) {
        float Precio;
        String Marca;
        String Modelo;
        String Color;
        String Banda="AM";
        int i;
        Telefono tel[] = new Telefono[3];
        Radio rad[] = new Radio[3];
        
        for(i=0;i<3;i++){
            System.out.println("Telefono["+i+"]");
            tel[i]=new Telefono(999,"samsung","A7");
            tel[i].Apagar();
            tel[i].Encender();
            tel[i].hacerllamada();
            tel[i].colgarllamada();
            System.out.println("Radio["+i+"]");
            rad[i]= new Radio("cat","AC121","Negro",Banda);
            rad[i].Apagar();
            rad[i].Encender();
            rad[i].CambiarEstacion();
            rad[i].CambiarBanda(Banda);
        }
        
        
        
        
        
        
        
    }   

}
