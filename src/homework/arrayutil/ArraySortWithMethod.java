package homework.arrayutil;

public class ArraySortWithMethod {


    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    double avg(int[] array) {
        double avg = 0.0;
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / array.length;
        return avg;
    }

    int Even(int[] array) {
        System.out.print("Even numbers :  ");
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "  ");
                countEven++;
            }
        }

        return countEven;


    }

    int Odd(int[] array) {
        System.out.print("Odd numbers :  ");
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOdd++;
                System.out.print(array[i] + "  ");
            }
        }
        return countOdd;

    }

    String SortArray(int[] array) {
        System.out.print(" in descending order ");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + "  ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        System.out.print(" in the ascending order ");
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + "  ");
        }
        System.out.println();
        return "The Array was sorted";
    }
char[] ArrayWithoutSpace (char[] spaceArray){
    int countOfSpaseFirst = 0;
    int countOfSpaseLast = 0;
    char spase = ' ';
    for (int i = 0; i < spaceArray.length; i++) {
        if (spaceArray[i] == spase) {
            countOfSpaseFirst++;
        } else break;
    }
    for (int j = spaceArray.length - 1; j >= 0; j--) {
        if (spaceArray[j] == spase) {
            countOfSpaseLast++;
        } else break;
    }
    char [] result = new char [(spaceArray.length-countOfSpaseFirst-countOfSpaseLast)];
    int indexResult=0;
    for (int k=countOfSpaseFirst;k<spaceArray.length-countOfSpaseLast;k++){
        result[indexResult]=spaceArray[k] ;
        indexResult++;
    }
    return result;
}
int quantityOfLettersO (char[] chars) {
    char c = 'o';
    int countOfO = 0;
    for (int i = 0; i < chars.length; i++) {
        if (chars[i] == c) {
            countOfO++;
        }
    }
    return countOfO;
}
char[] theMiddleCharacters (char [] chars2) {
    char[] mid1 = new char[2];
    char[] mid2 = new char[3];
    System.out.print(" The middle characters of array is     ");
    if (chars2.length % 2 == 0) {
        mid1[0] = chars2[chars2.length / 2 - 1];
        mid1[1] = chars2[chars2.length / 2];
        return mid1;
    } else {
        mid2[0] = chars2[chars2.length / 2 - 1];
        mid2[1] = chars2[chars2.length / 2];
        mid2[2] = chars2[chars2.length / 2 + 1];
        return mid2;
    }
}
boolean charctersLY (char [] chars3) {
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            return true;
        } else {
           return false;
        }
    }
    boolean bob (char[] bobArray){
        char letterB = 'b';
        int bob = 0;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == letterB && bobArray[i + 2] == letterB) {
                bob++;
            }
        }
        if (bob != 0) {
            return true;
        } else {
           return false;
        }
    }
    String textWithoutSpace (char[] text) {
        System.out.print ("Text without space is   _   " );
        char space = ' ';
        for (int i = 0; i < text.length; i++) {
            if (text[i]!=space){
                System.out.print(text[i]);
            }
        }
        System.out.println();
        return " The characters space is deleted " ;
    }
}



