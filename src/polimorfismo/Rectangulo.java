package polimorfismo;

public class Rectangulo {
     private float largo, ancho ;
    public float getLargo () {
        return largo;
    }
    public void setLargo( float largo ) {
        this.largo=largo;
    }
    public float getAncho() {
        return ancho ;
    }
    public void setAncho (float ancho ){
      this.ancho=ancho ;
    }
    @Override 
    public void calcularArea () {
        float area=(largo*ancho);
        System.out.println(" el area de su rectangulo es "+area );
    }

}
