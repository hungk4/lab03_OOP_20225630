package aims;

import java.util.Scanner;

import aims.media.Book;
import aims.media.CompactDisc;
import aims.media.DigitalVideoDisc;
import aims.media.Media;
import aims.media.Track;
import aims.store.Store;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		
		DigitalVideoDisc dvd = new DigitalVideoDisc("Naruto", "shounen", "Masashi Kishimoto", 20, 19.99f);
        Book book = new Book("Java Programming", "James Gosling", 29.99f);
        
        Track track1 = new Track("Intro", 3);
        Track track2 = new Track("Main", 5);
        CompactDisc cd = new CompactDisc("Trap Music", "DJ Khaled", 14.99f);
        cd.addTrack(track1);
        cd.addTrack(track2);
        
        store.addMedia(dvd);
        store.addMedia(book);
        store.addMedia(cd);
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
            case 1: 
            	viewStore(store, scanner);
            	break;
            case 2:
            	updateStore(store, scanner);
            	break;
            case 3:
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
	
	public static void viewStore(Store store, Scanner scanner) {
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
		        	mediaDetailsMenu(store, scanner);
		        	break;
		        case 2: break;
		        case 3: break;
		        case 4: break;
		        case 0: return;
		        default: System.out.println("Invalid option! Try again");
	        } 
		} while(choice != 0);
		
	}
	
	public static void updateStore(Store store, Scanner scanner) {
		
	}
	
	public static void mediaDetailsMenu(Store store, Scanner scanner) {
		System.out.println("Enter the title: ");
		String title = scanner.nextLine();

		Media media = store.searchByTitle(title);
		if(media != null) {
			System.out.println(media.toString());
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
			        	AddMediaToCart();
			        	break;
			        case 2: 
			        	PlayMedia();
			        	break;
			        case 0: return;
			        default: System.out.println("Invalid option! Try again");
		        } 
			} while(choice != 0);
		} else {
			System.out.println("Media with title \"" + title + "\" not found.");
		}
	}
	
	public static void AddMediaToCart() {
		
	}
	
	public static void PlayMedia() {
		
	}


}
