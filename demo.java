package com.tnsif.kprit.jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class demo {
    private static Connection con;
    private static final String  DRIVERNAME="org.postgresql.Driver";
    private static final String USERNAME="postgres";
    private static final String PASSWORD="Password";
    private static final String URL="jdbc:postgresql://localhost:5432/TNSIF";

    public static void main(String[] args) {
        try{
            //1. Load the Driver
            Class.forName(DRIVERNAME);
	        System.out.println("Driver loaded successfully");
            // 2. Establish the connection
	        con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
	        System.out.println("Connection established");
            //3.Create Statement
            String query = "SELECT * from student";
            Statement smt = con.createStatement();
            //4. Exceute query
            //5. Retrieve the data
            ResultSet rs=smt.executeQuery(query);
            while(rs.next()){
                System.out.print(rs.getInt(1));
                System.out.print(rs.getString(2));
                System.out.print(rs.getString(3));
                System.out.println();
            }
            //6. Close Statement and connection 
            smt.close();
            con.close();

        }
        catch (Exception e) {
			e.printStackTrace();
		}
	
}
        
    }



    
		



    

