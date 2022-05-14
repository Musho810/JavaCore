package lessons;

public class Sort {
//    static void sort(int[] arr) {
//        int mLength = arr.length;
//        int temp ;
//        for (int i = 0; i <  mLength; i++) {
//            for (int j = 1; j < (mLength - i); j++) {
//                if (arr[j - 1] > arr[j]) {
//                    temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//        int[] arr = {3, 5, 76, 1, 34444, 540, 89,777,7};
//        System.out.println("Array before Sort");
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//
//        System.out.println();
//        sort(arr);
//        System.out.println("Array After Sort");
//        for (int j : arr) {
//            System.out.print(j + "  ");
//        }
//    }
static void bubbleSort(int[] arr) {
    int mLength = arr.length;
    int temp ;
    for (int i = 0; i < mLength; i++) {
        for (int j = 1; j < (mLength - i); j++) {
            if (arr[j - 1] > arr[j]) {
                temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5,877777,32};
        System.out.println("Array Before Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Array After Bubble Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
