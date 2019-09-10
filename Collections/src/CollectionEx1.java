import java.util.*;

public class CollectionEx1 {

    public static void main(String[] args) {
        Integer i = new Integer(2);
        System.out.println(i);
        System.out.println(i.intValue());

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        System.out.println("debug point");
        System.out.println(list1.get(0));

        // List Example
        List al = new ArrayList();  // creating array list
        al.add("Jack");                // adding elements
        al.add("Tyler");
        Iterator itr = al.iterator(); // iterating
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

        System.out.println("---HASHSET--generic---");


        Set<String> set = new HashSet<>();
        set.add("ABC");
        set.add("ABC");
        set.add("CDE");
        Iterator setitr = set.iterator(); // iterating
        while (setitr.hasNext()) {
            System.out.println(setitr.next());

        }

        System.out.println("---TREESET--sorts--");

        Set<String> treeset = new TreeSet<>();
        treeset.add("DFE");
        treeset.add("EFF");
        treeset.add("ABC");
        Iterator treesetitr = treeset.iterator(); // iterating
        while (treesetitr.hasNext()) {
            System.out.println(treesetitr.next());

        }

        System.out.println("---LINKEDHASHSET- maintains order---");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("DFE");
        linkedHashSet.add("EFF");
        linkedHashSet.add("ABC");
        Iterator linkedHashSetitr = linkedHashSet.iterator(); // iterating
        while (linkedHashSetitr.hasNext()) {
            System.out.println(linkedHashSetitr.next());

        }
    }

}
