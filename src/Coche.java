public class Coche
    {
        String marca;
        int anio;

        Coche(){
            marca = "Toyota";
            anio = 2020;
        }

        Coche(String marca, int anio){
            this.marca = marca;
            this.anio = anio;
        }
        void mostrarInfo(){
            System.out.println("Marca: "+marca);
            System.out.println("Anio: "+anio);
        }
}
