
import java.sql.*;
import java.util.Scanner;
                                                               //project work
public class Registration {
	
	
	Scanner sc=new Scanner(System.in);
	Connection con;
	int n,x;
	String user,pass,email,s,num;
	public Registration() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sahil","root","");
	}
	
	public void Sign_Up()  throws Exception
	{Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter email,user and password in respective order ");
	email=sc.next();
	user=sc.next();
	pass=sc.next();
		
	String g="insert into loginq(email,user,password) values('"+email+"','"+user+"','"+pass+"');";
	PreparedStatement psmt=con.prepareStatement(g);
	int row=psmt.executeUpdate();
	
	if(row>0)
	{
		System.out.println("Save Success");
	}
	else
	{
		System.out.println("Something went wrong");
	}
	
			
		
	}
	
	public void Sign_In() throws Exception
	{Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to login with \n1: Username or \n2:Email");

		n=sc.nextInt();
		if(n==1) {
			System.out.println("Pls enter user and pass");

			user=sc.next();
			pass=sc.next();
			 s="select * from loginq where user ='"+user+"' and password ='"+pass+"'";
		}
		else {
			System.out.println("Pls enter email and pass");

			email=sc.next();
			pass=sc.next();
			 s="select * from loginq where email ='"+email+"' and password ='"+pass+"'";
			
		}
		
		
		PreparedStatement psmt=con.prepareStatement(s);
		ResultSet rs = psmt.executeQuery();
		if(rs.next()) {
			System.out.println("Save Success");
			
		}
		else {System.out.println("Something went wrong");
		
	}
			
			
		
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Registration obj=new Registration();
		
		
		int choice;
		
		while(true)
		{
			System.out.println("Enter Choice:\n1:Sign_Up\n2:Sign_In");
			choice=sc.nextInt();
			
			if(choice==1)
			{
				obj.Sign_Up();
			}
			if(choice==2)
			{
			obj.Sign_In();	
			}
			
			
		}
		
	}
			
}