public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Programación Orientada a Objetos", "IIQ101");


        curso.agregarAlumno(new Alumno("Juan", "Pérez", "2023001", "Informática"));
        curso.agregarAlumno(new Alumno("María", "Garcés", "2023002", "Informática"));
        curso.agregarAlumno(new Alumno("Diego", "Lara", "2023003", "Civil"));
        curso.agregarAlumno(new Alumno("Ana", "Torres", "2023004", "Industrial"));
        curso.agregarAlumno(new Alumno("Lucas", "Rojas", "2023005", "Informática"));

        System.out.println(curso.toString());

        String busqueda = "2023003";
        System.out.println("¿Pertenece matrícula " + busqueda + "?: " + curso.perteneceAlCurso(busqueda));

        System.out.println("\nEliminando alumno 2023001...");
        curso.eliminarAlumno("2023001");

        System.out.println("\n--- Estado Final del Curso ---");
        System.out.println(curso.toString());
    }
}