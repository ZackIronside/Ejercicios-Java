
public class practicaRecur{

    //Suma de números del 1 al N
    public int sumar(int n){
        //Si n es 1 o menor, no hay mas que sumar
        if(n<=1){
            return n;
        }
        //Caso recursivo: n + sumar(n-1)
        return n + sumar(n-1);
    }


    //Fibonacci
    public int fibonacci(int n){
        //caso base: si n es 0 o 1, devolvemos n
        if (n <= 1){
            return n;
        }
        //Caso recursivo: suma de los dos términos anteriores
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    //Potencia
    public int potencia(int base, int exponente){
        //Caso base: cualquier numero elevadop a 0 es 1
        if (exponente ==0){
            return 1;
        }
        //Caso recursivo: base * potencia(base, exponente-1)
        return base * potencia(base, exponente -1);
    }


    //Recorrer un String al revés
    public String invertir(String cadena){
        //Caso base: Si la cadena se encuentra bacia se devuelve de la misma manera
        if (cadena.isEmpty()){
            return cadena;
        }
        //Caso recursivo:Toma desde el segundo carácter en adelante y le pega el primero al final
        return invertir(cadena.substring(1)) + cadena.charAt(0);
    }

    //Metodo main para ejecutar el programa
    public static void main(String[] args)throws Exception{
        practicaRecur ej = new practicaRecur();

        //Suma de números del 1 al N
        System.out.println(ej.sumar(5));

        //Fibonacci recursivo
        System.out.println(ej.fibonacci(4));

        //Potencia
        System.out.println(ej.potencia(5, 3));

        //Invertir cadena
        System.out.println(ej.invertir("astaroth"));
    }
}