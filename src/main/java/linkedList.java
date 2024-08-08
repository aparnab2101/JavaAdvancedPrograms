import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("Aparna");
        linkedList.add("Vishal");
        linkedList.add("Smrithi");
        linkedList.add("Anand");
        Iterator<String> iterator= linkedList.iterator();
        while (iterator.hasNext()){
            String ele= iterator.next();
            System.out.println(ele);
        }
        linkedList.addFirst("Jobina");
        linkedList.addLast("Vinaya");
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println( linkedList.get(2));
        System.out.println(linkedList);
    }
}
