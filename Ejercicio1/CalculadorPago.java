public class CalculadorPago { // Se encarga únicamente de calcular el pago
    public double calcularPagoMensual(Empleado empleado) { // Calcula el pago mensual del empleado
        return empleado.getSalario(); // Devuelve el salario del empleado
    }
}