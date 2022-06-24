package homework.students;

import java.util.Scanner;

public class StudentDemo {


    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
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
                    studentStorage.printArray();
                    System.out.println("please choose student index");
                    int index = Integer.parseInt(scanner.nextLine());
                    studentStorage.deleteByIndex(index);
                    break;
                case 4:
                    System.out.println("please input lesson name");
                    String lessonName = scanner.nextLine();
                    studentStorage.printStudentsByLessonName(lessonName);
                    break;
                case 5:
                    System.out.print("Students count : ");
                    System.out.println(studentStorage.getSize());
                    break;
                case 6:
                    studentStorage.printArray();
                    System.out.println("please choose student index");
                    int studentIndex = Integer.parseInt(scanner.nextLine());
                    System.out.println("please input lesson name");
                    String lessonNameChange = scanner.nextLine();
                    studentStorage.lessonChangeByIndex(studentIndex, lessonNameChange);
                    studentStorage.printArray();
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }


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
