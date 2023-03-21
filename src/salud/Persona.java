package salud;

import java.util.Scanner;


public class Persona {
    Scanner leer= new  Scanner(System.in);
    String tipoDocumento, nombre, apellido, sexo;
    int edad, peso, estatura, documento, pesoActual, mayorEdad;
    public void pedirDatos () {
        System.out.println("ingrese su tipo de documento ");
        tipoDocumento=leer.next();
        System.out.println("ingrese su  documento ");
        documento=leer.nextInt();
        System.out.println("ingrese su nombre  ");
        nombre=leer.next();
        System.out.println("ingrese su apellido  ");
        apellido=leer.next();
        System.out.println("ingrese su tipo de genero  ");
        sexo=leer.next();
        System.out.println("ingrese su peso ");
        peso=leer.nextInt();
        System.out.println("ingrese su estatura ");
        estatura=leer.nextInt();
        System.out.println("ingrese su edad ");
        edad=leer.nextInt();

    }
   public void mostrarPersona () {
    System.out.println("su tipo de documento es "+tipoDocumento);
    System.out.println("su documento es "+documento);
    System.out.println("su nombre es "+nombre);
    System.out.println("su apellido es "+apellido);
    System.out.println("su genero es "+sexo);
    System.out.println("su peso  es "+peso);
    System.out.println("su estatura es"+estatura);
    System.out.println("su edad es "+edad);

   }   
   public void calacularlmc () {
    pesoActual=(peso/estatura)^2;
      if (pesoActual<20) {System.out.println("su peso esta por debajo del peso promedio ");
    
    }   else  
      if (pesoActual>=20 || pesoActual<=25) { System.out.println("utt tiene un peso valanciado");
    
    }  else 
      if (pesoActual>25) {System.out.println("utt se encuenta en sobre peso ");
    
    }
        }
    public void mayorEdad (){
        if (edad>=18) { System.out.println("utt es mayor de edad ");
            
        }  else { System.out.println("utt no es mayor d edad ");
    
    }
        }
            }
