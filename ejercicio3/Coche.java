package ejercicio3;

// Clase Coche que hereda de Vehiculo
public class Coche extends Vehiculo {
    @Override // Palabra clave que indica que estamos sobreescribiendo el método
    public void acelerar() { // Implementación del método acelerar() de acuerdo
                             // al tipo de vehiculo que es
        System.out.println("Acelera usando el motor");
    }
}
