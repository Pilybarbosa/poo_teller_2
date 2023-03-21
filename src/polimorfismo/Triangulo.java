package polimorfismo;

public class Triangulo extends Figura  {
    public float  altura, base ;


    public float getAltura () {
        return altura ;
    }

    public void setAltura (float altura) {
        this.altura=altura ;
    }

    public float getBase () {
        return base ;
    }

    public void setBase ( float base ){
        this.base=base ; 
    }
    @Override 

    public void calcularArea(){
       float  area=(base*altura)/2;
       System.out.println("el area de su triangulo es "+area );

    }
}
