/*Jesus Adrian Caballero Nagaya ID.1816014*/
package transporte;

public class Autobus extends ATransporte implements ITransporte{
   
    /**
     * @return the gasolina
     */
    int getGasolina() {
        return gasolina;
    }

    /**
     * @param gasolina the gasolina to set
     */
    void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
    protected int gasolina;
    
     public Autobus(){
        System.out.println(EncenderMotor(this.gasolina));
    }
    public Autobus(int gasolina){
        this.gasolina = gasolina;
        System.out.println(this.EncenderMotor(gasolina));
        this.EncenderMotor(gasolina);
    }
    
    
   
    public String EncenderMotor(int gasolina) {
        if (gasolina > 1){
        return "Autobus Encendido";
        }else return "Autobus no enciende";
    }

    @Override
    public String SistemaFrenos() {
        return "Autobus Frenando";
    }

    @Override
    public String SistemaConducir() {
        return "Autobus Conduciendo";
    }

    @Override
    public String Acelerar() {
    return "Autobus Acelera";
    }

   
   
    
    
}
