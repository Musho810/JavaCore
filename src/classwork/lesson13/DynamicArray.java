package classwork.lesson13;

public class DynamicArray {
   private int [] array = new int[10];

    private int size= 0;
    void add (int value) {
        if (size == array.length){
            increaseArray();
        }
        array[size ++] = value;
    }

    private void increaseArray() {
        int [] temp= new int[size + size/2 +1];
        for (int i = 0; i < size; i++) {
            temp [i] = array[i];
        }
        array = temp;
    }

    void print (){

    }
}
