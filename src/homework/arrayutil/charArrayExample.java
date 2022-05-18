package homework.arrayutil;

public class charArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int counOfO = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                counOfO++;
            }
        }
        System.out.println("Quantity of letters 'o'  ->  " + counOfO);
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};
        if (chars2.length % 2 == 0) {
            System.out.print(chars2[chars2.length / 2 - 1]);
            System.out.println(chars2[chars2.length / 2]);
        } else {
            System.out.print(chars2[chars2.length / 2 - 1]);
            System.out.print(chars2[chars2.length / 2]);
            System.out.println(chars2[chars2.length / 2 + 1]);
        }
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        char letterB = 'b';
        int bob = 0;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == letterB && bobArray[i + 2] == letterB) {
                bob++;
            }
        }
        if (bob != 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char probel = ' ';
        for (int i = 0; i < text.length; i++) {
            if (text[i] != probel) {
                System.out.print(text[i]);
            }
        }
    }
}