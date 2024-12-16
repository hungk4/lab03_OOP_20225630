package test.main;

import java.util.Scanner;

import aims.cart.Cart;
import aims.media.Media;
import aims.store.Store;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		Cart cart = new Cart();
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
            case 1: 
            	viewStore(store, cart,scanner);
            	break;
            case 2:
            	updateStore(store, cart, scanner);
            	break;
            case 3:
            	seeCurrentCart(store, cart, scanner);
            	break;
            case 0:
            	System.out.println("Goodbye!"); 
                break;
            default:
            	System.out.println("Invalid option! Try again");
            }
        } while(choice != 0);
        
  
	}
	
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void viewStore(Store store, Cart cart, Scanner scanner) {
		store.print();
		int choice;
		do {
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. See a media's details");
			System.out.println("2. Add a media to cart");
			System.out.println("3. Play a media");
			System.out.println("4. See current cart");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3-4");
			
			choice = scanner.nextInt();
			scanner.nextLine();
	        switch(choice) {
		        case 1:	
		        	mediaDetailsMenu(store, cart, scanner);
		        	break;
		        case 2: break;
		        case 3: break;
		        case 4: 
		        	seeCurrentCart(store, cart, scanner);
		        	break;
		        case 0: return;
		        default: System.out.println("Invalid option! Try again");
	        } 
		} while(choice != 0);
		
	}
	
	public static void updateStore(Store store, Cart cart, Scanner scanner) {
		
	}
	public static void seeCurrentCart(Store store, Cart cart, Scanner scanner) {
		cart.print();
		int choice;
		do {
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Filter medias in cart");
			System.out.println("2. Sort medias in cart");
			System.out.println("3. Remove media from cart");
			System.out.println("4. Play a media");
			System.out.println("5. Place order");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2-3-4-5");
			
			choice = scanner.nextInt();
			scanner.nextLine();
	        switch(choice) {
		        case 1:	break;
		        case 2: break;
		        case 3: break;
		        case 4: break;
		        case 5: break;
		        case 0: return;
		        default: System.out.println("Invalid option! Try again");
	        } 
		} while(choice != 0);
	}
	
	public static void mediaDetailsMenu(Store store, Cart cart, Scanner scanner) {
		System.out.println("Enter the title: ");
		String title = scanner.nextLine();
		
		Media media = store.searchByTitle(title);
		if(media != null) {
			System.out.println("Infomation of media:");
			System.out.println( media.toString());
			int choice;
			do {
				System.out.println("Options: ");
				System.out.println("--------------------------------");
				System.out.println("1. Add to cart");
				System.out.println("2. Play");
				System.out.println("0. Back");
				System.out.println("--------------------------------");
				System.out.println("Please choose a number: 0-1-2");
				
				choice = scanner.nextInt();
		        switch(choice) {
			        case 1: 
			        	AddMediaToCart(cart, media);
			        	break;
			        case 2: 
			        	PlayMedia(media);
			        	break;
			        case 0: return;
			        default: System.out.println("Invalid option! Try again");
		        } 
			} while(choice != 0);
		} else {
			System.out.println("Media with title \"" + title + "\" not found.");
		}
	}
	
	public static void AddMediaToCart(Cart cart, Media media) {
		cart.addMedia(media);
		System.out.println("the number of media in the current cart: " + cart.numberOfMedia());
	}
	
	public static void PlayMedia(Media media) {
		// lop media khong co phuong thuc play lam the nao de chay ??????
		System.out.println("Playing......");
	}


}
