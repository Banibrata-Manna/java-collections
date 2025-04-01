package collections.iterableIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterableDemo {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("Name", "Banibrata");
    map.put("Gender", "M");
    map.put("age", "24");

//    for(Map.Entry<String, String> entry : map.entrySet()){
//      if("age".equals(entry.getKey())){
//        map.put("age", "25");// this is valid.
//        map.remove("age");// this line will throw ConcurrentModificationException
//      }
//    }
    Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();
    while(entries.hasNext()) {
      Map.Entry<String, String> entry = entries.next();
      if("age".equals(entry.getKey())) {
        System.out.println(map);
        entries.remove();
      }
    }
    System.out.println(map);
  }
}
