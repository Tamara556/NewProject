package homework1.bookStorage;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size;

    public void add(Book book) {
        if (books.length == size) {
            extendStorage();
        }
        books[size++] = book;
    }

    private void extendStorage() {
        Book[] tmp = new Book[size + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchBookByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public Book getBookById(String id) {
        for (int i = 0; i < size; i++) {
            if (books[i].getId().equals(id)) {
                return books[i];
            }
        }
        return null;
    }

    public void deleteBookById(String id) {
        for (int i = 0; i < size; i++) {
            if (books[i].getId().equals(id)) {
                System.arraycopy(books, i + 1, books, i, size - i - 1);
                books[--size] = null;
                System.out.println("Book with ID " + id + " has been deleted.");
                return;
            }
        }
        System.out.println("Book with ID " + id + " not found.");
    }
    public void searchBooksByPriceRange(double minPrice, double maxPrice) {
        for (int i = 0; i < size; i++) {
            double price = books[i].getPrice();
            if (price >= minPrice && price <= maxPrice) {
                System.out.println(books[i]);
            }
        }
    }
}