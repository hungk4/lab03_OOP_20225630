package aims.screen;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import aims.media.Book;
import aims.store.Store;

public class AddBookToStoreScreen extends JFrame {
    private Store store;
    private StoreScreen storeScreen;

    public AddBookToStoreScreen(Store store, StoreScreen storeScreen) {
        this.store = store;

        setTitle("Add Book");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));

        // Create input fields
        JTextField titleField = new JTextField();
        JTextField categoryField = new JTextField();
        JTextField costField = new JTextField();
        JTextField authorField = new JTextField();

        // Add labels and fields to the frame
        add(new JLabel("Title:"));
        add(titleField);
        add(new JLabel("Category:"));
        add(categoryField);
        add(new JLabel("Authors:"));
        add(authorField);
        add(new JLabel("Cost:"));
        add(costField);

        // Add button
        JButton addButton = new JButton("Add Book");
        add(addButton);
        add(new JLabel()); // Empty cell for alignment

        // Button action
        addButton.addActionListener(e -> {
            try {
                String title = titleField.getText();
                String category = categoryField.getText();
                float cost = Float.parseFloat(costField.getText());
                String author = authorField.getText();
//                String[] authors = authorsField.getText().split(",");

                Book newBook = new Book(title, category, author, cost);
                store.addMedia(newBook);

                JOptionPane.showMessageDialog(this, "Book added successfully!");
                
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
