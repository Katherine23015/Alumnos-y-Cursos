import java.util.ArrayList;

public class Curso {
    private String nombre;
    private String codigo;
    private ArrayList<Alumno> listaAlumnos;

    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        if (alumno != null) {
            listaAlumnos.add(alumno);
        }
    }

    public boolean eliminarAlumno(String matricula) {
        for (Alumno a : listaAlumnos) {
            if (a.getMatricula().equals(matricula)) {
                listaAlumnos.remove(a);
                return true;
            }
        }
        return false;
    }

    public boolean perteneceAlCurso(String matricula) {
        for (Alumno a : listaAlumnos) {
            if (a.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: ").append(nombre).append(" (").append(codigo).append(")\n");
        sb.append("Listado de Alumnos:\n");
        for (Alumno a : listaAlumnos) {
            sb.append("- ").append(a.toString()).append("\n");
        }
        return sb.toString();
    }
}
