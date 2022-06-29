package homework.books;

import java.util.Scanner;

public class Demo implements BookInterface {
    static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        bookStorage.addBook(new Book("aaa","aaaa",1.2,1,"aaaaa"));
        bookStorage.addBook(new Book("bbb","bbbb",2.3,2,"bbbbb"));
        bookStorage.addBook(new Book("ccc","cccc",3.4,3,"ccccc"));
        boolean run = true;

        while (run) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add book");
            System.out.println("Please input 2 for print all book");
            System.out.println("Please input 3 for print book by author name");
            System.out.println("Please input 4 for print book by genre");
            System.out.println("Please input 5 for print book by price range");

        int command = Integer.parseInt(scanner.nextLine());
        switch (command) {
            case commandExit:
                run = false;
                break;
            case addBook:
                addBook();
                break;
            case printall:
                printall();
                break;
            case printByAuthor:
                printByAuthor();
                break;
            case printByGenre:
                printByGenre();
                break;
            case printByPrice:
                printByPrice();
                break;

        }
    }

    }

    private static void printall() {
        bookStorage.printall();
    }

    private static void printByPrice() {
        System.out.println("please input min price ");
        String minpriceStr = scanner.nextLine();
        System.out.println("please input max price");
        String maxpriceStr = scanner.nextLine();


        double minprice = Double.parseDouble(minpriceStr);
        double maxprice = Double.parseDouble(maxpriceStr);
        bookStorage.printByPrice(minprice, maxprice);
    }

    private static void printByGenre() {
        System.out.println("please input genre");
        String genre = scanner.nextLine();
        bookStorage.printByGenre(genre);
    }

    private static void printByAuthor() {
        System.out.println("please input author name");
        String authorName = scanner.nextLine();
        bookStorage.printByAuthor(authorName);
    }


    private static void addBook() {
        System.out.println("Please input book's title");
        String title = scanner.nextLine();
        System.out.println("Please input book's author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input book's price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input book's count");
       String countStr = scanner.nextLine();
        System.out.println("Please input book's genre");
        String genre = scanner.nextLine();

        double price = Double.parseDouble(priceStr);
        int count = Integer.parseInt(countStr);

        Book book = new Book (title,authorName,price,count,genre);
        bookStorage.addBook(book);
        System.out.println("book saved");
    }
}