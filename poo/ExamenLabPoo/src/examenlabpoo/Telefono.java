/*Jesus Adrian Caballero Nagaya ID.1816014*/
package examenlabpoo;

public class Telefono extends DispositivoMovil{
    private float Precio;
    private String Marca;
    private String Modelo;

    public void hacerllamada(){
        System.out.println("llamada En Progreso");  
    }
    public void colgarllamada(){
        System.out.println("llamada Finalizada");
    }

    public Telefono(float Precio, String Marca, String Modelo) {
        this.Precio = Precio;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    
    public float getPrecio() {
        return Precio;
    }
    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
}
