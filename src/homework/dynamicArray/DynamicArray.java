package homework.dynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private void extend() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    boolean isEmpty() {return size==0;
    }

    int getByIndex(int index) {
        if (index < size && index>0) {
            return array[index];
        } else {
            return 0;
        }
    }

    int getFirstIndexByValue(int value) {
        int indValue = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == value) {
                indValue = i;
            }
        }
        if (array[0] == value) {
            System.out.print("The index of a member with such a value is   ");
            return 0;
        } else if (indValue > 0) {
            System.out.print("The index of a member with such a value is   ");
            return indValue;
        } else {
            System.out.print("The member with this value was not found");
            return 0;
        }
    }

    void set(int index, int value) {
        if (index >= size) {
            System.out.println("The member with index   " + index + "  was not found");
        } else {
            array[index] = value;
        }
    }

    void add(int index, int value) {
        if (index > size) {
            System.out.println("There is no member with index  " + index);
        } else if (index == size) {
            extend();
            array[size++] = value;
        } else {
            size++;
            for (int i = array.length - 1; i >= index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
        }
    }

    void delete(int index) {
        if (index >= size) {
            System.out.println("There is no member with index  " + index);
        } else {
            if (index == size - 1) {
                array[index] = 0;
            } else {
                for (int i = index; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
            }
            size--;
        }
    }
}
