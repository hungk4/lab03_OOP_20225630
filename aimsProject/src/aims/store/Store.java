package aims.store;

import java.util.ArrayList;

import aims.media.Media;

public class Store {
	  public static int maxOrdered = 20;
	  private ArrayList<Media> itemsInStore ;
	  
	  public Store(){
		  itemsInStore = new ArrayList<Media>();
	  }

	  public void addMedia(Media media) {
		  if(itemsInStore.size() < maxOrdered) {
			  itemsInStore.add(media);
			  System.out.println("them thanh cong " + media.getTitle());;
		  } else {
			  System.out.println("gio hang da day");
		  }
	  }
	  
	  public void removeMedia(Media media) {
		    if (itemsInStore.remove(media)) {
		        System.out.println("Xoa thanh công: " + media.getTitle());
		    } else {
		        System.out.println("Khong tim thay media can xóa.");
		    }
	}  
}
