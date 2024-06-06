import java.sql.Connection;

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBfunctions db = new DBfunctions();
		Connection conn = db.connect_to_db("postgres", "postgres", "root");
		//db.createTable(conn, "employee");
		//db.insert_row(conn, "employee", "Virat", "India");
		//db.update_name(conn, "employee", "Dhoni", "Jadeja");
		//db.search_by_name(conn, "Employee", "Dhoni");
		//db.search_by_id(conn, "Employee", 4);
		//db.delete_row_by_name(conn, "Employee", "Dhoni");
		//db.delete_row_by_id(conn, "Employee", 5);
		//db.read_data(conn, "employee");
		//db.delete_table(conn, "employee");
		
	}
}
