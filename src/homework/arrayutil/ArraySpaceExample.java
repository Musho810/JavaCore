package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
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
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+ "  ");
        }

        }
    }

