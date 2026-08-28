import java.util.Scanner;

public class precio{
    public static void main(String[] args){
        Scanner pollo = new Scanner(System.in);
        //El System.in es infroamcion del constructor de la clase Scanner.
        final double IVA = 0.21; 
        System.out.print("Hola bienvenido, ingrese el precio del producto: ");
        double precio = Double.parseDouble(pollo.nextLine());
        double precioFinal = precio + (precio * IVA); // Se calcula el impuesto aplicando el IVA al precio ingresado
        System.out.println("El precio del producto es:" + precio + "Y se le a agregado un impuesto de "+ IVA + "%");
        System.out.println("El total a pagar es de $" + precioFinal);
    }
}
