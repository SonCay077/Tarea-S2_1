public class Libro {
    String titulo;
    String autor;
    int paginas;

    Libro(){
        titulo = "Yo nunca digo adiós";
        autor = "María Fernanda Heredia";
        paginas = 221;
    }

    Libro(String titulo, String autor, int paginas){
        this.titulo =titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    void imprimirInfo(){
        System.out.println("Título: "+titulo+", Autor: "+autor+", Paginas: "+paginas);
    }
}
