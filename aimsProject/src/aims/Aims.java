package aims;

import java.util.Scanner;

import aims.cart.Cart;
import aims.media.Book;
import aims.media.CompactDisc;
import aims.media.DigitalVideoDisc;
import aims.media.Track;

public class Aims {
    public static void main(String[] args) {
        // Khởi tạo giỏ hàng và các phương tiện
        Cart cart = new Cart();
        DigitalVideoDisc dvd = new DigitalVideoDisc("Naruto", "shounen", "Masashi Kishimoto", 20, 19.99f);
        Book book = new Book("Java Programming", 29.99f, "James Gosling");
        CompactDisc cd = new CompactDisc("Trap Music", 14.99f, "DJ Khaled");
        
        Track track1 = new Track("Intro", 3);
        Track track2 = new Track("Main", 5);
        cd.addTrack(track1);
        cd.addTrack(track2);
        
        // Thêm các phương tiện vào giỏ hàng
        cart.addMedia(dvd);
        cart.addMedia(book);
        cart.addMedia(cd);

        // Gọi hàm hiển thị menu chính
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: 
                    viewStoreMenu(cart, scanner); 
                    break;
                case 2: 
                    updateStoreMenu(cart, scanner); 
                    break;
                case 3: 
                    viewCartMenu(cart, scanner); 
                    break;
                case 0: 
                    System.out.println("Goodbye!"); 
                    break;
                default: 
                    System.out.println("Invalid option! Please try again.");
            }
        } while (choice != 0);
    }

    // Hiển thị menu chính
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    // Menu hiển thị cửa hàng
    public static void viewStoreMenu(Cart cart, Scanner scanner) {
        System.out.println("Store Menu:");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back to main menu");
        System.out.print("Please choose an option: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (choice) {
            case 1: 
                System.out.print("Enter the title of the media: ");
                String title = scanner.nextLine();
                // Tìm kiếm và hiển thị chi tiết phương tiện theo tiêu đề
                break;
            case 2: 
                System.out.print("Enter the title of the media to add to cart: ");
                title = scanner.nextLine();
                cart.addMediaByTitle(title); // Thêm phương tiện vào giỏ hàng
                break;
            case 3:
                System.out.print("Enter the title of the media to play: ");
                title = scanner.nextLine();
                // Phát phương tiện nếu có thể
                break;
            case 4: 
                cart.print();
                break;
            case 0: 
                return;
            default: 
                System.out.println("Invalid option! Please try again.");
        }
    }

    // Menu cập nhật cửa hàng (thêm, xóa phương tiện)
    public static void updateStoreMenu(Cart cart, Scanner scanner) {
        System.out.println("Update Store Menu:");
        System.out.println("1. Add a media to store");
        System.out.println("2. Remove a media from store");
        System.out.println("0. Back to main menu");
        System.out.print("Please choose an option: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        switch (choice) {
            case 1:
                // Thêm phương tiện vào cửa hàng
                break;
            case 2:
                // Xóa phương tiện khỏi cửa hàng
                break;
            case 0: 
                return;
            default:
                System.out.println("Invalid option! Please try again.");
        }
    }

    // Menu giỏ hàng
    public static void viewCartMenu(Cart cart, Scanner scanner) {
        System.out.println("Cart Menu:");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back to main menu");
        System.out.print("Please choose an option: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        switch (choice) {
            case 1:
                // Lọc phương tiện trong giỏ hàng
                break;
            case 2:
                // Sắp xếp phương tiện trong giỏ hàng
                break;
            case 3:
                // Xóa phương tiện khỏi giỏ hàng
                break;
            case 4:
                // Phát phương tiện trong giỏ hàng
                break;
            case 5:
                // Đặt hàng
                System.out.println("Order placed successfully!");
                cart.clearCart();
                break;
            case 0: 
                return;
            default:
                System.out.println("Invalid option! Please try again.");
        }
    }
}
