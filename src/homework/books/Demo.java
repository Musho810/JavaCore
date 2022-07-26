//package homework.books;
//
//import homework.books.book.*;
//import homework.books.commands.BookInterface;
//import homework.books.commands.LoginCommands;
//import homework.books.storage.AuthorStorage;
//import homework.books.storage.BookStorage;
//import homework.books.storage.UserStorage;
//
//import java.util.Scanner;
//
//public class Demo implements BookInterface, LoginCommands {
//    static Scanner scanner = new Scanner(System.in);
//    private static BookStorage bookStorage = new BookStorage();
//    private static AuthorStorage authorStorage = new AuthorStorage();
//    private static UserStorage userStorage = new UserStorage();
//
//    public static void main(String[] args) {
//        boolean run1 = true;
//        initData();
//        while (run1) {
//            System.out.println("Please input " + COMMAND_EXIT + " for exit");
//            System.out.println("Please input " + LOG_IN + " for log in");
//            System.out.println("Please input " + REGISTRATION + " for registration user");
//            int command1 = Integer.parseInt(scanner.nextLine());
//            switch (command1) {
//                case COMMAND_EXIT:
//                    run1 = false;
//                    break;
//                case LOG_IN:
//                    loginInterface();
//                    break;
//                case REGISTRATION:
//                    registration();
//                    break;
//                default:
//                    System.out.println("please input correct index");
//                    break;
//            }
//        }
//
//        boolean run = true;
//        initData();
//        while (run) {
//            System.out.println("Please input " + LOG_OUT + " for log out");
//            System.out.println("Please input " + ADD_BOOK + " for add book");
//            System.out.println("Please input " + PRINT_ALL + " for print all book");
//            System.out.println("Please input " + PRINT_BY_AUTHOR + " for print book by author name");
//            System.out.println("Please input " + PRINT_BY_GENRE + " for print book by genre");
//            System.out.println("Please input " + PRINT_BY_PRICE + " for print book by price range");
//
//            int command = Integer.parseInt(scanner.nextLine());
//            switch (command) {
//                case LOG_OUT:
//                    run = false;
//                    break;
//                case ADD_BOOK:
//                    addBook();
//                    break;
//                case PRINT_ALL:
//                    printall();
//                    break;
//                case PRINT_BY_AUTHOR:
//                    printByAuthor();
//                    break;
//                case PRINT_BY_GENRE:
//                    printByGenre();
//                    break;
//                case PRINT_BY_PRICE:
//                    printByPrice();
//                    break;
//                case ADD_AUTHOR:
//                    addauthor();
//                    break;
//                case PRINT_ALL_AUTHOR:
//                    authorStorage.printall();
//                    break;
//                default:
//                    System.out.println("please input correct index");
//                    break;
//            }
//        }
//
//    }
//
//    private static void registration() {
//        if()
//        userStorage.add();
//    }
//
//    private static void loginInterface() {
//        System.out.println("please input email and password by ,");
//        String data = scanner.nextLine();
//        String[] dataStr = data.split(",");
//        User userByEmail = userStorage.getUserByEmail(dataStr[0]);
//        if (userByEmail == null) {
//            System.out.println("Incorrect email or password");
//        } else {
//            if (!userByEmail.getPassword().equals(dataStr[1])) {
//                System.out.println("Incorrect email or password");
//            } else {
//                if (userByEmail.getUserType().equals(UserType.ADMIN)) {
//                    adminCommands(userByEmail);
//                } else {
//                    userCommands(userByEmail);
//                }
//            }
//        }
//    }
//
//    private static void userCommands(User userByEmail) {
//        boolean run = true;
//        initData();
//        while (run) {
//            System.out.println("Please input " + LOG_OUT + " for log out");
//            System.out.println("Please input " + PRINT_ALL + " for print all book");
//            System.out.println("Please input " + PRINT_BY_AUTHOR + " for print book by author name");
//            System.out.println("Please input " + PRINT_BY_GENRE + " for print book by genre");
//            System.out.println("Please input " + PRINT_BY_PRICE + " for print book by price range");
//
//            int command = Integer.parseInt(scanner.nextLine());
//            switch (command) {
//                case LOG_OUT:
//                    run = false;
//                    break;
//                case PRINT_ALL:
//                    printall();
//                    break;
//                case PRINT_BY_AUTHOR:
//                    printByAuthor();
//                    break;
//                case PRINT_BY_GENRE:
//                    printByGenre();
//                    break;
//                case PRINT_BY_PRICE:
//                    printByPrice();
//                    break;
//                case PRINT_ALL_AUTHOR:
//                    authorStorage.printall();
//                    break;
//                default:
//                    System.out.println("please input correct index");
//                    break;
//            }
//        }
//    }
//
//    private static void adminCommands(User userByEmail) {
//        boolean run = true;
//        initData();
//        while (run) {
//            System.out.println("Please input " + LOG_OUT + " for log out");
//            System.out.println("Please input " + ADD_BOOK + " for add book");
//            System.out.println("Please input " + PRINT_ALL + " for print all book");
//            System.out.println("Please input " + PRINT_BY_AUTHOR + " for print book by author name");
//            System.out.println("Please input " + PRINT_BY_GENRE + " for print book by genre");
//            System.out.println("Please input " + PRINT_BY_PRICE + " for print book by price range");
//
//            int command = Integer.parseInt(scanner.nextLine());
//            switch (command) {
//                case LOG_OUT:
//                    run = false;
//                    break;
//                case ADD_BOOK:
//                    addBook();
//                    break;
//                case PRINT_ALL:
//                    printall();
//                    break;
//                case PRINT_BY_AUTHOR:
//                    printByAuthor();
//                    break;
//                case PRINT_BY_GENRE:
//                    printByGenre();
//                    break;
//                case PRINT_BY_PRICE:
//                    printByPrice();
//                    break;
//                case ADD_AUTHOR:
//                    addauthor();
//                    break;
//                case PRINT_ALL_AUTHOR:
//                    authorStorage.printall();
//                    break;
//                default:
//                    System.out.println("please input correct index");
//                    break;
//            }
//        }
//
//    }
//
//    private static void addauthor() {
//        System.out.println("please input author name");
//        String name = scanner.nextLine();
//        System.out.println("Please input author surname");
//        String surname = scanner.nextLine();
//        System.out.println("Please input author email");
//        String email = scanner.nextLine();
//        System.out.println("please input author gender");
//        Gender gender = Gender.valueOf(scanner.nextLine());
//
//        Author author = new Author(name, surname, email, gender);
//        authorStorage.add(author);
//        System.out.println("Author created");
//
//    }
//
//    private static void printall() {
//        bookStorage.printall();
//    }
//
//    private static void printByPrice() {
//        System.out.println("please input min price ");
//        String minpriceStr = scanner.nextLine();
//        System.out.println("please input max price");
//        String maxpriceStr = scanner.nextLine();
//
//
//        double minprice = Double.parseDouble(minpriceStr);
//        double maxprice = Double.parseDouble(maxpriceStr);
//        bookStorage.printByPrice(minprice, maxprice);
//    }
//
//    private static void printByGenre() {
//        System.out.println("please input genre");
//        String genre = scanner.nextLine();
//        bookStorage.printByGenre(genre);
//    }
//
//    private static void printByAuthor() {
//        System.out.println("please input author name");
//        String authorName = scanner.nextLine();
//        bookStorage.printByAuthor(authorName);
//    }
//
//
//    private static void addBook() {
//        if (authorStorage.getSize() != 0) {
//            authorStorage.printall();
//            System.out.println("Please input author by index");
//            int index = Integer.parseInt(scanner.nextLine());
//            Author author = authorStorage.getAuthorByIndex(index);
//            if (author == null) {
//                System.out.println("Please input correct index");
//            } else {
//                System.out.println("Please input book's title");
//                String title = scanner.nextLine();
//
//                System.out.println("Please input book's price");
//                String priceStr = scanner.nextLine();
//                System.out.println("Please input book's count");
//                String countStr = scanner.nextLine();
//                System.out.println("Please input book's genre");
//                String genre = scanner.nextLine();
//
//                double price = Double.parseDouble(priceStr);
//                int count = Integer.parseInt(countStr);
//
//                Book book = new Book(title, author, price, count, genre);
//                bookStorage.addBook(book);
//                System.out.println("book saved");
//            }
//        } else {
//            System.out.println("Please input author for add book");
//            addauthor();
//        }
//    }
//
//    private static void initData() {
//        User admin = new User("admin", "admin", "admin@mail.com", "admin", UserType.ADMIN);
//        userStorage.add(admin);
//        User user = new User("poxos", "poxosyan", "poxos@mail.com", "poxos", UserType.USER);
//        userStorage.add(user);
//
//    }
//
//
//}
