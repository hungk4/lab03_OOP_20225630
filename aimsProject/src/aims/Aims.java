package aims;

import aims.cart.Cart;
import aims.media.Book;
import aims.media.DigitalVideoDisc;
import aims.media.Media;

public class Aims {
	  public static void main(String[] args) {

	  Cart cart = new Cart();
	  Media dvd = new DigitalVideoDisc("Naruto", 19.99f);
	  Media book = new Book("Java Programming", 29.99f);
	  cart.addMedia(dvd);
	  cart.addMedia(book);


	  Media duplicateDVD = new DigitalVideoDisc("Naruto", 19.99f);
	  cart.addMedia(duplicateDVD);
    }
}


