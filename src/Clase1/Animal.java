package Clase1;

import java.util.Scanner;

public class Animal {
    
       private  String nombre;
        public int edad ;

      // metodo constructor 
        public Animal() {// constructor vacio o por defecto 
        }

        public Animal(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;

        }   //el metodo get siempre genera un valor de retorno 
          public int getEdad(){
            return edad ;
          }
          // 
          public void  setEdad(int edad ){ // metodo set o setter 
            this.edad=edad; 
          }
          public String  getNombre(){ // metodo get o getter 
            return nombre ;

          }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Animal(String nombre, String tipo){
            this.nombre=nombre;
            this.tipo=tipo;
        }

        Scanner lectura= new Scanner(System.in);
    public void registrarAnimal() {
        System.out.println("ingrese el nombre del animal");
        nombre=lectura.next();

        System.out.println("ingrese la edad del anmal ");
        edad=lectura.nextInt();

    
    }

    public void mostrarAnimal(){
        System.out.println("el nombre del animal es "+nombre+" y su edad es "+edad);
        
    }
}