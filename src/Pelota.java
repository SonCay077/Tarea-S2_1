public class Pelota {
    String color;
    String tamaño;

    Pelota(String color, String tamaño){
        this.color = color;
        this.tamaño = tamaño;
    }

    void mostrarDetalles() {
        System.out.println("Color: " + color + ", Tamaño: " + tamaño);
    }
}
