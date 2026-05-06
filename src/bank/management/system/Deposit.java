package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {
    // The Deposit class is a GUI application that allows users to deposit money into their bank account. 
    // It extends the JFrame class and implements the ActionListener interface to handle button click events. 
    // The class has several member variables, including JTextField for entering the deposit amount, JButton for submitting the deposit, and JLabel for displaying messages to the user. 
    // The constructor of the Deposit class sets up the GUI components, including labels, text fields, and buttons, and adds action listeners to the buttons. 
    // When the user clicks the "Deposit" button, the actionPerformed method is called, which retrieves the deposit amount from the text field, updates the user's balance in the database, and displays a success message.
    JTextField amount;
    JButton deposit, back;
    String pinnumber;
    Deposit(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank/management/system/icons/atm.jpg")); 
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Enter Amount You Want To Deposit");
        text.setBounds(170, 300, 400, 20);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(355, 485, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == deposit){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Amount you want to Deposit");
            }else{
                try{
                    conn c = new conn();
                    String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Deposit', '"+number+"')";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs. "+number+" Deposited Successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }else if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
   
    public static void main(String[] args){
        new Deposit("");
    }
}
