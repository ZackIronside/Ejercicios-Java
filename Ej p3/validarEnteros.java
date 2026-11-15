import java.util.Scanner;

public class validarEnteros{
    Scanner sc = new Scanner(System.in);

    public int validarDat(){
        int numero = 0;
        while(true){
            System.out.println("Ecriba un numero entero: ");
            if(this.sc.hasNextInt()){
                numero = this.sc.nextInt();
                break;

            }else{
                System.out.println("El numero que ingreso no es valido, ingrese un numero entero.");
                this.sc.nextLine(); // Limpiar el buffer de entrada
            }
        }
        return numero;
    }

    public static void main(String [] args)throws Exception{
        validarEnteros ve = new validarEnteros();
        ve.validarDat();

    }
}