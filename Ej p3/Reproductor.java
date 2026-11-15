public class Reproductor {
    String cancion = "";
    public boolean reproduciendo = false;

    public void reproducir(String cancion){
        this.cancion = cancion;
        this.reproduciendo = true;
    }

    public void pausar(){
        this.reproduciendo = false;
    }

    public void estado(){
        if(reproduciendo == false){
            System.out.println("Pausado");

        }else{
            System.out.println("Reproduciendo ahora: " + this.cancion);
        }
    }

    public static void main(String [] args)throws Exception{
        Reproductor rp = new Reproductor();

        //reporduciendo cancion
        rp.reproducir ("Morgana - Lord of the Lost");
        rp.estado();

        //Pausando cancion
        rp.pausar();
        rp.estado();
    }
}
