package HashMap;

import java.util.HashMap;

public class StudentGradeManager {
    HashMap<String,Integer> list = new HashMap<>();

    void add (String name, Integer score) {
        list.put(name,score);
    }

    void see (String name) {
        if (list.containsKey(name)) {
            System.out.println(name + list.get(name));
        }
        else {
            System.out.println("I Can't Find");
        }
    }

    void remove(String name) {
        list.remove(name);
    }
}
