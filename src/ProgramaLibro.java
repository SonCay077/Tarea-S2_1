public class ProgramaLibro{
    public static void main(String[] args) {
        Libro l1 = new Libro();
        Libro l2 = new Libro("1984", "George Orwell", 328);

        l1.imprimirInfo();
        l2.imprimirInfo();
    }
}
