public class numDiv {

    public static void main(String[] args) {
        for (int i=1; i <= 100; i++) {
            if (i%2 == 0|| i%3 == 0){
                System.out.println(i + " es divisible por 2 o 3");
            }
            else {
                System.out.println( i + " no es divisible" );
            }
        }//Si el programa identifica un numero que sea divisible entrre 2 o 3, se marcara en el conteo.
    }
}