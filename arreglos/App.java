import java.util.Arrays;
import java.util.Scanner;
public class App{


    //Ejercicio 1. Mostrar los elementos de un arreglo
    public void Ej1(){
        int[] arreglo1 ={1,2,3,4,5,};
        for (int i=0; i<arreglo1.length; i++){
            System.out.println("El posicion es: "+ i + " y su valor es: "+ arreglo1[i]);
        }
    }


    //Ejercicio 2. Calcular la suma y el promedio
    public void arrer10(){
        int [] arreglo10 = {1,2,3,4,5};
        int arreglo10suma =0;
        for(int i=0; i< arreglo10.length; i++) {
            arreglo10suma += arreglo10[i];
        }
        System.out.println("La suma de los elementos es: " + arreglo10suma);
        double promed = arreglo10suma / 5.0;
        System.out.println("El promedio del arreglo es"+ promed);
    }


    //Ejercicio 3. Encontrar el número mayor
    public void arrer8(){
        int [] arreglo8 = {1,2,3,4,5,6,7,8};
        int mayor = arreglo8[0];
        for( int i=0; i< arreglo8.length; i++){
            if(arreglo8[i] > mayor){
                mayor = arreglo8[i];
            }
        }
        System.out.println("El numero mayor del arreglo es: "+ mayor);
    }


    //Ejercicio 4. Buscar un número
    public void serchnum(){
        int [] arreglo9 = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero a buscar: ");
        int num = sc.nextInt();
        boolean encontrado = false;
        for(int i=0; i<arreglo9.length; i++){
            if(arreglo9[i] == num){
                System.out.println("El numero "+ num + " fue encontrado en la posicion: "+ i);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("El numero "+ num + " no fue encontrado en el arreglo.");
        }
    }



    //Ejercicio 5. Contar números pares e impares
    public void allinone(){
        int [] arrerall= {92, 8 ,40, 95, 6, 7, 1, 24, 3, 69};
        int cantipar = 0;
        int cantimpar = 0;
        for (int i=0; i<arrerall.length; i++){
            if(arrerall[i] %2 == 0){
                cantipar++;
            } 
            else {
                cantimpar++;
            }
        }
    System.out.println("Cantidad de valores dentro del arreglo " + Arrays.toString(arrerall));
    System.out.println("Cantidd de numeros pares: " + cantipar);
    System.out.println("Cantiadad de numeros impares: " + cantimpar);
    }


//Metodo para ejecuatar la clase 
        public static void main(String[] args)throws Exception{

            //Ejecucion, ejrcicio 1
            App onep1 = new App();
            onep1.Ej1();

            //Ejecucion, ejercicio 2
            App pollo = new App();
            pollo.arrer10();

            //Ejecucucion ejercicio 3
            App ar8 = new App();
            ar8.arrer8();

            //Ejecucion ejercicio 4
            App ar9 = new App();
            ar9.serchnum();

            //Ejecucion ejercicio 5
            App ar5 = new App();
            ar5.allinone();
    }
}