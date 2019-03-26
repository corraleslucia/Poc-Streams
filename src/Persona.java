public class Persona {
    private String nombre;
    private int edad;
    private int dni;

    public Persona (String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public String toString ()
    {
        return "Nombre: " + nombre + " - Edad : " + edad + " - DNI: " + dni;
    }
}
