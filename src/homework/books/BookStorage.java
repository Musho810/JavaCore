package homework.books;

public class BookStorage implements BookInterface {
    private static Book[] array = new Book[10];
    private static int size = 0;


    public void addBook(Book book) {
        if (array.length == size) {
            extend();
        }
        array[size++] = book;
    }

    private void extend() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void printall() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }

    public void printByAuthor(String authorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(authorName)) {
                System.out.println(array[i]);
            }
        }
    }

    public void printByGenre(String genre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);
            }
        }
    }

    public void printByPrice(double minprice, double maxprice) {
        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() > minprice && array[i].getPrice() < maxprice) {
                System.out.println(array[i]);
            }
        }
    }
}

