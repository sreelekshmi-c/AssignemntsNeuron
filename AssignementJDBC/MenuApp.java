package ineuron.assignemnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenuApp {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("Menus are displayed below\n");
		System.out.println("1.CreateStudent\n 2.Select student\n 3.UpdateStudent\n 4.DeleteStudent");
		
		System.out.println("Enter the number for menu");
		
		Scanner sc=new Scanner(System.in);
		int menu=sc.nextInt();
		
		String url = "jdbc:mysql://localhost:3306/enterprisejava";

		String username = "root";
		String password = "10082016";
		Connection connection =null;
		Statement statement=null;
		
	
		try
		{

		connection =DriverManager.getConnection(url,username,password);
		if(connection!=null)
		{
			 statement = connection.createStatement();
			 if(statement!=null)
			 {
		switch(menu)
		{
			case 1:  System.out.println("Enter the student details");
				System.out.println("Enter the name");
				String name=sc.next();
				
				System.out.println("Enter the age");
				
				int age=sc.nextInt();
				
				System.out.println("Enter the address");
				String addr=sc.next();
				String insertQuery =String.format("insert into student (`sname`,`sage`,`saddr`)values('%s',%d,'%s')",name,age,addr);
				System.out.println("Query is "+insertQuery);
				int noOfrows = statement.executeUpdate(insertQuery);
				System.out.println("noOfrows  affected:: " + noOfrows);
				break;
			case 2: System.out.println("Enter the sid of student to display the details");
			System.out.println("Enter the student id");
			
			int sid=sc.nextInt();
			String sqlSelectQuery ="select sid,sname,sage,saddr from Student where sid="+sid;
			ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
			
			System.out.println("SID\tSNAME\tSAGE\tSADDR");
			while(resultSet.next()){
			Integer id = resultSet.getInt(1);
			String sname = resultSet.getString(2);
			Integer sage = resultSet.getInt(3);
			String steam = resultSet.getString(4);
			System.out.println(id+"\t"+sname+"\t"+sage+"\t"+steam);
			
			}
			break;
			
			case 3 :  System.out.println("Enter the sid to update the details");
			 sid=sc.nextInt();
			 System.out.println("Enter the age and addr to update the details");
			 age=sc.nextInt();
			  addr=sc.next();
			String UpdateQuery ="update  student set sage="+age+",saddr='"+addr+"' where sid="+sid;
			 noOfrows = statement.executeUpdate(UpdateQuery);
			System.out.println("noOfrows  updated:: " + noOfrows);
				break; 
				
				 
			case 4: System.out.println("Enter the sid to delete the details");
			 sid=sc.nextInt();
			 
			 String deleteQuery ="delete from student where sid="+sid;
				 noOfrows = statement.executeUpdate(deleteQuery);
				System.out.println("noOfrows  deleted:: " + noOfrows);
				break;   
		}

	}

}
		}
	
	catch (SQLException e)
	{
		e.printStackTrace();
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally
	{

		if(statement!=null)
		statement.close();
		if(connection!=null)
		connection.close();
	}
	}
}
