package Clase1;

public class Ave  extends Animal {
    private String envergadura ;
     //metodos getter y setter 
     public String  getEnvergadura () { 
        return envergadura;
     }

     public  void   setEnvergadero (String envergadura){
      this.envergadura=envergadura;
     }
     // metodo constructor 
     public Ave (){}
     public Ave (String nombre, int edad,String envergadura ){
        super(nombre,edad);
        this.envergadura=envergadura;
     }
      // metodo 
     public void MostrarAve( String envergadura) {
    System.out.println("el nombre del ave es "+nomgetNombre()", la edad del ave es "+edgetEdad()" y su envergatura es "+egetEnvergadura());
     }
}
