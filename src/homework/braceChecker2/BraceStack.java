package homework.braceChecker2;

public class BraceStack {
    int[] array = new int[10];
    int index;

    BraceStack() {
        index = -1;
    }

    void push(int value) {
        if (index > 9) {

        } else {
            array[++index] = value;
        }
    }

    int pop() {
        if (index < 0) {

            return 0;
        } else {
            return array[index--];
        }
    }

}
