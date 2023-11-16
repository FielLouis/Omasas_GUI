package LeapYearChecker;

import javax.swing.*;

public class LeapYear extends JFrame{
    private JTextField tfYear;
    private JPanel jpanel;
    private JButton btnCheckYear;

    public LeapYear() {
        btnCheckYear.addActionListener(e -> {
            int year = Integer.parseInt(tfYear.getText());

            if(year % 400 == 0){
                JOptionPane.showMessageDialog(null, "Leap Year");
            } else if (year % 100 == 0){
                JOptionPane.showMessageDialog(null, "Not leap Year");
            } else if (year % 4 == 0){
                JOptionPane.showMessageDialog(null, "Leap Year");
            } else {
                JOptionPane.showMessageDialog(null, "Not leap Year");
            }
        });
    }


    public static void main(String[] args) {
        LeapYear app = new LeapYear();

        app.setContentPane(app.jpanel);
        app.setSize(500, 250);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}
