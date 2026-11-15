import java.util.Scanner;
import java.util.Locale;
public class areaCirculo {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    public double numero1 = 0;
    public double resultado = 0;
    public double validaBoolean(){

        while(true){
            //En este espacio no poner nada
            System.out.println("Bienvenido, calcularemos el area de un circulo, solo ingresa el radio por favor: ");
            if(this.sc.hasNextDouble()){
                numero1 = this.sc.nextDouble();
                break;
            }else{
                System.out.println("No es un numero valido, intente de nuevo.");
                this.sc.nextLine();
            }
        }
        return numero1;
    }

    public void calculo(){
        //pi por radio al cuadrado 
        double resultado = Math.pow(this.numero1, 2);
        double total = 3.1416*resultado;
        System.out.println("El resultado del area del circulo es: "+ total);
    }

    public static void main(String[] args)throws Exception {
        areaCirculo app = new areaCirculo();
        app.validaBoolean();
        app.calculo();
    }
    
}
