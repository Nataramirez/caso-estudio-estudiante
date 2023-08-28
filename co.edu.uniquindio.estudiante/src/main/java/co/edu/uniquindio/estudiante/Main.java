package co.edu.uniquindio.estudiante;
import co.edu.uniquindio.estudiante.model.Estudiante;

public class Main {
    public static void main(String[] args) {
        // 1. crear estudiantes
        Estudiante estudiante1 = crearEstudiante("Juan", 17, "juan@mail.com", 3, 3, 3.5, 4.5);
        Estudiante estudiante2 = crearEstudiante("Maria", 15, "pepita@mail.com", 1, 2, 2.5, 4.5);
        Estudiante estudiante3 = crearEstudiante("Pepe", 20, "pepe@mail.com", 4, 4, 2.5, 4.5);

        // 2. Calcular la definitiva de cada estudiante.
        double calcularDefinitivaEstudiante1 = calcularPromedio(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        double calcularDefinitivaEstudiante2 = calcularPromedio(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double calcularDefinitivaEstudiante3 = calcularPromedio(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());

        // 3. Calcular promedio curso.
        double promedioCurso = calcularPromedio(calcularDefinitivaEstudiante1, calcularDefinitivaEstudiante2, calcularDefinitivaEstudiante3);

        // 4. Calcular promedio de edad.
        double promedioEdad = calcularPromedio(estudiante1.getEdad(), estudiante2.getEdad(), estudiante3.getEdad());

        // 5. Calcular promedio de la nota 1.
        double promedioNota1 = calcularPromedio(estudiante1.getNota1(), estudiante2.getNota1(), estudiante3.getNota1());

        // 6. Calcular nota mayor del curso
        double notaMayorDelCurso = calcularNotaMayorDelCurso(estudiante1, estudiante2, estudiante3);

        // 7. Calcular nota menor del curso

        //8. Aprobacion curso
        String aprobacionEstudiante1 = aprobacionCurso(estudiante1, calcularDefinitivaEstudiante1);
        String aprobacionEstudiante2 = aprobacionCurso(estudiante2, calcularDefinitivaEstudiante2);
        String aprobacionEstudiante3 = aprobacionCurso(estudiante3, calcularDefinitivaEstudiante3);

        // 9. Calcular porcentaje de estudiantes que ganaron el curso

        // 10. Calcular porcentaje de estudiantes que perdieron el curso

        //11. Obtener estudiantes con notas mayores a 4
        String EstudiantesConNotasMayoresA4 = obtenerEstudiantesNotasMayor4(estudiante1, estudiante2, estudiante3);

        //12. Nota maxima estudiantes
        String notaMaximaEstudiante1 = notaMaxima(estudiante1);
        String notaMaximaEstudiante2 = notaMaxima(estudiante2);
        String notaMaximaEstudiante3 = notaMaxima(estudiante3);
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

    private static double calcularPromedio(double valorUno, double valorDos, double valorTres) {
        double promedioValores = (valorUno + valorDos + valorTres)/3;
        return promedioValores;
    }

    public static double notaMayor(double nota1, double nota2, double nota3){
        double notaMayor = 0;
        if(nota1 > notaMayor) notaMayor = nota1;
        if(nota2 > notaMayor) notaMayor = nota2;
        if(nota3 > notaMayor) notaMayor = nota3;
        return notaMayor;
    }

    public static double calcularNotaMayorDelCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3){
        double notaMayorEstudiante1 = notaMayor(estudiante1.getNota1(), estudiante1.getNota2(), estudiante1.getNota3());
        double notaMayorEstudiante2 = notaMayor(estudiante2.getNota1(), estudiante2.getNota2(), estudiante2.getNota3());
        double notaMayorEstudiante3 = notaMayor(estudiante3.getNota1(), estudiante3.getNota2(), estudiante3.getNota3());
        double notaMayorCurso = notaMayor(notaMayorEstudiante1, notaMayorEstudiante2, notaMayorEstudiante3);
        return notaMayorCurso;
    }

    // 8. Aprobacion curso
    private static String aprobacionCurso(Estudiante estudiante, double promedio)
    {
        String mensaje;
        if (promedio>=3.0)
        {
            mensaje=estudiante.getNombre()+" SÍ aprobó el curso";
        }
        else{
            mensaje=estudiante.getNombre()+" NO aprobó el cuero";
        }
        return mensaje;
    }

    public static String obtenerEstudiantesNotasMayor4(Estudiante estudiante1,
                                                       Estudiante estudiante2, Estudiante estudiante3)
    {
        String mensaje1;
        String mensaje2;
        String mensaje3;
        String mensajeFinal;
        double Nota1Est1=estudiante1.getNota1();
        double Nota2Est1=estudiante1.getNota2();
        double Nota3Est1=estudiante1.getNota3();

        double Nota1Est2=estudiante2.getNota1();
        double Nota2Est2=estudiante2.getNota2();
        double Nota3Est2=estudiante2.getNota3();

        double Nota1Est3=estudiante3.getNota1();
        double Nota2Est3=estudiante3.getNota2();
        double Nota3Est3=estudiante3.getNota3();

        if (Nota1Est1>4 || Nota2Est1>4 || Nota3Est1>4)
        {
            mensaje1=estudiante1.getNombre();
        }
        else
        {
            mensaje1=" ";
        }
        if (Nota1Est2>4 || Nota2Est2>4 || Nota3Est2>4)
        {
            mensaje2=estudiante2.getNombre();
        }
        else
        {
            mensaje2=" ";
        }
        if (Nota1Est3>4 || Nota2Est3>4 || Nota3Est3>4) {
            mensaje3 = estudiante3.getNombre();
        }
        else
        {
            mensaje3=" ";
        }
        mensajeFinal=mensaje1+" "+mensaje2+" "+mensaje3;
        return mensajeFinal;
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
}