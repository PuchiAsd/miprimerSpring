package cl.praxis.miprimerspring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Miprimerspring01Application {

    public static void main(String[] args) {
        SpringApplication.run(Miprimerspring01Application.class, args);

        Persona persona = new Persona();
        persona.setEdad(33);
        persona.setNombre("Tamara");
        persona.setApellido("López");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());

    }

}
