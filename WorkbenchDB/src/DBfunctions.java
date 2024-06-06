import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBfunctions {
	public static void main(String args[]) throws SQLException
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter lap_id, lap_name, lap_cost");
//		int lap_id = sc.nextInt();
//		String lap_name = sc.next();
//		double lap_cost = sc.nextDouble();
//		ResultSet r = null;
//		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:33062/demo","root","root");
//		//insert
//		PreparedStatement ps = c.prepareStatement("insert into laptop values(?,?,?);");
//		ps.setInt(1, lap_id);
//		ps.setString(2, lap_name);
//		ps.setDouble(3, lap_cost);
//		boolean status = ps.execute();
//		System.out.println(status);
//		if(!status)
//		{
//			System.out.println("Row inserted successfully..");
//		}
//	}
//	//select
//	String selectQuery = "select * from laptop";
//	try 
//	{
//		PreparedStatement select = c.prepareStatement(selectQuery);
//		ResultSet rst = select.executeQuery();
//		System.out.println("lap_id\t\tlap_name\tlap_cost");
//		while(rst.next())
//		{
//			System.out.print(rst.getInt(1));
//			System.out.print("\t\t"+rst.getString(2));
//			System.out.print("\t\t"+rst.getDouble(3));
//			System.out.println();
//		}
//	}
//	catch(Exception e)
//	{
//		System.out.println(e);
//	}
//	}
//	//update 
//	String updateQuery = "update laptop set lap_name = ?, lap_cost = ? where lap_id = ?";
//	try {
//	    PreparedStatement update = c.prepareStatement(updateQuery);
//	    update.setString(1, "ASUS"); 
//	    update.setDouble(2, 45000.0); 
//	    update.setInt(3, 45); 
//	    int ru = update.executeUpdate();
//	    if (ru > 0) 
//	    {
//            System.out.println("Laptop updated successfully.");
//        } else 
//        {
//            System.out.println("No laptop found with the specified ID.");
//        }
//	} catch (SQLException e) 
//	{
//	    System.out.println(e);
//	}
//	}
//	// search
//	String searchQuery = "select * from laptop where lap_name like ?";
//	try 
//	{
//	    PreparedStatement search = c.prepareStatement(searchQuery);
//	    search.setString(1, "%" + "ASUS" + "%"); 
//	    ResultSet rs = search.executeQuery();
//	    System.out.println("Search Results:");
//	    while (rs.next()) 
//	    {
//	        System.out.print(rs.getInt("lap_id"));
//	        System.out.print("\t" + rs.getString("lap_name"));
//	        System.out.println("\t" + rs.getDouble("lap_cost"));
//	    }
//	} 
//	catch (Exception e) 
//	{
//	    System.out.println(e);
//	}
//	}
	// delete
	String deleteQuery = "delete from laptop where lap_id = ?";
	try 
	{
	    PreparedStatement delete = c.prepareStatement(deleteQuery);
	    delete.setInt(1, 07); 
	    int rd = delete.executeUpdate();
	    if (rd > 0) 
	    {
	        System.out.println("Laptop id metioned deleted successfully.");
	    } else {
	        System.out.println("No laptop found with the specified ID.");
	    }
	} 
	catch (Exception e) 
	{
	    System.out.println(e);
	}
	}
}
