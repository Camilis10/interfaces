package proyectos;

// se crea la clase vehiculoDeCarga, la cual hereda de la clase automovil
public class VehiculoDeCarga extends Vehiculo {
    // se crean los atributos
    private double capacidadDeCarga;

    // se crea la clase por medio del metodo constructor
    public VehiculoDeCarga(String marca, String modelo, String anno, double capacidadDeCarga) {
        super(marca, modelo, anno);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    // se crean los metodos get y set
    public double getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(double capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    // se crea un metodo que imprima la capacidad de carga
    public void cargarCarga() {
        System.out.println("El vehiculo esta cargando con" + capacidadDeCarga);
    }

}
