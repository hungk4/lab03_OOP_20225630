package aims.screen.fxml;
import aims.cart.Cart;
import aims.media.Media;
import aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.collections.ListChangeListener.Change;
import javafx.event.ActionEvent; // Đúng package
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button; // Thêm dòng này
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
	
	private Cart cart;
	
	@FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;
    
    @FXML
    private Button btnPlace;
    
    @FXML
    private Label lblTotalCost;
    
    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;
    
    public CartScreenController(Cart cart) {
    	super();
    	this.cart = cart;
    }
    
    @FXML
    private void initialize() {
    	colMediaTitle.setCellValueFactory(
    			new PropertyValueFactory<Media, String>("title"));
    	colMediacategory.setCellValueFactory(
    			new PropertyValueFactory<Media, String>("category"));
    	colMediaCost.setCellValueFactory(
    			new PropertyValueFactory<Media, Float>("cost"));
    	tblMedia.setItems(this.cart.getItemsOrdered());
    	
    	btnPlay.setVisible(false);
    	btnRemove.setVisible(false);
    	
    	
    	tblMedia.getSelectionModel().selectedItemProperty().addListener(
    			new ChangeListener<Media>() {
    				
    				@Override
    				public void changed(ObservableValue<? extends Media> observable, Media oldValue,
    						Media newValue) {
    					if(newValue != null) {
    						updateButtonBar(newValue);
    					}
    				}
    			});
    	cart.getItemsOrdered().addListener(new ListChangeListener<Media>() {
    		 @Override
             public void onChanged(Change<? extends Media> change) {
                 updateTotalCost();
             }

    	});
    	updateTotalCost();
    }
    
    void updateButtonBar(Media media) {
    	btnRemove.setVisible(true);
    	if(media instanceof Playable) {
    		btnPlay.setVisible(true);
    	} else {
    		btnPlay.setVisible(false);
    	}
    }
    
    @FXML
    void btnRemovePressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	cart.removeMedia(media);
    }
    
    @FXML
    void btnPlacePressed(ActionEvent event) {
        double totalCost = 0;
        
        // Tính tổng chi phí từ các sản phẩm trong giỏ hàng
        for (Media media : cart.getItemsOrdered()) {
            totalCost += media.getCost(); // Giả sử mỗi Media có phương thức getCost()
        }
        
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Order Success");
    	alert.setHeaderText("Total: $" + String.format("%.2f", totalCost));
    	alert.setContentText("Thank you for buying !!");
    	
    	alert.showAndWait();
    	
    	cart.clear();
    	
    }
    
    private void updateTotalCost() {
        double totalCost = 0;
        
        // Tính tổng chi phí từ các sản phẩm trong giỏ hàng
        for (Media media : cart.getItemsOrdered()) {
            totalCost += media.getCost(); // Giả sử mỗi Media có phương thức getCost()
        }

        // Cập nhật label với tổng chi phí mới
        lblTotalCost.setText("$" + String.format("%.2f", totalCost));
    }
    

}
