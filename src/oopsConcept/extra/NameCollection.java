package oopsConcept.extra;

import java.util.Iterator;
import java.util.List;

// HW -> collection of string, double, integer, boolean, anyObject
// TIP/HINT -> Generic
public class NameCollection implements Iterable<String> {
    private String[] names;
    private int size;

    public NameCollection(int size) {
        this.size = size;
        this.names = new String[size];
    }

    public void addName(String name){
        if(size <= 0){
            new IllegalArgumentException("Capacity is over");
        }
        names[names.length - size] = name;
        size--;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>(){
            int i = 0;
            int maxSize = names.length;
            @Override
            public boolean hasNext() {
                if(i <= names.length - 1){
                    return names[i] != null;
                }
                return false;
            }

            @Override
            public String next() {
                return names[i++];
            }
        };
    }

    public static void main(String[] args) {
        NameCollection nameCollection = new NameCollection(5);
        nameCollection.addName("Tushar");
        nameCollection.addName("Affan");
        nameCollection.addName("Jatindra");
        nameCollection.addName("Vakeel");
        nameCollection.addName("Devang");

        // take the array and run for normal loop index based
        // take array out as list and run enhanced

        //directly use enhanced for loop on nameCollection object
        // internally uses iterator
//        for(String name : nameCollection){
//            System.out.println(name);
//        }
//
//        Iterator<String> nameCollectionIterator = nameCollection.iterator();
//        while(nameCollectionIterator.hasNext()){
//            System.out.println(nameCollectionIterator.next());
//        }

        int[] arr = {1,2,3,4};
        System.out.println(arr);
        List<Integer> list = List.of(1,2,3,4);
        System.out.println(list);
    }
}

