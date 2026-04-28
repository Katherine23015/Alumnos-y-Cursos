public class Alumno {
    private String nombre;
    private String apellido;
    private String matricula;
    private String carrera;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String matricula, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getMatricula() { return matricula; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " " + apellido + " | Matrícula: " + matricula;
    }
}
