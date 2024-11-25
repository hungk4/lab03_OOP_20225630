package lab01.code;

// 2.2.5

import javax.swing.JOptionPane;

public class ShowTwoNumber {
  public static void main(String[] args) {
    String strNum1, strNum2;
    String strNotification = "You've just entered ";

    strNum1 = JOptionPane.showInputDialog(null, "pls input the 1 num", "input num 1", JOptionPane.INFORMATION_MESSAGE);
    
    strNotification += strNum1 + " and ";

    strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "input the 2 num", JOptionPane.INFORMATION_MESSAGE);

    strNotification += strNum2;
    JOptionPane.showMessageDialog(null, strNotification, "show two number", JOptionPane.INFORMATION_MESSAGE);

    System.exit(0);

  }
}
