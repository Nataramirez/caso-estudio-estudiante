package co.edu.uniquindio.estudiante;
import co.edu.uniquindio.estudiante.model.Estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = crearEstudiante("Juan", 17, "juan@mail.com", 3, 3, 3.5, 4.5);
        Estudiante estudiante2 = crearEstudiante("Maria", 15, "pepita@mail.com", 1, 2, 2.5, 4.5);
        Estudiante estudiante3 = crearEstudiante("Pepe", 20, "pepe@mail.com", 4, 4, 2.5, 4.5);
        calcularNotaMayorDelCurso(estudiante1, estudiante2, estudiante3);

        //Calcular la definitiva de cada estudiante.
        double calcularDefinitivaEstudiante1 = calcularPromedio(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        double calcularDefinitivaEstudiante2 = calcularPromedio(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double calcularDefinitivaEstudiante3 = calcularPromedio(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());

        //Calcular promedio curso.
        double promedioCurso = calcularPromedio(calcularDefinitivaEstudiante1, calcularDefinitivaEstudiante2, calcularDefinitivaEstudiante3);

        //Calcular promedio de edad.
        double promedioEdad = calcularPromedio(estudiante1.getEdad(), estudiante2.getEdad(), estudiante3.getEdad());

        //Calcular promedio de la nota 1.
        double promedioNota1 = calcularPromedio(estudiante1.getNota1(), estudiante2.getNota1(), estudiante3.getNota1());

        //12. Nota maxima estudiantes
        String notaMaximaEst1 = notaMaxima(estudiante1);
        String notaMaximaEst2 = notaMaxima(estudiante2);
        String notaMaximaEst3 = notaMaxima(estudiante3);

        //8. Aprobacion curso
        String aprobacionEst1= aprobacionCurso(estudiante1, calcularDefinitivaEstudiante1);
        String aprobacionEst2= aprobacionCurso(estudiante2, calcularDefinitivaEstudiante2);
        String aprobacionEst3= aprobacionCurso(estudiante3, calcularDefinitivaEstudiante3);

        //Imprimiendo en pantalla los resultados para su verificación.
        System.out.println("La definitiva de " + estudiante1.getNombre() + " es " + calcularDefinitivaEstudiante1 + ", la definitiva de " +
                estudiante2.getNombre() + " es " + calcularDefinitivaEstudiante2 + " y la definitiva de " + estudiante3.getNombre() + " es " + calcularDefinitivaEstudiante3);
        System.out.println("El promedio del curso es " + promedioCurso);
        System.out.println("El promedio de las edades de los estudiantes del curso es " + promedioEdad);
        System.out.println("El promedio del curso en la nota 1 es " + promedioNota1);
        System.out.println(notaMaximaEst1);
        System.out.println(notaMaximaEst2);
        System.out.println(notaMaximaEst3);
        System.out.println(aprobacionEst1);
        System.out.println(aprobacionEst2);
        System.out.println(aprobacionEst3);
    }

    private static double calcularPromedio(double valorUno, double valorDos, double valorTres) {
        double promedioValores = (valorUno + valorDos + valorTres)/3;
        return promedioValores;
    }

    // 8. Aprobacion curso
    private static String aprobacionCurso(Estudiante estudiante, double promedio)
    {
        String mensaje= String.valueOf((0));
        if (promedio>=3.0)
        {
            mensaje=estudiante.getNombre()+" SÍ aprobó el curso";
        }
        else{
            mensaje=estudiante.getNombre()+" NO aprobó el cuero";
        }
        return mensaje;
    }

    // 12. Nota maxima
    private static String notaMaxima(Estudiante estudiante)
    {
        String mensaje;
        double Nota1Est = estudiante.getNota1();
        double Nota2Est = estudiante.getNota2();
        double Nota3Est = estudiante.getNota3();
        double NotaMaxEst = 0;

        if(Nota1Est>Nota2Est)
        {
            NotaMaxEst=Nota1Est;
        }
        else
        {
            NotaMaxEst=Nota2Est;
        }
        if(Nota3Est>NotaMaxEst)
        {
            NotaMaxEst=Nota3Est;
        }
        mensaje="La nota máxima de "+estudiante.getNombre()+" es "+NotaMaxEst;
        return mensaje;
    }

    public static Estudiante crearEstudiante (String nombre, double edad, String correo, int semestre, double nota1,
                                       double nota2, double nota3){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setEdad(edad);
        estudiante.setCorreo(correo);
        estudiante.setSemestre(semestre);
        estudiante.setNota1(nota1);
        estudiante.setNota2(nota2);
        estudiante.setNota3(nota3);
        return estudiante;
    }

    public static double calcularNotaMayorDelCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){
        double notaMayorEstudiante1 = notaMayor(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        double notaMayorEstudiante2 = notaMayor(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double notaMayorEstudiante3 = notaMayor(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        double notaMayorCurso = notaMayor(notaMayorEstudiante1, notaMayorEstudiante2, notaMayorEstudiante3);
        System.out.println("La nota mayor del curso es: " + notaMayorCurso);
        return notaMayorCurso;
    }

    public static double notaMayor(double nota1, double nota2, double nota3){
        double notaMayor = 0;
        if(nota1 > notaMayor) notaMayor = nota1;
        if(nota2 > notaMayor) notaMayor = nota2;
        if(nota3 > notaMayor) notaMayor = nota3;
        return notaMayor;
    }

}