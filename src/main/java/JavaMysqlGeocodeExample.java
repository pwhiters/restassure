/**
 * Created by pwhit on 4/2/2017.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


public class JavaMysqlGeocodeExample {

    public static void main(String[] args)
    {
        try
        {

            //Trying with resource bundle
            ResourceBundle bundle = ResourceBundle.getBundle("dbProperties");
            //String myDriver = bundle.getString("database.jdbc.driver");
            //String myUrl = bundle.getString("database.jdbc.url");
            String dbUser = bundle.getString("database.jdbc.user");
            String dbPassword = bundle.getString("database.jdbc.password");
            // create our mysql database connection
            //String myDriver = "com.mysql.jdbc.Driver";
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/myclass";
            //Class.forName(myDriver);
            Class.forName("com.mysql.jdbc.Driver");
            //Connection conn = DriverManager.getConnection(myUrl, "pwhiters", "terrace2");
            Connection conn = DriverManager.getConnection(myUrl, dbUser, dbPassword);

            // our SQL SELECT query.
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT * FROM employees";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next())
            {
                int id = rs.getInt("employee_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                //Date dateCreated = rs.getDate("date_created");
                //boolean isAdmin = rs.getBoolean("is_admin");
                // int numPoints = rs.getInt("num_points");

                // print the results
                //System.out.format("%s, %s, %s, %s, %s, %s\n", id, firstName, lastName, dateCreated, isAdmin, numPoints);
                System.out.format("%s, %s, %s\n", id, firstName, lastName);
            }
            st.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
