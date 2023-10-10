package proyectos;

//se crea la clase vehiculo
public class Vehiculo {
    // se crean los atributos
    private String marca;
    private String modelo;
    private String anno;

    // se crea la clase por medio del metodo constructor
    public Vehiculo(String marca, String modelo, String anno) {
        this.marca = marca;
        this.modelo = modelo;
        this.anno = anno;
    }

    // se crean los metodos get y set
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    // se crea un metodo que imprima el valor de la velocidad con la que acelera el
    // vehiculo
    public static void Acelerar(int velocidad) {

        System.out.println("la velocidad a la que esta acelerando es: " + velocidad);
    }

}
