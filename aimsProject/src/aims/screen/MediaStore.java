package aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import aims.cart.Cart;
import aims.media.Media;
import aims.media.Playable;

// MediaStore là lớp con của JPanel, 
// được sử dụng để hiển thị thông tin của một sản phẩm trong cửa hàng.
public class MediaStore extends JPanel {
	private Media media;
	
	public MediaStore(Media media, Cart cart) {
		this.media = media; // // Lưu thông tin sản phẩm
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // // Sắp xếp theo chiều dọc
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT); // // Căn giữa
		
		JLabel cost = new JLabel(""+media.getCost()+" $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));  // Sắp xếp các nút
		
		// Nut "Add to Cart"
		JButton addToCartButton = new JButton("Add to cart");
		addToCartButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cart.addMedia(media);
				cart.print();
			}
		});
		container.add(addToCartButton);
//		container.add(new JButton("Add to cart"));
		
		if(media instanceof Playable) {
			JButton playButton = new JButton("Play");
			playButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// tao cua so dialog
					JDialog playDialog = new JDialog();
					playDialog.setTitle(media.getTitle());
					playDialog.setSize(400, 300);
					
					// noi dung dialog
					JLabel playLabel = new JLabel(media.getTitle() + "is playing .................");
					playLabel.setFont(new Font(playLabel.getFont().getName(), Font.PLAIN, 20));
					playLabel.setHorizontalAlignment(JLabel.CENTER);
					
					playDialog.add(playLabel);
					playDialog.setVisible(true);
					
					((Playable) media).play(); 
				}
			});
			container.add(playButton);
		}
		
		this.add(Box.createVerticalGlue()); // Khoảng trống phía trên
		this.add(title); // Thêm tiêu đề sản phẩm
		this.add(cost); // Thêm giá sản phẩm
		this.add(Box.createVerticalGlue()); // Khoảng trống phía dưới
		this.add(container);  // Thêm các nút
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Viền đen
		
	}
}
