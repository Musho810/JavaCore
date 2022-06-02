package homework.stack;

public class Stack {
    int[] array = new int[10];
    int index;

    Stack() {
        index = -1;
    }
    void push (int value) {
        if (index > 8) {
            System.out.println("Stack is fully");
        } else {
            array[++index] = value;
        }
    }
    int pop() {
        if (index < 0) {
            System.out.println("Stack is empty");
        return 0; // aranc 0-i chi stacvum
        } else {
            return array[index--];
        }
    }
}
