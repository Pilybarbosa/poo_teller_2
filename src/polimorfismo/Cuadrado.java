package polimorfismo;

public class Cuadrado extends Figura{
    private float  lado ; // atributo encampusaldo 

    //Metodo accesores getter y setter 
    public float getLado () {
        return lado;
    }
       public void setLado ( float lado) {
        this.lado=lado;
       }
    // sobre escritura 
    @Override 
    public void calcularArea() {
        // ES AREA DEL CUADRADO 
        float area=lado*lado;
        System.out.println("el lado del cuadrado es "+lado+" y el area es "+area);
    }
}
