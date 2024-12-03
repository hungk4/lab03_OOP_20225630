package aims;

import aims.cart.Cart;
import aims.media.Book;
import aims.media.CompactDisc;
import aims.media.DigitalVideoDisc;

public class Aims {
	  public static void main(String[] args) {

        DigitalVideoDisc dvd = new DigitalVideoDisc("Naruto", 19.99f);
        Book book = new Book("Java Programming", 29.99f);
        CompactDisc cd = new CompactDisc("Trap Music", 14.99f);


        Cart cart = new Cart();


        cart.addMedia(dvd);
        cart.addMedia(book);
        cart.addMedia(cd);

        cart.print();

        cart.removeMedia(book);

        cart.print();
    }
}


