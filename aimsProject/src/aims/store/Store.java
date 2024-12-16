package aims.store;

import java.util.ArrayList;

import aims.media.Book;
import aims.media.CompactDisc;
import aims.media.DigitalVideoDisc;
import aims.media.Media;
import aims.media.Track;

public class Store {
	  public static int maxOrdered = 20;
	  private ArrayList<Media> itemsInStore ;
	  
	  public Store(){
		  itemsInStore = new ArrayList<Media>();
		  initializeStore();
	  }
	  
	  private void initializeStore() {
	        // Thêm các sản phẩm mặc định vào cửa hàng
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Naruto", "shounen", "Masashi Kishimoto", 20, 19.99f);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Doreamon", "shounen", "xyz", 20, 18.99f);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Goku", "shounen", "xyz", 20, 25.99f);
	        
	        Book book1 = new Book("Java Programming", "James Gosling", 29.99f);
	        Book book2 = new Book("C++", "manh hung", 29.99f);
	        Book book3 = new Book("Python", "manh hung", 29.99f);
	        
	        Track track1 = new Track("Intro", 3);
	        Track track2 = new Track("Main", 5);
	        CompactDisc cd = new CompactDisc("Trap Music", "DJ Khaled", 14.99f);
	        cd.addTrack(track1);
	        cd.addTrack(track2);
	        
	        // Thêm các sản phẩm vào store
	        itemsInStore.add(dvd1);
	        itemsInStore.add(dvd2);
	        itemsInStore.add(dvd3);
	        itemsInStore.add(book1);
	        itemsInStore.add(book2);
	        itemsInStore.add(book3);
	        itemsInStore.add(cd);
	    }

	  public void addMedia(Media media) {
		  if(itemsInStore.size() < maxOrdered) {
			  itemsInStore.add(media);
//			  System.out.println("them thanh cong " + media.getTitle());;
		  } else {
//			  System.out.println("gio hang da day");
		  }
	  }
	  
	  public void removeMedia(Media media) {
		   if (itemsInStore.remove(media)) {
//		        System.out.println("Xoa thanh công: " + media.getTitle());
		    } else {
//		        System.out.println("Khong tim thay media can xóa.");
		    }
	  }  
	  
	  public Media searchByTitle(String title) {
		  for(Media media : itemsInStore) {
			 if(media.isMatch(title)) return media;
		  }
		  return null;
	  }

	  public void print() {
		  System.out.println("Store :");
		  for (Media media : itemsInStore) {
            System.out.println(media.getTitle() + " - " + media.getCost() + "$");
		  }
	  }
	  
	  public ArrayList<Media> getItemsInStore(){
		  return this.itemsInStore;
	  }
	  

}
