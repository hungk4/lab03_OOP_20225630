package aims.cart;
import java.util.ArrayList;

import aims.media.DigitalVideoDisc;
public class Cart {
	  public static final int MAX_NUMBERS_ORDERED = 20;
	  private ArrayList<DigitalVideoDisc> dvds ;
	  
	  public Cart(){
		  dvds = new ArrayList<>();
	  }

	  public void addDVD(DigitalVideoDisc disc){
	    if(dvds.size() < MAX_NUMBERS_ORDERED){
	    	dvds.add(disc);
	      System.out.println("Them thanh cong DVD vao gio hang");
	    } else {
	      System.out.println("Gio hang het cho trong");
	    }
	  }
//	  public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
//		  addDVD(disc1);
//		  addDVD(disc2);
//	  }
	  
//	  public void addDVD(DigitalVideoDisc[] dvdList) {
//		  for(DigitalVideoDisc dvd : dvdList) {
//			  addDVD(dvd);
//		  }
//	  }
	  
	  public void addDVD(DigitalVideoDisc... dvds) {
		  for(DigitalVideoDisc dvd : dvds) {
			  addDVD(dvd);
		  }
	  }

	  public void removeDVD(DigitalVideoDisc disc){
	    for(int i = 0; i < dvds.size(); i++){
	      if(dvds.get(i).equals(disc)){
	    	  dvds.remove(i);
	        System.out.println("Da xoa thanh cong");
	        return;
	      }
	    }
	    System.out.println("Khong tim thay DVD trong gio hang");
	  } 

	  public float totalCost(){
	    float totalCost = 0;
	    for(int i = 0; i < dvds.size(); i++){
	      totalCost += dvds.get(i).getCost();
	    }
	    return totalCost;
	  }

	  public void print(){
	    System.out.println("Gio hang: ");
	    for(int i = 0; i < dvds.size(); i++){
	      System.out.println("DVD - " + dvds.get(i).getTitle() + " - " + dvds.get(i).getCategory() + " - " + 
	    		  			dvds.get(i).getDirector()+ " - "+ dvds.get(i).getLength() + " minutes: " 
	    		  			+ dvds.get(i).getCost() + "$");
	    }
	    System.out.println("Total cost: $" + totalCost());
	  }
	  
	  public void searchById(int id) {
		  for(DigitalVideoDisc dvd : dvds) {
			  if(dvd.getId() == id) {
				  System.out.println("ket qua tim kiem: " + dvd.toString());
				  return;
			  }
		  }
			  
		  System.out.println("ko tim thay dvd co id = " + id);
	  }
	  
	  public void searchByTittle(String title) {
		  for(DigitalVideoDisc dvd : dvds) {
			  if(dvd.isMatch(title)) {
				  System.out.println("ket qua tim kiem: " + dvd.toString());
				  return;
			  }
		  }
		System.out.println("ko tim thay dvd co title = " + title);
	  }
	    
}

