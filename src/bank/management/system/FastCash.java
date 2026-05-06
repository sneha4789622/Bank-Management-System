package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,back;
    String pinNumber;
    FastCash(String pinNumber){
        this.pinNumber = pinNumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank/management/system/icons/atm.jpg")); 

        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Select Withdrawl Amount");
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);

        b1 = new JButton("Rs 100");
        b1.setBounds(170, 415, 150, 30);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("Rs 200");
        b2.setBounds(355, 415, 150, 30);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("Rs 500");
        b3.setBounds(170, 450, 150, 30);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("Rs 1000");
        b4.setBounds(355, 450, 150, 30);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("Rs 2000");
        b5.setBounds(170, 485, 150, 30);
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("Rs 5000");
        b6.setBounds(355, 485, 150, 30);
        b6.addActionListener(this);
        image.add(b6);

        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        // Handle button clicks here
        if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        } else {
            String amount = ((JButton)ae.getSource()).getText().substring(3); // Extract the amount from button text
            conn c = new conn();
            try {
                ResultSet rs = c.s.executeQuery("SELECT * FROM bank WHERE pin = '"+pinNumber+"'");
                int balance = 0;
                while(rs.next()) {
                    if(rs.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date = new Date();
                String query = "INSERT INTO bank VALUES('"+pinNumber+"', '"+date+"', 'Withdrawal', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Withdrawn Successfully");
                setVisible(false);
                new Transactions(pinNumber).setVisible(true);
            } catch(Exception e) {
                System.out.println(e);
            }

            
        }


    }
    public static void main(String[] args) {
        new FastCash("");
    }
}