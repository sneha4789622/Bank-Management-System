package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    JRadioButton saving,current,fd,rd;
     JButton submit,cancel;
     JCheckBox c1,c2,c3,c4,c5,c6,c7;
     String formno;
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(290, 80, 400, 30);
        add(l1);

        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 20));
        type.setBounds(100, 180, 150, 20);
        add(type);

        saving = new JRadioButton("Saving Account");
        saving.setBounds(100, 180, 150, 20);
        saving.setBackground(Color.WHITE);
        add(saving);

        current = new JRadioButton("Current Account");
        current.setBounds(350, 180, 250, 20);
        current.setBackground(Color.WHITE);
        add(current);

        fd = new JRadioButton("Fixed Deposit Account");
        fd.setBounds(100, 220, 250, 20);
        fd.setBackground(Color.WHITE);
        add(fd);

        rd = new JRadioButton("Recurring Deposit Account");
        rd.setBounds(350, 220, 250, 20);
        rd.setBackground(Color.WHITE);
        add(rd);

        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(saving);
        accountTypeGroup.add(current);
        accountTypeGroup.add(fd);
        accountTypeGroup.add(rd);

        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 20));
        card.setBounds(100, 300, 200, 30);
        add(card);

        JLabel Number = new JLabel("XXXX-XXXX-XXXX-3579");
        Number.setFont(new Font("Raleway", Font.BOLD, 20));
        Number.setBounds(330, 300, 300, 30);
        add(Number);

        JLabel cardDetails = new JLabel("Your 16-digit Card Number");
        cardDetails.setFont(new Font("Raleway", Font.BOLD, 12));
        cardDetails.setBounds(100, 330, 300, 20);
        add(cardDetails);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 370, 200, 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 20));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);

        JLabel pinDetails = new JLabel("Your 4-digit PIN");
        pinDetails.setFont(new Font("Raleway", Font.BOLD, 12));
        pinDetails.setBounds(100, 400, 300, 20);
        add(pinDetails);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 20));
        services.setBounds(100, 450, 400, 30);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setBounds(100, 500, 200, 30);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBackground(Color.WHITE);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBounds(350, 500, 200, 30);
        c2.setBackground(Color.WHITE);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBounds(100, 550, 200, 30);
        c3.setBackground(Color.WHITE);
        add(c3);

        
        
        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBounds(350, 550, 200, 30);
        c4.setBackground(Color.WHITE);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBounds(100, 600, 200, 30);
        c5.setBackground(Color.WHITE);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBounds(350, 600, 200, 30);
        c6.setBackground(Color.WHITE);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");
        c7.setBounds(100, 680, 600, 30);
        c7.setBackground(Color.WHITE);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);



        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        // Handle button click events here
        if(ae.getSource() == submit){
            // Code to handle submit action
            String accountType = null;
            if(saving.isSelected()){
                accountType = "Saving Account";
            } else if(current.isSelected()){
                accountType = "Current Account";
            } else if(fd.isSelected()){
                accountType = "Fixed Deposit Account";
            } else if(rd.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            Random random = new Random();
            String cardNumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinNumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String facilities = "";
            if(c1.isSelected()){
                facilities += "ATM Card ";
            } else if(c2.isSelected()){
                facilities += "Internet Banking ";
            } else if(c3.isSelected()){
                facilities += "Mobile Banking ";
            } else if(c4.isSelected()){
                facilities += "Email & SMS Alerts ";
            } else if(c5.isSelected()){
                facilities += "Cheque Book ";
            } else if(c6.isSelected()){
                facilities += "E-Statement ";
            }
            
            try{
                if(accountType == null){
                    JOptionPane.showMessageDialog(null, "Please select an account type");
                } else if(!c7.isSelected()){
                    JOptionPane.showMessageDialog(null, "Please accept the declaration");
                } else {
                    conn c = new conn();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardNumber+"', '"+pinNumber+"', '"+facilities+"')";
                    String query2 = "insert into login values('"+formno+"', '"+cardNumber+"', '"+pinNumber+"')";
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\nPIN: " + pinNumber);

                    setVisible(false);
                    new Deposit(pinNumber).setVisible(true);
                }
            } catch(Exception e){
                e.printStackTrace();
            }


        } else if(ae.getSource() == cancel){
            // Code to handle cancel action
            setVisible(false);
            new Login().setVisible(true);

        }
    }
    public static void main(String[] args) {
        new SignupThree("");
    }
}