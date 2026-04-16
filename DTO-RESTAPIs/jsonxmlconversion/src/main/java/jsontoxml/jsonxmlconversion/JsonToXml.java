package jsontoxml.jsonxmlconversion;
import java.io.IOException;
import java.io.InputStream;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXml {

    public static void main(String[] args) throws IOException {


        //ClassLoader → finds file location
        //getResourceAsStream → opens file
        //InputStream → reads file content in bytes 
        
        InputStream is = JsonToXml.class
        .getClassLoader()
        .getResourceAsStream("employeejson.json");

        String stringJson = new String(is.readAllBytes()); // reads the file content converts those bytes into a normal Java String

        JSONObject json = new JSONObject(stringJson); // Convert the JSONString to a JSONObject structured data 
        // "{ \"name\": \"John\", \"age\": 25, \"city\": \"Dallas\" }"

        String xml = XML.toString(json); // Convert the JSONObject to XML String ex: "<root><Employees>...</Employees></root>"

        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + xml); // Add the XML declaration and print the final XML output
    }
}
