package main;

public class Aims {
	  public static void main(String[] args) {
	    Cart myCart = new Cart();

	    DigitalVideoDisc dvd1 = new DigitalVideoDisc("One Piece", "Anime", "Oda", 25, 10.0f);
	    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Naruto", "Anime", "Kishimoto", 20, 8.5f);
	    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Goku", "Action", "Toriyama", 22, 9.0f);

	    myCart.addDVD(dvd1);
	    myCart.addDVD(dvd2);
	    myCart.addDVD(dvd3);

	    myCart.print();

	    myCart.removeDVD(dvd3);
	    myCart.print();
	  }
	}

