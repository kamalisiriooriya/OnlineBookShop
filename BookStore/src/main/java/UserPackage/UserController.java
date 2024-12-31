package UserPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class UserController {

			//Connect DB
			private static boolean isSuccess;
			private static Connection con = null;
			private static Statement stmt = null;
			private static ResultSet rs = null;
			
			//Insert Data Function
			public static boolean insertdata(String name,String password,String phone) {
				
				boolean isSuccess= false;
				
				try {
					//DB Connection Call
					con=DBConnection.getConnection();
					stmt=con.createStatement();
					
					//SQL Query
					String sql="insert into user values(0,'"+name+"','"+password+"','"+phone+"')";
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
			//GetbyId
			public static List<UserModel> getByID (String Id){
				
				int convertedID = Integer.parseInt(Id);
				
				ArrayList <UserModel> user = new ArrayList<>();
				
				try {
					//DB Connection
					con=DBConnection.getConnection();
					stmt=con.createStatement();
					
					//Query
					String sql = "select*from user where id '"+convertedID+"'";
							rs= stmt.executeQuery(sql);
							
					while(rs.next()) {
						int id = rs.getInt(1);
						String name = rs.getString(2);
						String pass = rs.getString(3);
						String phone = rs.getString(4);
						
						
						UserModel u = new UserModel(id,name,pass,phone);
						user.add(u);
					}
					
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return user;
			}	
			
			
		//Login Validate
			public static List<UserModel> loginValidate	(String name, String password){
				
				ArrayList <UserModel> user = new ArrayList<>();
				
				try {
					//DB Connection
					con=DBConnection.getConnection();
					stmt=con.createStatement();
					
					String sql = "select*from user where name= '"+name+"' and password='"+password+"'";
					
					rs = stmt.executeQuery(sql);
					
					if(rs.next()) {
						int id = rs.getInt(1);
						String name1 = rs.getString(2);
						String pass = rs.getString(3);
						String phone = rs. getString(4);
						
						UserModel u = new UserModel(id,name1,pass,phone);
						user.add(u);
					}
					
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return user;
			}
			
			//Update Data
			public static boolean updateprofile(String id,String name,String password,String phone) {
				try {
					//DB Connection
					con=DBConnection.getConnection();
					stmt=con.createStatement();
					
					//Query
					String sql = "update user set name='"+name+"',password='"+password+"',phone='"+phone+"'"
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
					String sql ="delete from user where id ='"+convID+"'";
					
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
