package aims;

import aims.cart.Cart;
import aims.media.Book;
import aims.media.CompactDisc;
import aims.media.DigitalVideoDisc;
import aims.media.Track;

public class Aims {
	  public static void main(String[] args) {

	  Cart cart = new Cart();
	  DigitalVideoDisc dvd = new DigitalVideoDisc("Naruto", "shounen", "Masashi Kishimoto", 20, 19.99f);
      Book book = new Book("Java Programming", 29.99f, "James Gosling");
      CompactDisc cd = new CompactDisc("Trap Music", 14.99f, "DJ Khaled");
      
      Track track1 = new Track("Intro", 3);
      Track track2 = new Track("Main", 5);
      cd.addTrack(track1);
      cd.addTrack(track2);

      
      cart.addMedia(dvd);
      cart.addMedia(book);
      cart.addMedia(cd);
      
      // Print cart before sorting
      cart.print();

      // Sort by title then cost
      cart.sortByTitleCost();
      cart.print();

      // Sort by cost then title
      cart.sortByCostTitle();
      cart.print();

    
    }
}


