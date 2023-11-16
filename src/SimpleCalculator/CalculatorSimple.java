package SimpleCalculator;

import javax.swing.*;

public class CalculatorSimple extends JFrame {
    private JPanel jpanel;
    private JButton btnCompute;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JTextField lblResult;

    public CalculatorSimple(){
        btnCompute.addActionListener(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int op = cbOperations.getSelectedIndex();

            switch(op){
                case 0:
                    lblResult.setText(String.valueOf(num1 + num2));
                    break;
                case 1:
                    lblResult.setText(String.valueOf(num1 - num2));
                    break;
                case 2:
                    lblResult.setText(String.valueOf(num1 * num2));
                    break;
                case 3:
                    lblResult.setText(String.valueOf(num1 / num2));
                    break;
                default:
                    break;
            }
        });
    }

    public static void main(String[] args) {
        CalculatorSimple app = new CalculatorSimple();

        app.setContentPane(app.jpanel);
        app.setSize(750, 250);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");
    }
}
