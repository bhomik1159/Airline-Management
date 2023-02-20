package airline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class flight_details {
	try {
		//Step-1 Load the MySQL JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step-2 Create a COnnection object
	Connection connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","Bhomik@123");
	if(connection!=null) {
		System.out.println("connected");
	//Step-3 Create the Statement Object
	Statement st=	connection.createStatement();
	String sql="select * from flight_management";
	//Step-4 Execute the query
      ResultSet rs=	st.executeQuery(sql);
	}
	else
		System.out.println("Not connected");
	
	} 
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
