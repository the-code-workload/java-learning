import java.util.HashMap;
import java.util.Map;

public class CollectionEx2 {
    public static void main(String[] args) {
        Map mapA = new HashMap();

        mapA.put("key1", "element 1");
        mapA.put("key2", "element 2");
        mapA.put("key3", "element 3");

        for(Object key : mapA.keySet()) {
            Object value = mapA.get(key);
            System.out.println(key);
            System.out.println(value);
        }

        System.out.println("debug point");
    }
}
