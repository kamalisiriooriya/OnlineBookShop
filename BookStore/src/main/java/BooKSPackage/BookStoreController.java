package BooKSPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookStoreController {
	
	//Connect DB
			private static boolean isSuccess;
			private static Connection con = null;
			private static Statement stmt = null;
			private static ResultSet rs = null;
			
		//Insert Data Function
			public static boolean insertdata(String name,String author,String publication,String price) {
				
				boolean isSuccess= false;
				
				try {
					//DB Connection Call
					con=DBConnection.getConnection();
					stmt=con.createStatement();
					
					//SQL Query
					String sql="insert into book values(0,'"+name+"','"+author+"','"+publication+"','"+price+"')";
					int rs= stmt.executeUpdate(sql);
					if(rs>0) {
						isSuccess = true;
					}
					else {
						isSuccess=false;
					}
					}catch(Exception e) {
						e.printStackTrace();
					}
				return isSuccess;
				}
			
			public static List<BookStoreModel> getByID (String Id){
				
				int convertedID = Integer.parseInt(Id);
				
				ArrayList <BookStoreModel> bookStore = new ArrayList<>();
				
				try {
					//DB Connection
					con=DBConnection.getConnection();
					stmt=con.createStatement();
					
					//Query
					String sql = "select*from book where id '"+convertedID+"'";
							rs= stmt.executeQuery(sql);
							
					while(rs.next()) {
						int id = rs.getInt(1);
						String name = rs.getString(2);
						String author = rs.getString(3);
						String publication = rs.getString(4);
						String price = rs.getString(5);
						
						BookStoreModel idb = new BookStoreModel(id,name,author,publication,price);
						bookStore.add(idb);
					}
					
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return bookStore;
			}
			
			//GetAll Data
			public static List<BookStoreModel> getAllBookStore (){
				
				ArrayList <BookStoreModel> bookStore = new ArrayList<>();
				
				try {
					//DB Connection
					con=DBConnection.getConnection();
					stmt=con.createStatement();
					
					//Query
					String sql = "select*from book";
							rs= stmt.executeQuery(sql);
							
					while(rs.next()) {
						int id = rs.getInt(1);
						String name = rs.getString(2);
						String author = rs.getString(3);
						String publication = rs.getString(4);
						String price = rs.getString(5);
						
						
						BookStoreModel idb = new BookStoreModel(id,name,author,publication,price);
						bookStore.add(idb);
					}
					
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return bookStore;
			}
			
			//Update Data
			public static boolean updatedata(String id,String name,String author,String publication,String price) {
				try {
					//DB Connection
					con=DBConnection.getConnection();
					stmt=con.createStatement();
					
					//Query
					String sql = "update book set region='"+name+"','"+author+"','"+publication+"','"+price+"'"
							+"where id='"+id+"'";
					
						int rs= stmt.executeUpdate(sql);
						
						if(rs>0) {
							isSuccess = true;
						}
						else {
							isSuccess=false;
						}
						
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return isSuccess;
				
				
			}
			
			//Delete Data
			public static boolean deletedata(String id){
				int convID = Integer.parseInt(id);
				try {
					//DBConnection
					con=DBConnection.getConnection();
					stmt=con.createStatement();
					String sql ="delete from book where id ='"+convID+"'";
					
					int rs= stmt.executeUpdate(sql);
					
					if(rs>0) {
						isSuccess = true;
					}
					else {
						isSuccess=false;
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return isSuccess;
			}
	}


