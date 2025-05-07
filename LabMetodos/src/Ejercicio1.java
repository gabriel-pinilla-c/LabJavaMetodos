public class Ejercicio1 {
    public static double mtAcm(double m){
        double conversion = m * 100;
        double redondeado = Math.round(conversion * 10.0) / 10.0;
        return redondeado;
    }
    public static double kgAlb(double kg){
        double conversion = kg * 2.205;
        double redondeado = Math.round(conversion * 100.0) / 100.0;
        return redondeado;
    }
    public static double faACe(double F){
        double conversion = (F * 1.8)+32;
        double redondeado = Math.round(conversion * 10.0) / 10.0;
        return redondeado;
    }

    public static void mostrarResultados(double primero, double segundo, double tercero){
        double resultado1 = mtAcm(primero);
        double resultado2 = kgAlb(segundo);
        double resultado3 = faACe(tercero);

        System.out.println("LOS RESULTADOS DE LA CONVERSION SON:");
        System.out.println(primero + " m" + " → " + resultado1 + " cm");
        System.out.println(segundo + " kg" + " → " + resultado2 + " lb");
        System.out.println(tercero + " °C" + " → " + resultado3 + " °F");

    }
}
