package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {


        DynamicArray DynAr = new DynamicArray();
        System.out.println(DynAr.isEmpty());
        DynAr.add(7);
        DynAr.add(0);
        DynAr.add(8);
        DynAr.add(5);
        DynAr.add(3);
        System.out.println(DynAr.isEmpty());
        DynAr.printArray();
        System.out.println();
        System.out.println(DynAr.getByIndex(7));
        System.out.println(DynAr.getFirstIndexByValue(3));
        DynAr.printArray();
        System.out.println();
        DynAr.set(4, 222);
        DynAr.printArray();
        System.out.println();
        DynAr.add(2, 8888);
        DynAr.printArray();
        System.out.println();
        DynAr.delete(2);
        DynAr.printArray();

    }
}
