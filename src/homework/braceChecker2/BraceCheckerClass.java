package homework.braceChecker2;

public class BraceCheckerClass {
    BraceCheckerClass(String text) {

        BraceStack stack = new BraceStack();

        boolean noProblem = true;
        int pop;
        for (int i = 0; i < text.length(); i++) {
            char tmp = text.charAt(i);
            switch (tmp) {
                case '(':
                case '{':
                case '[':
                    stack.push(tmp);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        noProblem = false;
                        System.out.println("Error : You have unopened brackets  " + tmp + "  at  " + i);
                    } else if (pop != '(') {
                        noProblem = false;
                        System.out.println("Error:  Opened  " + tmp + "  but closed  " + (char) pop + "  at  " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        noProblem = false;
                        System.out.println("Error : You have unopened brackets  " + tmp + "  at  " + i);
                    } else if (pop != '{') {
                        noProblem = false;
                        System.out.println("Error:  Opened  " + tmp + "  but closed  " + (char) pop + "  at  " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        noProblem = false;
                        System.out.println("Error : You have unopened brackets  " + tmp + "  at  " + i);
                    } else if (pop != '[') {
                        noProblem = false;
                        System.out.println("Error:  Opened  " + tmp + "but closed  " + (char) pop + "  at  " + i);
                    }
                    break;
            }
        }
        int end;
        while ((end = stack.pop()) != 0) {
            noProblem = false;
            System.out.println("You have unbound brackets  " + (char) end);
        }
        if (noProblem) {
            System.out.println("Your text is correctly");
        }
    }
}

