public class Persona {
    String nombre;
    int edad;
    String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void presentarse() {
        System.out.println("Me presento, mi nombre es: " + this.nombre + " ,tengo " + this.edad + " años y soy del género " + this.genero);
    }

    public static void main(String[] args) {
        Persona personaUno = new Persona("Diego", 18, "Masculino");
        Persona personaDos = new Persona("Maria", 25, "Femenino");
        personaUno.presentarse();
        personaDos.presentarse();
    }
}