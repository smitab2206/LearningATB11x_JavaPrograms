package Ex_32_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab260_Map_P1 {
    public static void main(String[] args) {
        Map m1=new HashMap<>();
        //Map is Key Value pair
        //name--> Pramod
        m1.put("name","Pramod");
        m1.put("rollNo",1);
        m1.put("phone",89345758);
        m1.put("address","dshdgsfdfh");
        System.out.println(m1);

        Map m2=new LinkedHashMap();
        m2.put("name","Pramod");
        m2.put("rollNo",1);
        m2.put("phone",89345758);
        m2.put("address","dshdgsfdfh");
        System.out.println(m2);
    }
}
