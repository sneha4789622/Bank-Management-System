package bank.management.system;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener {
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton Syes,Sno,eyes,eno;
    JComboBox<String> religion, category, incomeCategoryComboBox, educationalComboBox, occupationComboBox;
    String formno;

    SignupTwo(String formno){

        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religionLabel = new JLabel("Religion: ");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 100, 30);
        add(religionLabel);
// JComboBox is used to create a dropdown menu for selecting the religion. The valReligion array contains the options for the dropdown, and the JComboBox is initialized with this array. The setBounds method is used to position the JComboBox on the frame, and it is added to the frame using the add method.
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox<>(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);


        
        JLabel categoryLabel = new JLabel("Category: ");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);

        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
         category = new JComboBox<>(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);


       
          
        JLabel incomeLabel = new JLabel("Income: ");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeLabel.setBounds(100, 240, 200, 30);
        add(incomeLabel);

        String incomeCategory[] = {"null", "< 1,50,000", "<2,50,000", "<5,00,000", "Above 10,00,000"};
        incomeCategoryComboBox = new JComboBox<>(incomeCategory);
        incomeCategoryComboBox.setBounds(300, 240, 400, 30);
        incomeCategoryComboBox.setBackground(Color.WHITE);
        add(incomeCategoryComboBox);
    
        

        JLabel educationalLabel = new JLabel("Educational "); 
        educationalLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        educationalLabel.setBounds(100, 290, 200, 30);
        add(educationalLabel);
        
        JLabel qualificationLabel = new JLabel("Qualification: ");
        qualificationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        qualificationLabel.setBounds(100, 315, 200, 30);
        add(qualificationLabel);

        String educationalValues[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
        educationalComboBox = new JComboBox<>(educationalValues);
        educationalComboBox.setBounds(300, 315, 400, 30);
        educationalComboBox.setBackground(Color.WHITE);
        add(educationalComboBox);

        

        JLabel occupationLabel = new JLabel("Occupation: ");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationLabel.setBounds(100, 390, 200, 30);
        add(occupationLabel);

        String OccupationValues[] = {"Salaried", "Self-Employed", "Business", "Student","Retired", "Other"};
        occupationComboBox = new JComboBox<>(OccupationValues);
        occupationComboBox.setBounds(300, 390, 400, 30);
        occupationComboBox.setBackground(Color.WHITE);
        add(occupationComboBox);

       

        

        JLabel panLabel = new JLabel("Pan Number: ");
        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panLabel.setBounds(100, 440, 200, 30);
        add(panLabel);

        panTextField = new JTextField();
        panTextField.setBounds(300, 440, 400, 30);
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(panTextField);

        JLabel aadharLabel = new JLabel("Aadhar Number: ");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharLabel.setBounds(100, 490, 200, 30);
        add(aadharLabel);

        aadharTextField = new JTextField();
        aadharTextField.setBounds(300, 490, 400, 30);
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        add(aadharTextField);
    
        JLabel seniorCitizenLabel = new JLabel("Senior Citizen: ");
        seniorCitizenLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizenLabel.setBounds(100, 540, 200, 30);
        add(seniorCitizenLabel);

        Syes = new JRadioButton("Yes");    
        Syes.setBounds(300, 540, 100, 30);
        Syes.setBackground(Color.white);
        add(Syes);

        Sno = new JRadioButton("No");
        Sno.setBounds(450, 540, 100, 30);
        Sno.setBackground(Color.white);
        add(Sno);


        ButtonGroup seniorCitizengroup = new ButtonGroup();
        seniorCitizengroup.add(Syes);
        seniorCitizengroup.add(Sno);
    
        
    
        JLabel existingCustomerLabel = new JLabel("Existing Customer: ");
        existingCustomerLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        existingCustomerLabel.setBounds(100, 590, 200, 30);
        add(existingCustomerLabel);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.white);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.white);
        add(eno);

        ButtonGroup existingCustomergroup = new ButtonGroup();
        existingCustomergroup.add(eyes);
        existingCustomergroup.add(eno);

    
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
    

        public void actionPerformed(ActionEvent ae){
            String sreligion = (String) religion.getSelectedItem();
            String scategory = (String) category.getSelectedItem();
            String sincome = (String) incomeCategoryComboBox.getSelectedItem();
            String seducation = (String) educationalComboBox.getSelectedItem();
            String soccupation = (String) occupationComboBox.getSelectedItem();
            String seniorCitizen = null;
            if(Syes.isSelected()){
                seniorCitizen = "Yes";
            }else if(Sno.isSelected()){
                seniorCitizen = "No";
            }
            String existingCustomer = null;
            if(eyes.isSelected()){
                existingCustomer = "Yes";
            }else if(eno.isSelected()){
                existingCustomer = "No";
            }
           

            String span = panTextField.getText();
            String saadhar = aadharTextField.getText();
           

            try{
    

                if(sreligion.equals("")){
                    JOptionPane.showMessageDialog(null,"Religion is Required");
                }else if(scategory.equals("")){
                    JOptionPane.showMessageDialog(null,"Category is Required");
                }else if(sincome.equals("")){
                    JOptionPane.showMessageDialog(null,"Income is Required");
                }else if(seducation.equals("")){
                    JOptionPane.showMessageDialog(null,"Education is Required");
                }else if(soccupation.equals("")){
                    JOptionPane.showMessageDialog(null,"Occupation is Required");
                }else if(span.equals("")){
                    JOptionPane.showMessageDialog(null,"PAN Number is Required");
                }else if(saadhar.equals("")){
                    JOptionPane.showMessageDialog(null,"Aadhar Number is Required");
                }else if(seniorCitizen == null){
                    JOptionPane.showMessageDialog(null,"Senior Citizen Status is Required");
                }else if(existingCustomer == null){
                    JOptionPane.showMessageDialog(null,"Existing Customer Status is Required");
               


                
                } else{
                    conn c = new conn();
                    String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorCitizen+"', '"+existingCustomer+"')"; 
                    c.s.executeUpdate(query);
                    // SignupThree Object Creation
                    setVisible(false);
                    new SignupThree(formno).setVisible(true);
                   
                }
            }catch(Exception e){
                e.printStackTrace();
            }




        

        

        



}
    public static void main(String[] args){
       new SignupTwo("");
        
    }
}