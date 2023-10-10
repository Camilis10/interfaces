package proyectos;

// se crea la clase vehiculoDePasajeros, la cual hereda de la clase vehiculo
class VehiculoDePasajeros extends Vehiculo {
    // se crea sus atributos
    private int numeroDePasajeros;

    // se crea la clase por medio del metodo constructor
    public VehiculoDePasajeros(String marca, String modelo, String anno, int numeroDePasajeros) {
        super(marca, modelo, anno);
        this.numeroDePasajeros = numeroDePasajeros;
    }

    // se crean los metodos get y set
    public int getNumeroDePasajeros() {
        return numeroDePasajeros;
    }

    public void setNumeroDePasajeros(int numeroDePasajeros) {
        this.numeroDePasajeros = numeroDePasajeros;
    }

    public void transportarPasajeros() {
        System.out.println(numeroDePasajeros);
    }

}
