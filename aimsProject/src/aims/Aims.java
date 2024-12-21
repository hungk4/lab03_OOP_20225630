package aims;

import aims.screen.StoreScreen;
import aims.store.Store;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
        new StoreScreen(store);
	}
}
