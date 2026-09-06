public class Empleado { // Representa a un empleado
    private String nombre; // Guarda el nombre del empleado
    private double salario; // Guarda el salario del empleado
    private String departamento; // Guarda el departamento del empleado
    public Empleado(String nombre, double salario, String departamento) { // Constructor del empleado
        this.nombre = nombre; // Asigna el nombre recibido
        this.salario = salario; // Asigna el salario recibido
        this.departamento = departamento; // Asigna el departamento recibido
    }
    public String getNombre() { // Obtiene el nombre del empleado
        return nombre; // Devuelve el nombre
    }
    public double getSalario() { // Obtiene el salario del empleado
        return salario; // Devuelve el salario
    }
    public String getDepartamento() { // Obtiene el departamento del empleado
        return departamento; // Devuelve el departamento
    }
}