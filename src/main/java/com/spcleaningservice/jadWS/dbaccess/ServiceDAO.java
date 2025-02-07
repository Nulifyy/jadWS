package com.spcleaningservice.jadWS.dbaccess;

import java.sql.*;
import java.util.ArrayList;

public class ServiceDAO {
//	public User getUserDetails(String userid) throws SQLException {
//		
//		User uBean = null;
//		Connection conn = null;
//		try {
//			conn = DBConnection.getConnection();
//            String sqlStr = "SELECT * FROM user_details WHERE userid =?";
//            PreparedStatement pstmt = conn.prepareStatement(sqlStr);
//            pstmt.setString(1, userid);
//            ResultSet rs = pstmt.executeQuery();
//            if (rs.next()) {
//            	uBean = new User();
//                uBean.setUserId(rs.getString("userid"));
//                uBean.setAge(rs.getInt("age"));
//                uBean.setGender(rs.getString("gender"));
//                System.out.print("......done writiting to bean!......");   
//            }
//		} catch (Exception e) {
//			System.out.print("............UserDetailsDB"+e);
//		} finally {
//			conn.close();
//		}
//		
//		return uBean;
//	}
	
	public ArrayList<Service> getServiceByCat(String cat) throws SQLException {
		
		ArrayList<Service> serviceList = new ArrayList<Service>();
		Connection conn = null;
		
		try {
			 conn = DBConnection.getConnection();
			 
			 String sqlStr = "SELECT * FROM service WHERE category = ?";
			 PreparedStatement pstmt = conn.prepareStatement(sqlStr);
			 pstmt.setString(1, cat);
			 ResultSet rs = pstmt.executeQuery();
			 
			 while (rs.next()) {
				 Service sBean = new Service();
				 sBean.setServiceId(rs.getInt("id"));
				 sBean.setName(rs.getString("name"));
				 sBean.setDesc(rs.getString("desc"));
				 sBean.setCategory(rs.getString("category"));
				 sBean.setPrice(rs.getDouble("price"));
				 sBean.setImgloc(rs.getString("imgloc"));
				 
				 serviceList.add(sBean);
				 System.out.print("1 Service Added to serviceList");
			 }
			 
		} catch (Exception e) {
			System.out.print("............ServiceByCatDB"+e);
		} finally {
			conn.close();
		}
		
		return serviceList;
	}
}
