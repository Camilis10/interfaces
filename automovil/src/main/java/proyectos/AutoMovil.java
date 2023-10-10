package proyectos;

// se crea la clase automovil, la cual hereda de la clase vehiculoDePasajeros
class AutoMovil extends VehiculoDePasajeros {
    // se crean los atributos
    private int numeroDepuertas;

    // se crea la clase por medio del metodo constructor
    public AutoMovil(String marca, String modelo, String anno, int numeroDePasajeros, int numeroDepuertas) {
        super(marca, modelo, anno, numeroDePasajeros);
        this.numeroDepuertas = numeroDepuertas;
    }

    // se crean los metodos get y set
    public int getNumeroDepuertas() {
        return numeroDepuertas;
    }

    public void setNumeroDepuertas(int numeroDepuertas) {
        this.numeroDepuertas = numeroDepuertas;
    }

    // se crea un metodo que permita saber si las puertas estan o no abiertas
    public static void AbrirPuertas(boolean abrirPuertas) {
        if (abrirPuertas) {
            System.out.println("las puertas esta abiertas.");
        } else {
            System.out.println("las puestas no estan abiertas");
        }
    }

}
