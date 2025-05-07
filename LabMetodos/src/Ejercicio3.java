import java.util.Scanner;

public class Ejercicio3 {
    public static double suma(double num1, double num2){
        return num1 + num2;
    }
    public static double resta(double num1, double num2){
        return num1 - num2;
    }
    public static double mult(double num1, double num2){
        return num1 * num2;
    }
    public static double div(double num1, double num2){
        return num1 / num2;
    }
    public static double potencia(double num1, double num2){
        return Math.pow(num1, num2);
    }

    public static void operaciones(){
        Scanner scanner = new Scanner(System.in);
        String operacion;
        do {
            System.out.println("Bienvenid@ a la calculadora");
            System.out.println("Digita la operación que desas realizar (suma, resta, multiplicacion, division o potencia), o si prefieres salir escribe 'salir' ");
            operacion = scanner.nextLine();

            switch(operacion.toLowerCase()){
                case "suma":
                    System.out.println("Elegiste Suma");
                    System.out.println("Digita el primer número a sumar");
                    double sum1 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digita el segundo número a sumar");
                    double sum2 = scanner.nextDouble();
                    scanner.nextLine();
                    double resultadoSuma = suma(sum1,sum2);
                    System.out.println("El resultado es: " + resultadoSuma);
                    break;
                case "resta":
                    System.out.println("Elegiste Resta");
                    System.out.println("Digita el primer número a restar");
                    double rest1 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digita el segundo número a restar");
                    double rest2 = scanner.nextDouble();
                    scanner.nextLine();
                    double resultadoResta = resta(rest1,rest2);
                    System.out.println("El resultado es: " + resultadoResta);
                    break;
                case "multiplicacion":
                    System.out.println("Elegiste Multiplicación");
                    System.out.println("Digita el primer número a multiplicar");
                    double mult1 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digita el segundo número a multiplicar");
                    double mult2 = scanner.nextDouble();
                    scanner.nextLine();
                    double resultadoMult = mult(mult1,mult2);
                    System.out.println("El resultado es: " + resultadoMult);
                    break;
                case "division":
                    System.out.println("Elegiste División");
                    System.out.println("Digita el primer número a dividir");
                    double div1 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digita el segundo número por el cual dividir");
                    double div2 = scanner.nextDouble();
                    scanner.nextLine();
                    if(div2 == 0){
                        System.out.println("Error no se puede dividir por 0");
                    }else{
                        double resultadoDiv = div(div1, div2);
                        System.out.println("El resultado es: " + resultadoDiv);
                    }
                    break;
                case "potencia":
                    System.out.println("Elegiste Potencia");
                    System.out.println("Digita el primer número Base");
                    double pot1 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digita el segundo número Exponente");
                    double pot2 = scanner.nextDouble();
                    scanner.nextLine();
                    double resultadoPot = potencia(pot1,pot2);
                    if(pot2 == 0){
                        System.out.println("El resultado es: 1");
                    }else if(pot2 < 0){
                       double pot2posit = pot2*(-1);
                       resultadoPot = potencia(pot1,pot2posit);
                        System.out.println("El resultado es: " + (1/resultadoPot));
                    }else{
                        System.out.println("El resultado es: " + resultadoPot);
                    }
                    break;
                default:
                    System.out.println("No es una opción valida");
                    break;
            }
        }while(!operacion.equals("salir"));
        System.out.println("Gracias por utilizar la calculadora");
    }
}
