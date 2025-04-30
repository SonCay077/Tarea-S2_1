public class Pelota {
    String color;
    String tamanio;

    Pelota(String color, String tamanio){
        this.color = color;
        this.tamanio = tamanio;
    }

    void mostrarDetalles() {
        System.out.println("Color: " + color + ", Tamaño: " + tamanio);
    }
}
