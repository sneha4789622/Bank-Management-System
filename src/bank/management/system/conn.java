package bank.management.system;
import java.sql.*;
public class conn {
    // The conn class is responsible for establishing a connection to the MySQL database.
    //  It uses the JDBC API to connect to the database and execute SQL queries. 
    // The class has two member variables: c, which is a Connection object that represents the connection to the database,
    //  and s, which is a Statement object that is used to execute SQL queries. The constructor of the conn class loads the MySQL JDBC driver, 
    // establishes a connection to the database using the specified URL, username, and password, and initializes the Statement object.
    //  If any exceptions occur during this process, they are caught and printed to the console.
   Connection c;
   Statement s;
    public conn(){
        try{
            // Load the MySQL JDBC driver and establish a connection to the database. The URL specifies the database name (bankmanagementsystem) and the username and password for authentication. The Statement object is created to execute SQL queries on the database.
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Girlchild12@");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}