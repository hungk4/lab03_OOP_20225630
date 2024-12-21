/**
 * 
 */
/**
 * 
 */
module aims {
	requires java.desktop;
	requires javafx.graphics;
	requires javafx.controls;
    requires javafx.fxml;
	requires javafx.swing;
    
	exports aims;
	exports test2; 
	opens aims.screen.fxml to javafx.fxml;

	requires javafx.base; // Đảm bảo JavaFX có thể sử dụng các lớp trong javafx.base
	opens aims.media to javafx.base; // Mở package aims.media cho javafx.base
	
}