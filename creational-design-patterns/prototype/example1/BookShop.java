package example1;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;
    private List<Book> books = new ArrayList<>();

    public BookShop(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    @Override
    public BookShop clone() {
        try {  BookShop bs = (BookShop) super.clone();
            List<Book> books= new ArrayList<>();
            for(Book book : this.books){
                books.add(book.clone());
            }
            bs.setBooks(books);
            return bs;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopeName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
