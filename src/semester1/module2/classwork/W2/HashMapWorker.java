package semester1.module2.classwork.W2;

import java.util.HashMap;

public class HashMapWorker {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Andrew", 15);
        map.put("Arthur", 17);
        System.out.println(map);
        System.out.println(map.get("Andrew"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.remove("Andrew");
        System.out.println(map);
    }
}
