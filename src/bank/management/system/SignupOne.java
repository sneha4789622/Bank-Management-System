package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignupOne extends JFrame implements ActionListener {
    // The SignupOne class is responsible for creating the first page of the account signup process.
    //  It extends JFrame and implements ActionListener to handle user interactions.
    //  The class contains various Swing components such as JLabel, JTextField, JRadioButton, JButton, and JDateChooser to collect personal details from the user. 
    // The constructor initializes these components, sets their properties, and adds them to the frame. 
    // The actionPerformed method is implemented to handle the "Next" button click event, where it collects the input data, validates it, and 
    // inserts it into the database using the conn class.
    // random is a long variable that generates a random form number for each new account application. 
    // The JTextField variables are used to collect user input for name, father's name, date of birth, email, address, city, state, and pin code. 
    // The JRadioButton variables are used to collect user input for gender and marital status. 
    // The JButton variable is used for the "Next" button that triggers the actionPerformed method when clicked. 
    // The JDateChooser variable is used to allow the user to select their date of birth from a calendar interface.
    long random;
    JTextField nameTextField, fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;

    SignupOne(){
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setBounds(300, 140, 400, 30);
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setBounds(300, 190, 400, 30);
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(fnameTextField);
          
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
    
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender: "); 
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        male = new JRadioButton("Male");    
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.white);
        add(female);
       
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
       

        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setBounds(300, 340, 400, 30);
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        married = new JRadioButton("Married");    
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.white);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.white);
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        

        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setBounds(300, 440, 400, 30);
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(addressTextField);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
    
        cityTextField = new JTextField();
        cityTextField.setBounds(300, 490, 400, 30);
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cityTextField);
    
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
    
        stateTextField = new JTextField();
        stateTextField.setBounds(300, 540, 400, 30);
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(stateTextField);
    
        JLabel pincode = new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
    
        pincodeTextField = new JTextField();
        pincodeTextField.setBounds(300, 590, 400, 30);
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(pincodeTextField);
    
        next = new JButton("Next");
        next.setBounds(620, 660, 80, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(Color.WHITE);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 1");
        setLayout(null);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    // The actionPerformed method is implemented to handle the "Next" button click event. 
    // It collects the input data from the text fields and date chooser, 
    // determines the selected gender and marital status based on the selected radio buttons, 
    // and validates that all required fields are filled. 
    // If any field is left empty, an error message is displayed using JOptionPane.
    //  If all fields are filled, a connection to the database is established using the conn class, 
    // and an SQL query is executed to insert the collected data into the signup table. 
    // The query is constructed using string concatenation, which can be vulnerable to SQL injection attacks.
    //  It would be better to use prepared statements to prevent this vulnerability.

        public void actionPerformed(ActionEvent ae){
            String formno = "" + random;
            String name = nameTextField.getText();
            String fname = fnameTextField.getText();
            String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
            String gender = null;
            if(male.isSelected()){
                gender = "Male";
            }else if(female.isSelected()){
                gender = "Female";
            }
            String email = emailTextField.getText();
            String marital = null;
            if(married.isSelected()){
                marital = "Married";
            }else if(unmarried.isSelected()){
               marital = "Unmarried";
            }else if(other.isSelected()){
                marital = "Other";
            }
            // getText() method is used to retrieve the text entered in the text fields and date chooser. The selected gender and marital status are determined based on which radio button is selected. The form number is generated randomly and converted to a string for storage in the database.

            String address = addressTextField.getText();
            String city = cityTextField.getText();
            String state = stateTextField.getText();
            String pincode = pincodeTextField.getText();

            try{
    
// JOptionPane is used to display error messages if any of the required fields are left empty. 
// If all fields are filled, a connection to the database is established using the conn class, 
// and an SQL query is executed to insert the collected data into the signup table.
//  The query is constructed using string concatenation, which can be vulnerable to SQL injection attacks. 
// It would be better to use prepared statements to prevent this vulnerability.

                if(name.equals("")){
                    JOptionPane.showMessageDialog(null,"Name is Required");
                }else if(fname.equals("")){
                    JOptionPane.showMessageDialog(null,"Father's Name is Required");
                }else if(dob.equals("")){
                    JOptionPane.showMessageDialog(null,"Date of Birth is Required");
                }else if(gender == null){
                    JOptionPane.showMessageDialog(null,"Gender is Required");
                }else if(email.equals("")){
                    JOptionPane.showMessageDialog(null,"Email is Required");        
                }else if(marital == null){
                    JOptionPane.showMessageDialog(null,"Marital Status is Required");
                }else if(address.equals("")){
                    JOptionPane.showMessageDialog(null,"Address is Required");
                }else if(city.equals("")){
                    JOptionPane.showMessageDialog(null,"City is Required");
                }else if(state.equals("")){
                    JOptionPane.showMessageDialog(null,"State is Required");
                }else if(pincode.equals("")){
                    JOptionPane.showMessageDialog(null,"Pin Code is Required");
                } else{
                    conn c = new conn();
                    String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')"; 
                    c.s.executeUpdate(query);
                     setVisible(false);
                    new SignupTwo(formno).setVisible(true);
                }
            }catch(Exception e){
                e.printStackTrace();
            }




        

        

        



}
    public static void main(String[] args){
       new SignupOne();
        
    }
}