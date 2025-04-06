package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
  public static void main(String[] args) {
    List list = new ArrayList();

    list.add("Rakshit");
    list.add(10);
    list.add('c');

    System.out.println(list);

    ListIterator itr = list.listIterator();

    try {
      while(itr.hasNext()) {
        if("Rakshit".equals(itr.next().toString())) {
          itr.set('d');
          itr.add("Banibrata Manna");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(list);
  }
}
