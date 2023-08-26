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

        //Aprobacion del curso
        aprovacionCurso(calcularDefinitivaEstudiante1, calcularDefinitivaEstudiante2, calcularDefinitivaEstudiante3);

        //Imprimiendo en pantalla los resultados para su verificación.
        System.out.println("La definitiva de " + estudiante1.getNombre() + " es " + calcularDefinitivaEstudiante1 + ", la definitiva de " +
                estudiante2.getNombre() + " es " + calcularDefinitivaEstudiante2 + " y la definitiva de " + estudiante3.getNombre() + " es " + calcularDefinitivaEstudiante3);
        System.out.println("El promedio del curso es " + promedioCurso);
        System.out.println("El promedio de las edades de los estudiantes del curso es " + promedioEdad);
        System.out.println("El promedio del curso en la nota 1 es " + promedioNota1);
    }

    private static double calcularPromedio(double valorUno, double valorDos, double valorTres) {
        double promedioValores = (valorUno + valorDos + valorTres)/3;
        return promedioValores;
    }

    private static void aprovacionCurso(double promUno, double promDos, double promTres)
    {
        // VERIFICACIÓN ESTUDIANTE 1
        if (promUno>=3)
        {
            System.out.println("Juan SÍ aprobó el curso");
        }
        else{
            System.out.println("Juan 1 NO aprobó el curso");
        }
        // VERIFICACIÓN ESTUDIANTE 2
        if (promDos>=3)
        {
            System.out.println("María 2 SÍ aprobó el curso");
        }
        else{
            System.out.println("María 2 NO aprobó el curso");
        }
        // VERIFICACIÓN ESTUDIANTE 3
        if (promTres>=3)
        {
            System.out.println("Pepe 3 SÍ aprobó el curso");
        }
        else{
            System.out.println("Pepe 3 NO aprobó el curso");
        }
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