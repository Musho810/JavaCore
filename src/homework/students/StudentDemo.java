package homework.students;

import homework.students.command.Command;
import homework.students.model.Lesson;
import homework.students.model.Student;
import homework.students.storage.LessonStorage;
import homework.students.storage.StudentStorage;

import java.util.Scanner;

public class StudentDemo implements Command {


    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        Lesson java = new Lesson("Java", "teacher", 7, 1.5);
        Lesson mysql = new Lesson("mysql", "teacher2", 6, 2.5);
        Lesson php = new Lesson("Php", "teacher3", 5, 3.5);
        lessonStorage.add(java);
        lessonStorage.add(mysql);
        lessonStorage.add(php);
        studentStorage.add(new Student("poxos", "poxosyan", 22, "1111111", "qwerty", java));
        studentStorage.add(new Student("poxos1", "poxosyan1", 2332, "1112221111", "qwerty2", mysql));
        studentStorage.add(new Student("poxos2", "poxosyan2", 2442, "1111133311", "qwerty3", php));
        boolean run = true;
        while (run) {
            System.out.println("please input "  + EXIT + " for exit");
            System.out.println("please input "  + ADD_STUDENT + " for add students");
            System.out.println("please input "  + PRINT_ALL_STUDENTS +  " for print all students");
            System.out.println("please input " + DELETE_STUDENTS + "for delete student by index");
            System.out.println("please input "+ PRINT_STUDENTS_BY_LESSON+" for print student by lesson");
            System.out.println("please input "+PRINT_STUDENTS_COUNT+" for print students count");
            System.out.println("please choose "+ CHANGE_LESSON+" for change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.printArray();
                    break;
                case DELETE_STUDENTS:
                    deleteByIndex();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLessonName();
                    break;
                case PRINT_STUDENTS_COUNT:
                    System.out.println("Students count : " + studentStorage.getSize());
                    break;
                case CHANGE_LESSON:
                    lessonChangeByIndex();
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }


    }


    private static void printStudentsByLessonName() {
        lessonStorage.printArray();
        System.out.println("please input lesson name ");
        String lessonName = scanner.nextLine();

        studentStorage.printStudentsByLessonName(lessonName);
    }

    private static void lessonChangeByIndex() {
        studentStorage.printArray();
        System.out.println("please choose student index");
        int studentIndex = Integer.parseInt(scanner.nextLine());
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        if (studentIndex < 0 || studentIndex >= studentStorage.getSize()) {
            System.out.println("Invalid index");
        } else {
            studentStorage.lessonchange(studentIndex, lessonName);
        }
    }

    private static void deleteByIndex() {
        studentStorage.printArray();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByIndex(index);
    }

    private static void addStudent() {

        if (lessonStorage.getSize() != 0) {
            lessonStorage.printArray();
            System.out.println("Please chose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
            if (lesson == null) {
                System.out.println("Please input correct index");
            } else {
                System.out.println("Please input student's name");
                String name = scanner.nextLine();
                System.out.println("Please input student's surname");
                String surname = scanner.nextLine();
                System.out.println("Please input student's age");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Please input student's phone number");
                String phoneNumber = scanner.nextLine();
                System.out.println("Please input student's city");
                String city = scanner.nextLine();

                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("student created");
            }
        } else {
            System.out.println("Please input lesson");
        }


    }
}
