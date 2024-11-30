package aims;

import aims.cart.Cart;
import aims.media.DigitalVideoDisc;

public class Aims {
	  public static void main(String[] args) {
	    Cart myCart = new Cart();

	    DigitalVideoDisc dvd1 = new DigitalVideoDisc("One Piece", "Anime", "Oda", 25, 1);
	    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Naruto", "Anime", "Kishimoto", 20, 2);
	    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Goku", "Action", "Toriyama", 22, 3);
	    DigitalVideoDisc dvd4 = new DigitalVideoDisc("Doraemon");
	    DigitalVideoDisc dvd5 = new DigitalVideoDisc("Shin", "Cartoon", "xyz", 5);

	    myCart.addDVD(dvd1, dvd2, dvd3);
//	    myCart.addDVD(dvd2);
//	    myCart.addDVD(dvd3);
		myCart.removeDVD(dvd3);
		myCart.print();
	    
	    myCart.searchById(2);
	    myCart.searchByTittle("bo gia");


	  }
	}

