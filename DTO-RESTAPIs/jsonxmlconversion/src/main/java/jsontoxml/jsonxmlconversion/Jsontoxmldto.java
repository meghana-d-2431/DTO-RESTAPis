package jsontoxml.jsonxmlconversion;

import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Jsontoxmldto {

    public static void main(String[] args) throws Exception {

        InputStream is = Jsontoxmldto.class
                .getClassLoader()
                .getResourceAsStream("employeejson.json");


// ObjectMapper → tool helps to convert JSON → DTO
// readValue() → converts JSON → DTO
// Root → top-level structure
// Employee → inner structure
// Root root = new Root(); --create Root DTO
// Employee emp = new Employee(); --create Employee DTO
// emp.setId(1); --set id from JSON
// emp.setName("Meghana"); --set name from JSON
// root.setEmployee(emp); --attach employee to root
        ObjectMapper jsonMapper = new ObjectMapper();
        Root root = jsonMapper.readValue(is, Root.class);

// XmlMapper takes the existing DTO (root)
// Reads its fields using getters
// Converts it into XML format
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(root);

        System.out.println(xml);
    }

}
