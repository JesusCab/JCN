/*Jesus Adrian Caballero Nagaya ID.1816014*/
package examenlabpoo;

public class Radio extends DispositivoMovil{
    private String Marca;
    private String Modelo;
    private String Color;
    private String Banda;

    public void CambiarEstacion(){
        System.out.println("La Estacion A Sido Cambiada");   
    }
    public String CambiarBanda(String Banda){
        System.out.println("Banda Anterior"+Banda);
        if(Banda=="AM"){
            Banda="FM";
        }else{Banda="AM";
        }
        System.out.println("Nueva Banda"+Banda);
     return Banda;   
    }

    public Radio(String Marca, String Modelo, String Color, String Banda) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Banda = Banda;
    }
    

    public String getMarca() {
        return Marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public String getColor() {
        return Color;
    }
    public String getBanda() {
        return Banda;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
    public void setBanda(String Banda) {
        this.Banda = Banda;
    }
    
}
