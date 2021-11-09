/*JesusAdrianCaballero Nagaya ID.1816014*/
package practica10;

public class Man extends SuperMan{

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    protected String Edad,Nombre;
    public Man(){}
    
    public String Caminar(){
        return ("caminar");
    }
    public String correr(){
        return("Corre");
    }
    @Override
    public String SuperFuerza(){
        return("Hombre con super fuerza");
    }
    
    
    
    
    
}
