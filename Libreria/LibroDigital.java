public  class LibroDigital extends Libro {
    public String formato;
    public double tamañoArchivo;

    public LibroDigital(String titulo, String autor, int año, String formato, double tamañoArchivo) {
        super(titulo, autor, año);
        this.formato = formato;
        this.tamañoArchivo = tamañoArchivo;
    }

    public void mostrarDatos(){
        System.out.println("Título del libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + año);
        System.out.println("Formato: " + formato);
        System.out.println("Tamaño del archivo: " + tamañoArchivo + " MB");
    }
}
