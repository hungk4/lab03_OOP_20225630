package main;

public class Cart {
	  public static final int MAX_NUMBERS_ORDERED = 20;
	  private DigitalVideoDisc[] dvds ;
	  private int qtyOrdered;
	  
	  public Cart(){
	    dvds = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	    qtyOrdered = 0;
	  }

	  public void addDVD(DigitalVideoDisc disc){
	    if(qtyOrdered < MAX_NUMBERS_ORDERED){
	      dvds[qtyOrdered] = disc;
	      qtyOrdered++;
	      System.out.println("Them thanh cong DVD vao gio hang");
	    } else {
	      System.out.println("Gio hang het cho trong");
	    }
	  }

	  public void removeDVD(DigitalVideoDisc disc){
	    for(int i = 0; i < qtyOrdered; i++){
	      if(dvds[i].equals(disc)){
	        for(int j = i; j < qtyOrdered; j++){
	          dvds[j] = dvds[j+1];
	        }
	        dvds[qtyOrdered-1] = null;
	        qtyOrdered--;
	        System.out.println("Da xoa thanh cong");
	        return;
	      }
	    }
	    System.out.println("Khong tim thay DVD trong gio hang");
	  } 

	  public float totalCost(){
	    float totalCost = 0;
	    for(int i = 0; i < qtyOrdered; i++){
	      totalCost += dvds[i].getCost();
	    }
	    return totalCost;
	  }

	  public void print(){
	    System.out.println("Gio hang: ");
	    for(int i = 0; i < qtyOrdered; i++){
	      System.out.println(dvds[i].getTitle() + " - $" + dvds[i].getCost());
	    }
	    System.out.println("Total cost: $" + totalCost());
	  }
	    
	}

