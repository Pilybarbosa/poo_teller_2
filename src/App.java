import Clase1.Animal;
import Clase1.Avatar;
import Clase1.Ave;
import Clase1.Movie;
public class App {
    public static void main(String[] args) throws Exception{
     Animal tigre = new Animal();
     Movie minios = new Movie ();
     Movie avatar = new Movie();
     Ave condorito = new Ave();
    

     // categoria animal hijo ave 
     condorito.getEdad();
     condorito.getEnvergaduro();
     condorito.getNombre();
     condorito.setEdad(9);
     condorito.setEnvergadero("camilo no se copie ");
     condorito.setNombre("pepe el heladero ");


     // categoria movie atributo avatar 
     avatar.getCategoria();
     avatar.getAño();
     avatar.getDuracion();
     avatar.getNombre();
     avatar.setCategoria("accion");
     avatar.setAño(2005);
     avatar.setDuracion(200);
     avatar.setNombre("feo");
    }
    }
// nombre categoria duracion año 
