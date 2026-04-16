package jsontoxml.jsonxmlconversion;

import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Xmltojsondto {

     public static void main(String[] args) throws Exception {

        InputStream is = Xmltojsondto.class
                .getClassLoader()
                .getResourceAsStream("employee.xml");

        // XML → DTO
        XmlMapper xmlMapper = new XmlMapper();
        Root root = xmlMapper.readValue(is, Root.class);

        // DTO → JSON
        ObjectMapper jsonMapper = new ObjectMapper();

// writerWithDefaultPrettyPrinter() This is just for formatting
// Without it:
// {"employee":{"id":1,"name":"Meghana"}}
// With it:
// {
//   "employee" : {
//     "id" : 1,
//     "name" : "Meghana"
//   }
// }
        String json = jsonMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(root);

        System.out.println(json);
    }

}
