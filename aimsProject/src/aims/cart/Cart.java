package aims.cart;
import java.util.ArrayList;

import aims.media.Media;
public class Cart {
	  private int maxOrdered = 20;
	  private ArrayList<Media> itemsOrdered = new ArrayList<Media>() ;
	  
	  
    public void addMedia(Media media) {
        if (itemsOrdered.size() < maxOrdered) {
            if (!itemsOrdered.contains(media)) {
                itemsOrdered.add(media);
                System.out.println("Thêm thành công " + media.getTitle());
            } else {
                System.out.println("Khong them duoc do Media đã có trong giỏ hàng.");
            }
        } else {
            System.out.println("Giỏ hàng đã đầy");
        }
    }
	  
	  public void removeMedia(Media media) {
		    if (itemsOrdered.remove(media)) {
		        System.out.println("Xoa thanh công: " + media.getTitle());
		    } else {
		        System.out.println("Khong tim thay media can xóa.");
		    }
	}  

	  public float totalCost(){
	    float totalCost = 0;
	    for(Media media : itemsOrdered) {
	    	totalCost = media.getCost();	   
	    }
	    return totalCost;
	  }

	  public void print(){
	    System.out.println("Gio hang: ");
	    for(Media media : itemsOrdered) {
	    	System.out.println(media.toString());
	    }
	    System.out.println("Total cost: $" + totalCost());
	  }
	  
//	  public void searchById(int id) {
//		  for(DigitalVideoDisc dvd : dvds) {
//			  if(dvd.getId() == id) {
//				  System.out.println("ket qua tim kiem: " + dvd.toString());
//				  return;
//			  }
//		  }
//			  
//		  System.out.println("ko tim thay dvd co id = " + id);
//	  }
//	  
//	  public void searchByTittle(String title) {
//		  for(DigitalVideoDisc dvd : dvds) {
//			  if(dvd.isMatch(title)) {
//				  System.out.println("ket qua tim kiem: " + dvd.toString());
//				  return;
//			  }
//		  }
//		System.out.println("ko tim thay dvd co title = " + title);
//	  }
	    
}

