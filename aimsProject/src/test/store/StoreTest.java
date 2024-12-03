package test.store;

import aims.media.DigitalVideoDisc;
import aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
	    Store store = new Store();

	    DigitalVideoDisc dvd1 = new DigitalVideoDisc("One Piece", "Anime", "Oda", 25, 1);
	    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Naruto", "Anime", "Kishimoto", 20, 2);
	    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Goku", "Action", "Toriyama", 22, 3);

	    store.addMedia(dvd1);
	    store.addMedia(dvd2);
	    store.addMedia(dvd3);
		store.removeMedia(dvd3);

		
	}
}
