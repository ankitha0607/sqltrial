package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.ibatis.jdbc.ScriptRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinitions {
	


	@Given("I initialize the driver")
	public void i_initialize_the_driver() throws SQLException {
		//Registering the Driver
	      DriverManager.registerDriver(new com.mysql.jdbc.Driver());      
	}

	@When("I read the sql file for table creation")
	public void i_read_the_sql_file_for_table_creation() throws SQLException, FileNotFoundException {
		//Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost:3306/";
	      Connection con = DriverManager.getConnection(mysqlUrl, "root", "darkkrad2");
	      System.out.println("Connection established......");
		 //Initialize the script runner
	      ScriptRunner sr = new ScriptRunner(con);
	      //Creating a reader object
	      Reader reader = new BufferedReader(new FileReader("C:\\Users\\ANKITHA\\Desktop\\java-selenium\\datatableverify\\src\\test\\java\\resources\\tablecreation.sql"));
	      //Running the script
	      sr.runScript(reader);
	}
	
	@When("I read the sql file for displaying the data in table")
	public void i_read_the_sql_file_for_displaying_the_data_in_table() throws SQLException, FileNotFoundException {
		//Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost:3306/";
	      Connection con = DriverManager.getConnection(mysqlUrl, "root", "darkkrad2");
	      System.out.println("Connection established......");
		 //Initialize the script runner
	      ScriptRunner sr = new ScriptRunner(con);
	      //Creating a reader object
	      Reader reader = new BufferedReader(new FileReader("C:\\Users\\ANKITHA\\Desktop\\java-selenium\\datatableverify\\src\\test\\java\\resources\\readdata.sql"));
	      //Running the script
	      sr.runScript(reader);
	      
	      
	    
	}
	@When("I read the sql file for inserting data into the data table")
	public void i_read_the_sql_file_for_inserting_data_into_the_data_table() throws SQLException, FileNotFoundException {
		//Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost:3306/";
	      Connection con = DriverManager.getConnection(mysqlUrl, "root", "darkkrad2");
	      System.out.println("Connection established......");
		 //Initialize the script runner
	      ScriptRunner sr = new ScriptRunner(con);
	      //Creating a reader object
	      Reader reader = new BufferedReader(new FileReader("C:\\Users\\ANKITHA\\Desktop\\java-selenium\\datatableverify\\src\\test\\java\\resources\\insertdata.sql"));
	      //Running the script
	      sr.runScript(reader);
	    
	}
	@Then("I verify the data")
	public void i_verify_the_data() throws SQLException, FileNotFoundException {
		//Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost:3306/";
	      Connection con = DriverManager.getConnection(mysqlUrl, "root", "darkkrad2");
	      System.out.println("Connection established......");
	    //Initialize the script runner
	      ScriptRunner sr = new ScriptRunner(con);
	      //Creating a reader object
	      Reader reader = new BufferedReader(new FileReader("C:\\Users\\ANKITHA\\Desktop\\java-selenium\\datatableverify\\src\\test\\java\\resources\\readdataaafterinsert.sql"));
	      //Running the script
	      sr.runScript(reader);

	        
	}}





