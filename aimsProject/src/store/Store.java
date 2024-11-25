package store;

import java.util.ArrayList;

import disc.DigitalVideoDisc;

public class Store {
	  public static final int MAX_NUMBERS_ORDERED = 20;
	  private ArrayList<DigitalVideoDisc> itemsInStore ;
	  
	  public Store(){
		  itemsInStore = new ArrayList<>();
	  }

	  public void addDVD(DigitalVideoDisc disc){
	    if(itemsInStore.size() < MAX_NUMBERS_ORDERED){
	    	itemsInStore.add(disc);
	      System.out.println("Them thanh cong DVD vao gio hang");
	    } else {
	      System.out.println("Gio hang het cho trong");
	    }
	  }
	  
	  public void removeDVD(DigitalVideoDisc disc){
		    for(int i = 0; i < itemsInStore.size(); i++){
		      if(itemsInStore.get(i).equals(disc)){
		    	  itemsInStore.remove(i);
		        System.out.println("Da xoa thanh cong");
		        return;
		      }
		    }
		    System.out.println("Khong tim thay DVD trong gio hang");
	} 
}
