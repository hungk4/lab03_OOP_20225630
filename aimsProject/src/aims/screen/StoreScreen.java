package aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import aims.cart.Cart;
import aims.media.Media;
import aims.screen.fxml.CartScreen;
import aims.screen.fxml.CartScreenController;
import aims.store.Store;

public class StoreScreen extends JFrame{
	private Store store;
	private Cart cart;
	
	public StoreScreen(Store store) {
		this.store = store;
		this.cart = store.getCart();
		
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		container.add(createNorth(), BorderLayout.NORTH); // phan tren cung: hien thi menu va tieu de
		container.add(createCenter(), BorderLayout.CENTER); // phan chinh giua: hien thi danh sach cac san pham
		
		setVisible(true);
		setTitle("Store");
		setSize(650, 650);
		
	}
	
// 	Phần phía trên của cửa sổ bao gồm:
//	Thanh menu: (tạo bởi createMenuBar)
//	Tiêu đề và nút "View Cart": (tạo bởi createHeader)
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS)); // Sắp xếp theo chiều dọc
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
// 	Menu chính Options:
//	Update Store: Có thể thêm sách, CD, DVD (hiện chỉ là menu tĩnh).
//	View Store và View Cart: Các lựa chọn khác.
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		JMenu smUpdateStore = new JMenu("Update Store");
		smUpdateStore.add(new JMenuItem("Add Book"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		
		smUpdateStore.getItem(0).addActionListener(e -> {
		    new AddBookToStoreScreen(store, this);
		});
		smUpdateStore.getItem(1).addActionListener(e -> {
		    new AddCdToStoreScreen(store, this);
		});
		
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View Store"));
		menu.add(new JMenuItem("View Cart"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;		
	}
	
// 	Hiển thị tiêu đề "AIMS" và nút "View Cart" ở góc phải trên.
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		JButton cartButton = new JButton("View Cart");
		cartButton.setPreferredSize(new Dimension(100, 50));
		cartButton.setMaximumSize(new Dimension(100, 50));
		
		// mo giao dien Cart khi an vao viewCart
		cartButton.addActionListener(e -> {
			new CartScreen(cart);
		});
		
		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(cartButton);
		header.add(Box.createRigidArea(new Dimension(10, 10)));
			
		
		return header;
	}
// 	Hiển thị danh sách các sản phẩm trong cửa hàng bằng cách sử dụng một GridLayout (lưới). 
//	Mỗi ô trong lưới được hiển thị bằng một MediaStore.	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(5, 2, 2, 2)); // 5 hang, 2 cot, gap giua 2 cot va 2 hang la 2
		
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		int limit = Math.min(mediaInStore.size(), 9); // Chỉ hiển thị tối đa 9 sản phẩm
		for(int i = 0; i < mediaInStore.size(); i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i), cart);
			center.add(cell);
		}
		return center;
	}
	
	public void updateCenter() {
	    Container container = getContentPane();
	    container.remove(1); // Xóa panel trung tâm hiện tại (vị trí 1 là center trong BorderLayout)
	    container.add(createCenter(), BorderLayout.CENTER); // Tạo và thêm panel trung tâm mới
	    revalidate(); // Cập nhật lại giao diện
	    repaint();    // Vẽ lại giao diện
	}

	
}
