package jsontoxml.jsonxmlconversion;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.json.JSONObject;
import org.json.XML;

public class XmlToJsonconversion {

    public static void main(String[] args) throws IOException {

        InputStream is = XmlToJsonconversion.class
                .getClassLoader()
                .getResourceAsStream("employeexml.xml");

        // first it reads xml file in byte formate then it gives as reable string 
        // so after the we convert that xml string in to json formate
        String stringXml = new String(is.readAllBytes(), StandardCharsets.UTF_8);

        JSONObject json = XML.toJSONObject(stringXml);

        System.out.println(json.toString(4)); // gives the json in format with 4 space indentation
    }
}
