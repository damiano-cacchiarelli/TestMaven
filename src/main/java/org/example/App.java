package org.example;

import org.json.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Path path = Paths.get(new File("").getAbsolutePath(),"src", "main", "resources", "test.json");

        System.out.println( "New Json File" );
        JSONArray ar = new JSONArray();

        JSONObject person = new JSONObject();
        person.put("age", "22");
        person.put("name", "jon doe");
        person.put("city", "chicago");

        JSONObject person2 = new JSONObject();
        person2.put("age", "31");
        person2.put("name", "Fabrizio Fornari");
        person2.put("city", "Camerino");

        ar.put(person);
        ar.put(person2);

        try {
            Files.write(path, ar.toString().getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final JSONOBject: " + path.toString());
    }
}
