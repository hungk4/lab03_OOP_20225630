package lab01.code;

import javax.swing.JOptionPane;

public class HelloNameDialog {
  public static void main(String[] args) {
    String result1;
    result1 = JOptionPane.showInputDialog("Nhap ten cua ban");
    JOptionPane.showMessageDialog(null, "hi " + result1 + "!");
  }
}
