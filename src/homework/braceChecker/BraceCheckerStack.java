package homework.braceChecker;

public class BraceCheckerStack {


    int index;

    char[] bcs = new char[10];


    BraceCheckerStack() {
        index = -1;
    }

    void push(char value) {
        if (index > 9) {

        } else {
            bcs[++index] = value;
        }
    }

    int pop() {
        if (index < 0) {

            return 0;
        } else {
            return bcs[index--];
        }
    }
}
