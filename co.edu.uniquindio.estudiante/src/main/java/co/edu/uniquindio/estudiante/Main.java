package co.edu.uniquindio.estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = crearEstudiante("Juan", 17, "juan@mail.com", 3, 3, 3.5, 4.5);
        Estudiante estudiante2 = crearEstudiante("Maria", 15, "pepita@mail.com", 1, 2, 2.5, 4.5);
        Estudiante estudiante3 = crearEstudiante("Pepe", 20, "pepe@mail.com", 4, 4, 2.5, 4.5);
        System.out.println(estudiante1.getNombre());
        System.out.println(estudiante2.getNombre());
        System.out.println(estudiante3.getNombre());
    }

    private static double calcularPromedio(double valorUno, double valorDos, double valorTres) {
        double promedioValores = (valorUno + valorDos + valorTres)/3;
        return promedioValores;
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

}