package aims.screen;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import aims.media.CompactDisc;
import aims.store.Store;

public class AddCdToStoreScreen extends JFrame {
	private Store store;
    private StoreScreen storeScreen;

    public AddCdToStoreScreen(Store store, StoreScreen storeScreen) {
        this.store = store;

        setTitle("Add Book");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        // Create input fields
        JTextField titleField = new JTextField();
        JTextField categoryField = new JTextField();
        JTextField costField = new JTextField();
        JTextField artistField = new JTextField();

        // Add labels and fields to the frame
        add(new JLabel("Title:"));
        add(titleField);
        add(new JLabel("Artist"));
        add(artistField);
        add(new JLabel("Cost:"));
        add(costField);

        // Add button
        JButton addButton = new JButton("Add CD");
        add(addButton);
        add(new JLabel()); // Empty cell for alignment

        // Button action
        addButton.addActionListener(e -> {
            try {
                String title = titleField.getText();
                float cost = Float.parseFloat(costField.getText());
                String artist = artistField.getText();

                CompactDisc cd = new CompactDisc(title, artist, cost);
                store.addMedia(cd);

                JOptionPane.showMessageDialog(this, "CD added successfully!");
                
                // Cập nhật StoreScreen sau khi thêm sách
                storeScreen.updateCenter();
                dispose(); // Close the window
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid cost format!");
            }
        });

        setVisible(true);
    }
}
