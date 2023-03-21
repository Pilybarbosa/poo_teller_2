package Clase1;

public class Prueba {
    public static void main(String[] args) {
         Animal guacamayo= new Animal();
         Movie up = new Movie("up");
         Animal panda=new Animal();
         Movie LaNocheDelDemonio= new Movie("LaNocheDelDemonio");
   Movie sena = new Movie("sena");

         
         guacamayo.setEdad(12);
         guacamayo.setNombre("patata");
         guacamayo.registrarAnimal(); // invocar o llamar metodo 
         guacamayo.mostrarAnimal();
   System.out.println("la edad  de guacamayo es "+guacamayo.getEdad()+" y el nombre del guacamayo es "+guacamayo.getNombre());
         int duplicado=guacamayo.duplicarEdad(edad);
         System.out.println("la edad duplicada del animal es "+duplicado);
    }
}
