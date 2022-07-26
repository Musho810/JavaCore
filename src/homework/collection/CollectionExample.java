package homework.collection;

import java.util.*;

public class CollectionExample {
    static String[] values = {"asdadad", "asdasdawwww", "rewrewr", "scscsc"};

    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("6");
        list.add("5");
        list.add("4");
        list.add("3");
        list.add("2");
        list.add("1");


//        arrayToList(values);
//        removeById(list, 2);
//        listToSet(list);
//        listToLinkedList(list);
//        reverseNumbers(list);
//        printFirstFive(list);
//        sizeOfList(list);
    }


    static List<String> arrayToList(String[] values) {
        List<String> arraylist = new ArrayList<>();
        Collections.addAll(arraylist, values);
        return arraylist;
    }


    static List<String> removeById(List<String> list, int index) {
        list.remove(index);

        return list;
    }

    static Set<String> listToSet(List<String> list) {
        Set<String> setStr = new HashSet<>(list);
        return setStr;
    }

    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        LinkedList<Integer> linklist = new LinkedList<>(list);

        return linklist;
    }

    static List<Integer> reverseNumbers(List<Integer> list) {
        LinkedList<Integer> revlist = new LinkedList<>();
        for (Integer integer : list) {
            revlist.addFirst(integer);
        }

        return revlist;
    }


    static void printFirstFive(List<String> list) {
        List<String> stringList = new ArrayList<>(list);
        System.out.println(stringList.subList(0, 5));
    }


    static int sizeOfList(List<String> list) {

        return list.size();
    }

}

