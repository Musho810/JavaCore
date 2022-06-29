package homework.students;

import java.util.Scanner;

public class StudentDemo {


    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        studentStorage.add(new Student("poxos", "poxosyan", 22, "1111111", "qwerty", "php"));
        studentStorage.add(new Student("poxos1", "poxosyan1", 2332, "1112221111", "qwerty2", "php"));
        studentStorage.add(new Student("poxos2", "poxosyan2", 2442, "1111133311", "qwerty3", "php"));
        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add student");
            System.out.println("please input 2 for print all students");
            System.out.println("please input 3 for delete student by index");
            System.out.println("please input 4 for print student by lesson");
            System.out.println("please input 5 for print students count");
            System.out.println("please choose 6 for change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.printArray();
                    break;
                case 3:
                    deleteByIndex();
                    break;
                case 4:
                    printStudentsByLessonName();
                    break;
                case 5:
                    System.out.println("Students count : " + studentStorage.getSize());
                    break;
                case 6:
                    lessonChangeByIndex();
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }


    }

    private static void printStudentsByLessonName() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLessonName(lessonName);
    }

    private static void lessonChangeByIndex() {
        studentStorage.printArray();
        System.out.println("please choose student index");
        int studentIndex = Integer.parseInt(scanner.nextLine());
        System.out.println("please input lesson name");
        String lessonNameChange = scanner.nextLine();
        studentStorage.lessonChangeByIndex(studentIndex, lessonNameChange);
        System.out.println("lesson name changed");
        studentStorage.printArray();
    }

    private static void deleteByIndex() {
        studentStorage.printArray();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByIndex(index);
    }

    private static void addStudent() {
        System.out.println("Please input student's name");
        String name = scanner.nextLine();
        System.out.println("Please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student's age");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student's phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student's city");
        String city = scanner.nextLine();
        System.out.println("Please input student's lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);

        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("student created");

    }
}
