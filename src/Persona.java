public class Persona {
    String nombre;
    String apellido;
    int edad;
    Double estatura;

    public void presentarse() {
        System.out.println("Hola, me llamo " + nombre +" "+ apellido + ", tengo " + edad + " años, y mido " + estatura + "m.");

    }
}