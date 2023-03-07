package Principal;

import salud.Persona; 
public class Inicio {
    public static void main(String[] args) {
        Persona leer= new Persona();
        leer.pedirDatos();
        leer.mostrarPersona();
        leer.calacularlmc();
        leer.mayorEdad();
    }
}
