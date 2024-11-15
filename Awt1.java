import java.awt.event.*;
import javax.swing.*;

class MyAwt1 extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;
    JFrame f1;

    public MyAwt1() {
        l1 = new JLabel("First Number ");
        l2 = new JLabel("Second Number ");
        l3 = new JLabel("Result");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        b1 = new JButton("Addition");
        b2 = new JButton("Subtraction");
        b3 = new JButton("Multiplication");
        b4 = new JButton("Divivsion");
        f1 = new JFrame("CALCULATOR");

        f1.setSize(400, 400);
        f1.setLayout(null);

        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(200, 50, 50, 30);
        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(200, 100, 50, 30);
        l3.setBounds(50, 200, 100, 30);
        t3.setBounds(200, 200, 50, 30);
        b1.setBounds(50, 300, 100, 30);
        b2.setBounds(150, 300, 100, 30);
        b3.setBounds(250, 300, 100, 30);
        b4.setBounds(350, 300, 100, 30);

        f1.setLocation(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Corrected this line
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l3);
        f1.add(t3);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int n1 = 0, n2 = 0, result = 0;

        try {
            n1 = Integer.parseInt(t1.getText());
            n2 = Integer.parseInt(t2.getText());

            if (ae.getSource() == b1)
                result = n1 + n2;
            else if (ae.getSource() == b2)
                result = n1 - n2;
            else if (ae.getSource() == b3)
                result = n1 * n2;
            else if (ae.getSource() == b4) {
                if (n2 == 0) {
                    t3.setText("Division by zero error");
                } else {
                    result = n1 / n2;
                }
            }

            t3.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            t3.setText("Invalid input");
        }
    }
}

public class Awt1 {
    public static void main(String[] args) {
        new MyAwt1();
    }
}
