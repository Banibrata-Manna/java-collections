package collections.iterableIterator;

import java.util.*;

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

    List<Integer> list = new ArrayList<>();

    list.add(11);
    list.add(44);
    list.add(33);
    list.add(22);
    list.add(55);

    Iterator<Integer> itr = list.iterator();

    for(Integer i : list) {
      System.out.print(i + " ");
    }
    while(itr.hasNext()) {
      Integer num = itr.next();
      itr.remove();
    }
    System.out.println("\nPrinting the list 2nd Time");
    for(Integer i : list) {
      System.out.print(i + " ");
    }
  }
}
