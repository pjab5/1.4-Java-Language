package Level1;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        for (Book novel: books){
            if(Objects.equals(book.getTitle(), novel.getTitle())){
                return;
            }
        }
        books.add(book);
        sort(books);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public String getBookinIndex(int i){
        return books.get(i).getTitle();
    }

    public void addBookinIndex(Book book, int i){
        books.add(i,book);
    }

    public void deleteBook(String title){
        books.removeIf(book -> Objects.equals(book.getTitle(), title));
    }

    public static void sort(ArrayList<Book> books){
        books.sort((book1,book2)->book1.getTitle().compareTo(book2.getTitle()));
    }

}
