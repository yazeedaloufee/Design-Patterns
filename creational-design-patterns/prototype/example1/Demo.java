package example1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Book b1 = new Book(1,"book1");
        System.out.println(b1.clone() == b1);
        System.out.println(b1.clone().equals(b1));

        List<Book> books = new ArrayList<>();
        for (int i =0; i< 10; i++) {
            books.add(new Book(i,"bookname " + i));
        }

        BookShop bs = new BookShop("theBookShop");

        bs.setBooks(books);
        BookShop clonedBS = bs.clone();
        bs.getBooks().remove(0);

        System.out.println(bs);
        System.out.println(clonedBS);
    }
}
