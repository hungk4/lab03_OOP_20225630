package test.store;

import store.Store;
import cart.Cart;
import disc.DigitalVideoDisc;

public class StoreTest {
	public static void main(String[] args) {
	    Store store = new Store();

	    DigitalVideoDisc dvd1 = new DigitalVideoDisc("One Piece", "Anime", "Oda", 25, 1);
	    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Naruto", "Anime", "Kishimoto", 20, 2);
	    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Goku", "Action", "Toriyama", 22, 3);

	    store.addDVD(dvd1);
	    store.addDVD(dvd2);
	    store.addDVD(dvd3);
		store.removeDVD(dvd3);

		
	}
}
