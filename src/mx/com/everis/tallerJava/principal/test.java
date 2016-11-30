
package mx.com.everis.tallerJava.principal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class test {

    public static BufferedReader in = new BufferedReader
        (new InputStreamReader(System.in));
    
    public static void main(String[] args) {

        System.out.println("Traductor con Locale y ResourceBundle");
        Locale idioma, idioma2;

        idioma = new Locale("es", "MX");

        idioma2 = Locale.US;

        ResourceBundle espaniol = ResourceBundle.getBundle("mx.com.everis.tallerJava.properties.Idioma", idioma);
        ResourceBundle ingles = ResourceBundle.getBundle("mx.com.everis.tallerJava.properties.Idioma", idioma2);

        System.out.println(espaniol.getString("perro") + " - " + ingles.getString("perro"));
        System.out.println(espaniol.getString("gato") + " - " + ingles.getString("gato"));

        System.out.println(espaniol.getString("nombre") + " - " + ingles.getString("nombre"));

        System.out.println(espaniol.getString("apellido") + " - " + ingles.getString("apellido"));

        System.out.println(espaniol.getString("computadora") + " - " + ingles.getString("computadora"));

        System.out.println(espaniol.getString("bocinas") + " - " + ingles.getString("bocinas"));
        ;
        System.out.println(espaniol.getString("teclado") + " - " + ingles.getString("teclado"));

        System.out.println(espaniol.getString("pez") + " - " + ingles.getString("pez"));

        System.out.println(espaniol.getString("letra") + " - " + ingles.getString("letra"));

    }

}
