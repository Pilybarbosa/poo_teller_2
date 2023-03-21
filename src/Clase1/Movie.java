package Clase1;

public class Movie {
    private  String nombre, categoria ;
     public int  duracion;
     int año ;
 

     public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public Movie (){

     }
     public Movie( String nombre){

     this.nombre=nombre;
    
     }
     
      public String getNombre(){ // get o getter 
        return nombre ;
       }

     public void setNombre( String  nombre ){ // set o setter 
        this.nombre=nombre;
     }
       
      public  void MostrarPelicula  (String nombre, String categoria, int duracion){
        System.out.println("el nombre de su pelicula es "+nombre+", la categoria de su pelicula es"+categoria+" y la duracion de la pelicula que utt escogio es "+duracion);

      }
    
     }


