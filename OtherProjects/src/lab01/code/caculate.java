package lab01.code;

import javax.swing.JOptionPane;

public class caculate {
  public static void main(String[] args) {
    String a, b;
    a = JOptionPane.showInputDialog(null, "a = ", "input num 1", JOptionPane.INFORMATION_MESSAGE);

    b = JOptionPane.showInputDialog(null, "b = ", "input num 2", JOptionPane.INFORMATION_MESSAGE);

    double num1 = Double.parseDouble(a);
    double num2 = Double.parseDouble(b);


    JOptionPane.showMessageDialog(null, num1 + num2, "tong 2 so", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, num1 - num2, "hieu 2 so", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, num1 * num2, "tich 2 so", JOptionPane.INFORMATION_MESSAGE);

    if(num2 == 0){
      JOptionPane.showMessageDialog(null, "Loi do num2 = 0", "thuong 2 so", JOptionPane.ERROR_MESSAGE);
    } else{
      JOptionPane.showMessageDialog(null, num1 / num2, "thuong 2 so", JOptionPane.INFORMATION_MESSAGE);
    }
  }
}
