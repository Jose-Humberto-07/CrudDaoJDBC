package application;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
	/*
	 * 	Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select * from seller");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name") + ", " + rs.getString("Email") + ", " + rs.getString("BirthDate") + ", " + rs.getString("BaseSalary") + ", " + rs.getString("DepartmentId"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	 * */
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
	
		System.out.println("===== TEST ONE: seller findByID =====");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		 
		
		
		
		
	}

}
