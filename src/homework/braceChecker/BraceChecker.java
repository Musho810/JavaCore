package homework.braceChecker;


public class BraceChecker {
    public String text;


    BraceChecker(String text) {

        this.text = text;


    }

    BraceCheckerStack bcs = new BraceCheckerStack();

    void braceChecker(String text) {
        char open1 = '(';
        char open2 = '[';
        char open3 = '{';
        char close1 = ')';
        char close2 = ']';
        char close3 = '}';

        char pop;


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(' || text.charAt(i) == '{' || text.charAt(i) == '[') {
                if (i < text.length() - 1) {
                    bcs.push(text.charAt(i));
                } else {
                    System.out.println("You have unbound brackets at  " + i);
                }

            } else if (text.charAt(i) == ')' || text.charAt(i) == '}' || text.charAt(i) == ']') {
                pop = (char) bcs.pop();
                if (pop != 0) {
                    if (text.charAt(i) == close1 && pop == open1 || text.charAt(i) == close2 && pop == open2 || text.charAt(i) == close3 && pop == open3) {
                        continue;
                    } else {
                        System.out.println("Error: opened " + pop + "  but closed  " + text.charAt(i) + "   at " + i);
                    }
                } else {
                    System.out.println("You have unopened brackets at  " + i);
                }
            } else if (i == text.length() - 1) {
                pop = (char) bcs.pop();
                if (pop != 0) {
                    System.out.println("You have unbound brackets");
                }


            }


        }
    }
}




