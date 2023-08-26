package co.edu.uniquindio.estudiante;
import co.edu.uniquindio.estudiante.model.Estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = crearEstudiante("Juan", 17, "juan@mail.com", 3, 3, 3.5, 4.5);
        Estudiante estudiante2 = crearEstudiante("Maria", 15, "pepita@mail.com", 1, 2, 2.5, 4.5);
        Estudiante estudiante3 = crearEstudiante("Pepe", 20, "pepe@mail.com", 4, 4, 2.5, 4.5);
        calcularNotaMayorDelCurso(estudiante1, estudiante2, estudiante3);
    }

    private static double calcularPromedio(double valorUno, double valorDos, double valorTres) {
        double promedioValores = (valorUno + valorDos + valorTres)/3;
        return promedioValores;
    }

    public static Estudiante crearEstudiante(String nombre, double edad, String correo, int semestre, double nota1,
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