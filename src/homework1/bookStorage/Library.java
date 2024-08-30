package homework1.bookStorage;

import java.util.Scanner;

public class Library {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_BOOK = "1";
    private static final String PRINT_ALL_BOOKS = "2";
    private static final String SEARCH_BOOK_BY_NAME = "3";
    private static final String UBDATE_BOOK = "4";
    private static final String DELETE_BOOK = "5";
    private static final String SEARCH_BY_PRICE = "6";

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_NAME:
                    searchBookByName();
                    break;
                case UBDATE_BOOK:
                    updateBook();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                case SEARCH_BY_PRICE:
                    searchBooksByPrice();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }

    }

    private static void searchBooksByPrice() {
        System.out.println("Please input minimum price");
        double minPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input maximum price");
        double maxPrice = Double.parseDouble(scanner.nextLine());
        bookStorage.searchBooksByPriceRange(minPrice, maxPrice);
    }

    private static void deleteBook() {
        System.out.println("Please input book ID to delete");
        String bookId = scanner.nextLine();
        bookStorage.deleteBookById(bookId);
    }

    private static void updateBook() {
        bookStorage.print();
        System.out.println("Please input book ID");
        String bookId = scanner.nextLine();
        Book bookById = bookStorage.getBookById(bookId);
        if (bookById != null) {
            System.out.println("Please input book'n new title");
            String title = scanner.nextLine();
            System.out.println("Please input author's new name");
            String authorName = scanner.nextLine();
            System.out.println("Please input book's new price");
            String priceStr = scanner.nextLine();
            if (title != null && !title.isEmpty()) {
                bookById.setTitle(title);
            }
            if (authorName != null && !authorName.isEmpty()) {
                bookById.setAuthorName(authorName);
            }
            if (priceStr != null && !priceStr.isEmpty()){
                bookById.setPrice(Double.parseDouble(priceStr));
            }
            System.out.println("Update was successfully");
        }
    }

    private static void searchBookByName() {
        System.out.println("Please input book keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchBookByName(keyword);
    }

    private static void addBook() {
        System.out.println("Please input book ID");
        String id = scanner.nextLine();
        System.out.println("Please input book title");
        String title = scanner.nextLine();
        System.out.println("Please input author's name");
        String authorName = scanner.nextLine();
        System.out.println("Please input book price");
        double price = Double.parseDouble(scanner.nextLine());
        Book book = new Book(id, title, authorName, price);
        Book bookById = bookStorage.getBookById(id);
        if (bookById == null) {
            bookStorage.add(book);
            System.out.println("Book added!");
        } else {
            System.out.println("Book with " + id + " already exists!");
        }
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_BOOK + " for ADD_BOOK");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for PRINT_ALL_BOOKS");
        System.out.println("Please input " + SEARCH_BOOK_BY_NAME + " for SEARCH_BOOK_BY_NAME");
        System.out.println("Please input " + UBDATE_BOOK + " for UPDATE_BOOK");
        System.out.println("Please input " + DELETE_BOOK + " for DELETE_BOOK");
        System.out.println("Please input " + SEARCH_BY_PRICE + " for SEARCH_BY_PRICE");
    }
}
