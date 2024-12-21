package aims.cart;
import java.util.Collections;

import aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class Cart {
	  private int maxOrdered = 20;
	  private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	  
	  public ObservableList<Media> getItemsOrdered() {
	        return itemsOrdered;
	  }
	  public void clear() {
	        itemsOrdered.clear();
	   }
	  public void addMedia(Media media) {
	        if (itemsOrdered.size() < maxOrdered) {
	            if (!itemsOrdered.contains(media)) {
	                itemsOrdered.add(media);
	                System.out.println("Thêm thành công " + media.getTitle());
	            } else {
	                System.out.println("Không thêm được do Media đã có trong giỏ hàng.");
	            }
	        } else {
	            System.out.println("Giỏ hàng đã đầy");
	        }
	  }
		  
	  public void removeMedia(Media media) {
		    if (itemsOrdered.remove(media)) {
		        System.out.println("Xoa thanh công: " + media.getTitle());
		    } else {
		        System.out.println("Không tìmm thấy media cần xóa.");
		    }
	}  

	  public float totalCost(){
	    float totalCost = 0;
	    for(Media media : itemsOrdered) {
	    	totalCost = media.getCost();	   
	    }
	    return totalCost;
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
	  
	    // Sort by title then cost
	    public void sortByTitleCost() {
	        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	        System.out.println("Sorted by title, then cost.");
	    }

	    // Sort by cost then title
	    public void sortByCostTitle() {
	        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	        System.out.println("Sorted by cost, then title.");
	    }

	    public void print() {
	        System.out.println("Gio hang :");
	        for (Media media : itemsOrdered) {
	            System.out.println(media.toString());
	        }
	    }
	    
	    public int numberOfMedia() {
	    	return itemsOrdered.size();
	    }
	    
}

