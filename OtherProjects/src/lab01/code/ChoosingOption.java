package lab01.code;

import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
		String[] options = {"Yes sure", "No, thank you"};

		int option = JOptionPane.showOptionDialog(
			null, 
			"Do you want to change to the first class ticket",
			"Confirm", 
			JOptionPane.DEFAULT_OPTION,  
			JOptionPane.QUESTION_MESSAGE, 
			null,
			options,
			options[0]
		);
		if (option == 0) {
			JOptionPane.showMessageDialog(null, "You've chosen: Yes");
	} else if (option == 1) {
			JOptionPane.showMessageDialog(null, "You've chosen: No");
	} else {
			JOptionPane.showMessageDialog(null, "You haven't choosen");
	}

	// 	int option = JOptionPane.showConfirmDialog(null,
	// 	"Do you want to change to the first class ticket");
	// JOptionPane.showMessageDialog(null, "You've chosen: "
	// 	+ (option==JOptionPane.YES_OPTION?"YES":"NO"));
	// System.exit(0);
		System.exit(0);
	}
}
