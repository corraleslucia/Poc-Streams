import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List <Persona> personas = new ArrayList<>();

        personas = Arrays.asList(new Persona ("Gaston Lazcano", 14, 39170523 ),
                new Persona ("Lucia Corrales", 29, 35043717 ),
                new Persona ("Santiago Carrizo", 18, 40546709 ),
                new Persona ("Julia Roberts", 50, 195246125 ),
                new Persona ("Federico Bal", 71, 6214587 ),
                new Persona ("Lujan Sanchez", 6, 32154785 ),
                new Persona ("Mirta Legrand", 48, 12052478 ),
                new Persona ("Miguel Perez", 31, 20124587 ));

        System.out.println(String.format("Personas: %s", personas ));

        System.out.println(String.format("Mayores a 21: %s", personas.stream()
        .filter(persona -> persona.getEdad()>21)
        .collect(Collectors.toList())));

        System.out.println(String.format("Menores a 18: %s", personas.stream()
                .filter(persona -> persona.getEdad()<18)
                .collect(Collectors.toList())));

        System.out.println(String.format("Mayores a 21 + DNI > 20000000: %s", personas.stream()
                .filter(persona -> persona.getEdad()>21)
                .filter(persona -> persona.getDni()>20000000)
                .collect(Collectors.toList())));
    }
}
