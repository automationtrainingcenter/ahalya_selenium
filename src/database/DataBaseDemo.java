package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseDemo {

    public static void main(String[] args) throws Exception {
        /*Load the driver class related to the DB technology dynamically using
          forName() method of Class class
         */
    	Class.forName("com.mysql.jdbc.Driver");

        /*Create connection to the required database
          by calling getConnection() method of DriverManager class and
          storing reference in Connection class object
         */
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "surya", "password");

        /*Create Statement class object by calling createStatement() method of
          Connection class so that we can execute SQL queries
         */
    	Statement statement = con.createStatement();


        /*Execute SQL queries using executeQuery() method of Statement class
          and store the results in ResultSet class object
         */
    	ResultSet rs = statement.executeQuery("select * from city where Name = 'Hyderabad'");


        /*Iterate over the results using next() method of ResultSet class*/
    	while(rs.next()) {
    		System.out.println(rs.getInt("ID")+"\t"+rs.getString("Name")+"\t"+rs.getString("CountryCode")+"\t"
    				+rs.getString("District")+"\t"+rs.getInt("Population"));
    	}


        /*Close the data base connection using close() method of Connection class*/
    	statement.close();
    	con.close();
    }
}
