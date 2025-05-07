public class Ejercicio2 {
    public static double promedioCalif(double primera, double segunda, double tercera){
        double promedio = (primera + segunda + tercera) / 3;
        double promedioRedondeado = Math.round(promedio * 10.0) / 10.0;
        return promedioRedondeado;
    }
    public static boolean aprobacion(double promedio){
        boolean aprobo = true;
        if(promedio < 60){
            aprobo = false;
        }
        return aprobo;
    }
    public static void mensaje(double nota1, double nota2, double nota3){
        double promedioCal = promedioCalif(nota1, nota2, nota3);
        boolean aprobo = aprobacion(promedioCal);

            System.out.println("El promedio de las notas es: " + promedioCal);
        if(aprobo){
            System.out.println("El alumno APROBÓ");
        }else{
            System.out.println("El alumno REPROBÓ");
        }
    }
}
