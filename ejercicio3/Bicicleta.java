package ejercicio3;

// Clase Bicicleta que hereda de Vehiculo
public class Bicicleta extends Vehiculo {
    @Override // Palabra clave que indica que estamos sobreescribiendo el método
    public void acelerar() { // Implementación del método acelerar() de acuerdo
                             // al tipo de vehiculo que es
        System.out.println("Acelera pedaleando");
    }
}
