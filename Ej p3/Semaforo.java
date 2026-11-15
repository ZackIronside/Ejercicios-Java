public class Semaforo {

    //Atributo ppor defecto
    public String color = "rojo";

    public void cambiarRojol(){
        this.color ="rojo";
    }

    public void cambiarAmarillo(){
        this.color = "amarillo";
    }

    public void cambiarVerde(){
        this.color = "verde";
    }

    //metodo que sera el encargado de imprimir el color
    public String mostrarColor(){
        return this.color;
    }
    
    public static void main(String[] args)throws Exception {
        Semaforo estado = new Semaforo(); 

        //Estado en rojo
        estado.cambiarRojol();
        System.out.println("El semaaforo esta en: " + estado.mostrarColor());

        //Estado en amarillo
        estado.cambiarAmarillo();
        System.out.println("El semaaforo esta en: " + estado.mostrarColor());
        
        //Estado en verde
        estado.cambiarVerde();
        System.out.println("El semaaforo esta en: " + estado.mostrarColor());


    }
}
