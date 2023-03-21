package polimorfismo;

public class Circulo extends Figura  {
   private Double radio ;
     public Double getRadio () {
        return radio ;
     }
    public void setRadio ( Double radio ) { 
     this. radio=radio ;
    }
    @Override 
    public void calcularArea () {
        
        Double area=Math.pow(radio, 2)* Math.PI;
        System.out.println(" el area del circulo es "+area );
    }

}
