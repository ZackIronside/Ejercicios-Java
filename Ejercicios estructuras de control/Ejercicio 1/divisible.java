import java.util.Scanner;

public class divisible{
    public static void main(String[] args) {
        Scanner pollo = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = Integer.parseInt(pollo.nextLine());
        if (num1%2 == 0){
            System.out.println("El numero si es divisible");
        }
        else {
            System.out.println("El numero no es divisible");
        }
    }
}