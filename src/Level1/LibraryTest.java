package Level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;


class LibraryTest {
    private Library library = new Library();

    @Test
    public void isLibraryEmpty(){
        library.addBook(new Book("Crime and punishment"));
        Assertions.assertFalse(library.getBooks().isEmpty());
    }


    @Test
    public void isSizeCorrect(){
        library.addBook(new Book("The Bible"));
        library.addBook(new Book("Little Women"));
        library.addBook(new Book("Moby Dick"));
        library.addBook(new Book("Pride and prejudice"));
        library.addBook(new Book("Ulysses"));
        library.addBook(new Book("Moby Dick"));
        Assertions.assertEquals(5,library.getBooks().size());
    }

    @Test
    public void isBookCorrectPosition(){
        library.addBook(new Book("The Bible"));
        library.addBook(new Book("Little Women"));
        library.addBook(new Book("Moby Dick"));
        library.addBook(new Book("Pride and prejudice"));
        library.addBook(new Book("Ulysses"));
        library.addBook(new Book("Moby Dick"));
        Book quijote = new Book("Don Quijote de la Mancha");
        library.addBook(quijote);
        Assertions.assertEquals(0,library.getBooks().indexOf(quijote));
    }

    @Test
    public void noDuplicates(){
        library.addBook(new Book("The Bible"));
        library.addBook(new Book("Little Women"));
        library.addBook(new Book("Moby Dick"));
        library.addBook(new Book("Pride and prejudice"));
        library.addBook(new Book("Ulysses"));
        library.addBook(new Book("Moby Dick"));
        library.addBook(new Book("Pride and prejudice"));
        Assertions.assertEquals(new HashSet<>(library.getBooks()).size(),library.getBooks().size());
    }

    @Test
    public void getTitlefromIndex(){
        library.addBook(new Book("The Bible"));
        library.addBook(new Book("Little Women"));
        library.addBook(new Book("Moby Dick"));
        library.addBook(new Book("Pride and prejudice"));
        library.addBook(new Book("Ulysses"));
        library.addBook(new Book("Moby Dick"));
        Assertions.assertEquals("Little Women",library.getBookinIndex(0));
    }

    @Test
    public void isDeleteWorking(){
        library.addBook(new Book("The Bible"));
        library.addBook(new Book("Little Women"));
        library.addBook(new Book("Moby Dick"));
        library.addBook(new Book("Pride and prejudice"));
        library.addBook(new Book("Ulysses"));
        library.addBook(new Book("Moby Dick"));
        library.deleteBook("Moby Dick");
        Assertions.assertEquals(4,library.getBooks().size());
    }

    @Test
    public void isListOrdered(){
        library.addBook(new Book("Crime and punishment"));
        library.addBook(new Book("The Bible"));
        library.addBook(new Book("Little Women"));
        library.addBook(new Book("Moby Dick"));
        library.addBook(new Book("Pride and prejudice"));
        library.addBook(new Book("Ulysses"));
        ArrayList<String> books = new ArrayList<>(Arrays.asList(new String[]{"Crime and punishment", "The Bible", "Little Women", "Moby Dick", "Pride and prejudice", "Ulysses"}));
        Collections.sort(books);
        Assertions.assertEquals(books,library.getBooks().stream().map(Book::getTitle).collect(Collectors.toList()));
    }

}