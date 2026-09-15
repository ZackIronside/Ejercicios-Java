import java.util.Scanner;

public class Tarea3 {

    //EJERCICIO 1. Saludo
    public void saludo(){
        Scanner tecsaludo = new Scanner( System.in); 
        String nombre;
        System.out.println( "Hola bienvenido, ingresa tu nombre por favor: ");
        nombre = tecsaludo.nextLine();

        while(nombre.trim().isEmpty()){
            System.out.println("El nombre no puede estar vacío, por favor ingresa tu nombre: ");
            nombre = tecsaludo.nextLine();
        }
        System.out.println("Hola bienvenido " + nombre );

    }


    //EJERCICIO 2. Área y perímetro de un rectángulo
    public void arearec(){
        Scanner rectangulo = new Scanner (System.in);
        double base, altura, area, perimetro;

        System.out.println("Ingrese la base del rectángulo en cm: ");
        base = rectangulo.nextDouble();
        System.out.println( "Ingrese la altura del rectángulo en cm: ");
        altura = rectangulo.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);
        System.out.println("El área del rectángulo es: " + area + " cm²");
        System.out.println("El perímetro del rectángulo es: " + perimetro + " cm");
    }

    //EJERCICIO 3. Hipotenusa de un triángulo rectángulo
    public void hipotenusa(){
        Scanner hipo = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa, a, b;
        System.out.println("Ingrese el valor del primer cateto: ");
        cateto1 = hipo.nextDouble();
        System.out.println("Ingrese el valor del cateto opuesto: ");
        cateto2 = hipo.nextDouble();

        a = cateto1 * cateto1;
        b = cateto2 * cateto2;
        hipotenusa = Math.sqrt(a + b);
        System.out.println ( "La hipotenusa del trianguylo es " + hipotenusa);
    }


    //EJERCICIO 4. Operaciones matemáticas
    public void operaciones(){
        double num1, num2, suma, resta, multiplicacion, division;
        Scanner op = new Scanner (System.in);
        System.out.println("Ingrese el primer numero por favor: "); 
        num1 = op.nextDouble(); 
        System.out.println("Ingrese el segundo numero por favor: ");
        num2 = op.nextDouble();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
    }


    //EJERCICIO 5. Conversión de Fahrenheit a Celsius
    public void conversion(){
        Scanner temp = new Scanner (System.in);
        double fahrenheit, celsius;
        System.out.println("Ingrese la temperatura en Fahrenheit: ");
        fahrenheit = temp.nextDouble();
        celsius = (fahrenheit -32) *5/9;
        System.out.println("La conversion de Fahrenheit a celsius es: " + celsius);
    }


    //EJERCICIO 6. Media de tres números
    public void media(){
        Scanner mid = new Scanner (System.in);
        double num1, num2, num3, mediaAritmetica;

        System.out.println("Ingrese el primer numero: ");
        num1 = mid.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = mid.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        num3 = mid.nextDouble();

        mediaAritmetica = (num1 + num2 + num3) / 3;
        System.out.println("La media aritmetica de los tres numeros es: " + mediaAritmetica);
    }


    //EJERCICIO 7. Conversión de minutos a horas
    public void convermin(){
        Scanner minut = new Scanner (System.in);
        int minutos, horas, resultado;

        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = minut.nextInt();

        horas = minutos / 60;
        resultado = minutos % 60;

        System.out.println(minutos + " minutos son equivalentes a " + horas + " horas y " + resultado + " minutos.");
    }


    //EJERCICIO 8. Sueldo y comisión
    public void sueldocomision(){
        Scanner suel = new Scanner (System.in);
        double sueldoBase, ventas, comision, sueldoTotal;

        System.out.println("Bienvenido, ingrese su sueldo base por favor: ");
        sueldoBase = suel.nextDouble();
        System.out.println("Ingrese el monto total de sus ventas: ");
        ventas = suel.nextDouble();

        comision = ventas * 0.10;
        sueldoTotal = sueldoBase + comision;

        System.out.println("La comisión obtenida de sus ventas es: $" + comision);
        System.out.println("El sueldo total es: $" + sueldoTotal);
    }


    //EJERCICIO 9. Descuento en una compra
    public void descuento(){
        Scanner descuent = new Scanner(System.in);
        double precio, descuento, preciofinal;
        System.out.println("Ingrese el precio del producto por favor: ");
        precio = descuent.nextDouble();
        descuento = precio * 0.15;
        preciofinal = precio - descuento;
        System.out.println("El descuento es: $" + descuento);
        System.out.println("El precio final es: $" + preciofinal);
    }


    //EJERCICIO 10. Calificación final
    public void calificacionfinal(){
      Scanner entrada = new Scanner(System.in);
      double parcial1, parcial2, parcial3, examenFinal, trabajoFinal, promedioParciales, calificacionFinal;
        
        System.out.print("Ingresa la primera calificación parcial: ");
        parcial1 = entrada.nextDouble();
        System.out.print("Ingresa la segunda calificación parcial: ");
        parcial2 = entrada.nextDouble();
        System.out.print("Ingresa la tercera calificación parcial: ");
        parcial3 = entrada.nextDouble();
        System.out.print("Ingresa la calificación del examen final: ");
        examenFinal = entrada.nextDouble();
        System.out.print("Ingresa la calificación del trabajo final: ");
        trabajoFinal = entrada.nextDouble();

        promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
        calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);

        System.out.println("\nPromedio de parciales: " + promedioParciales);
        System.out.println("Calificación final: " + calificacionFinal);
    }

    //Metodo para ejecutar la clase
    public static void main(String[] args) throws Exception{

        //Ejercicio 1. Saludo
        Tarea3 sald = new Tarea3();
        sald.saludo();

        //EJERCICIO 2. Área y perímetro de un rectángulo
        Tarea3 arrec = new Tarea3();
        arrec.arearec();

        //EJERCICIO 3. Hipotenusa de un triángulo rectángulo
        Tarea3 hip = new Tarea3();
        hip.hipotenusa();

        //EJERCICIO 4. Operaciones matemáticas
        Tarea3 operaciones = new Tarea3();
        operaciones.operaciones();

        //EJERCICIO 5. Conversión de Fahrenheit a Celsius
        Tarea3 conversion = new Tarea3();
        conversion.conversion();

        //EJERCICIO 6. Media de tres números
        Tarea3 medium = new Tarea3();
        medium.media();

        //EJERCICIO 7. Conversión de minutos a horas
        Tarea3 hormin = new Tarea3();
        hormin.convermin();

        //EJERCICIO 8. Sueldo y comisión
        Tarea3 comisi = new Tarea3();
        comisi.sueldocomision();

        //EJERCICIO 9. Descuento en una compra
        Tarea3 desc = new Tarea3();
        desc.descuento();

        //EJERCICIO 10. Calificación final
        Tarea3 calfin = new Tarea3();
        calfin.calificacionfinal();
        

    }

}