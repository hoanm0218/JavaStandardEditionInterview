package hoanm.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {

        /*
         * MAP:
         * - A interface storage element by Key-Value
         * - Not duplicate key
         * - Class implements MAP: HashMap, Hashtable, TreeMap
         * */

        //HASH MAP
        System.out.println("********HashMap*******");
        Map<Integer, String> mapHttpErrors = new HashMap<>();

        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(303, "See Other");
        mapHttpErrors.put(404, "Not Found");
        mapHttpErrors.put(500, "Internal Server Error");

        System.out.println("Your map HTTP Errors: ");
        System.out.println(mapHttpErrors);
        mapHttpErrors.forEach((integer, s) -> System.out.println(integer + " : " + s));

        //LINKED HASH MAP
        System.out.println("********LinkedHashMap*******");
        Map<String, String> mapContacts = new LinkedHashMap<>();

        mapContacts.put("0169238175", "Tom");
        mapContacts.put("0904891321", "Peter");
        mapContacts.put("0945678912", "Mary");
        mapContacts.put("0981127421", "John");

        System.out.println("Your map contacts: ");
        System.out.println(mapContacts);

        //TREE MAP
        System.out.println("********TreeMap*******");
        Map<String, String> mapLang = new TreeMap<>();

        mapLang.put("x", "XML");
        mapLang.put("c", "C");
        mapLang.put("j", "Java");
        mapLang.put("p", "PHP");

        System.out.println("Your map Lang: ");
        mapLang.forEach((key, value) -> System.out.println("Key: " + key + " | Value: " + value));
    }
}
