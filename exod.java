import java.util.Scanner;
public class exod{


    public double valor1 = 0;
    public double valor2 = 0;
    public int opcion = 0;


    public double sumar(double valor1, double valor2){
        return valor1 + valor2;
    }

    public double restar(double valor1, double valor2){
        return valor1-valor2;
    }

    public double multiplicar( double valor1, double valor2){
        return valor1*valor2;
    }

    public double dividir(double valor1, double valor2){
        return valor1/valor2;
    }

    public void obtenrInformacion(){
        Scanner teclad = new Scanner(System.in);
        System.out.println("Bienvenido, que desas hacer?");
        System.out.println("1 - sumar, 2 - restar, 3 - multiplicar, 4 - dividir");
        this.opcion = teclad.nextInt();

        //Ingrsar los valores por teclado
        System.out.println("Ingresa el valor 1");
        this.valor1 = teclad.nextDouble();
        System.out.println("Ingresa el valor 2: ");
        this.valor2 = teclad.nextDouble();
    }

    public void ejecutar(){
        //Deentro del parametro leera la opcion ingresada por teclado y en base a la opcion, bnosotros tendremos acceso al caso segun siu opcion.
        this.obtenrInformacion();
        switch(opcion){
            case 1:
                System.out.println("La suma es " + this.sumar(this.valor1, this.valor2));
                break;
            case 2:
                System.out.println("La resta es " + this.restar(this.valor1, this.valor2));
                break;
            case 3:
                System.out.println("La multiplicacion es " + this.multiplicar(this.valor1, this.valor2));
                break;
            case 4:
                System.out.println("La division es " + this.dividir(this.valor1, this.valor2));
                break;
            default:
                System.out.println("No es una opcion valida");
                break;
        }

    }
    public static void main(String[] args)throws Exception{
        exod ex = new exod();
        ex.ejecutar();
    }
}