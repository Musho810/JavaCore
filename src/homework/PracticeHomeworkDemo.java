package homework;

public class PracticeHomeworkDemo {

    public static void main(String[] args) {
        int[] array1 = new int[]{2, 5, 67, 21, -67};
        int[] array2 = new int[]{2, 23, 67, 88885, 67, 21, -67};

        PracticeHomework ph = new PracticeHomework();
        System.out.println(ph.calcAge(10));

        System.out.println(ph.convertTime(345));

        System.out.println(ph.lessThanOrEqualToZero(34));

        System.out.println(ph.reverseBool(false));

        System.out.println(ph.isSameNum(3, -5));

        System.out.println(ph.nextNumber(0));

        System.out.println(ph.maxLength(array1, array2));

    }
}
