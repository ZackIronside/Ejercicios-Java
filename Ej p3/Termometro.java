public class Termometro {
    public double temperatura = 0.0;

    public double subir(double grados){
        this.temperatura += grados;
        return this.temperatura;
    }

    public double bajar(double grados){
        this.temperatura -= grados;
        return this.temperatura;
    }

    public void mostrarTemperatura(){
        System.out.println("La temperatura es: " + this.temperatura + "°C");
    }

    public static void main(String [] args)throws Exception{
        Termometro t = new Termometro();
        t.subir(8.0);
        t.bajar(3.0);
        t.mostrarTemperatura();
    }
}
