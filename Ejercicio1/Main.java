public class Main { // Clase principal del programa
    public static void main(String[] args) { // Método principal
        Empleado empleado = new Empleado("Carlos", 1800, "Sistemas"); // Crea un empleado
        CalculadorPago calculador = new CalculadorPago(); // Crea el objeto para calcular el pago
        double pago = calculador.calcularPagoMensual(empleado); // Calcula el pago mensual
        System.out.println("Nombre: " + empleado.getNombre()); // Muestra el nombre
        System.out.println("Departamento: " + empleado.getDepartamento()); // Muestra el departamento
        System.out.println("Pago mensual: S/ " + pago); // Muestra el pago mensual
    }
}