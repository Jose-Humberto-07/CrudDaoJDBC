package application;




import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
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
		
	
		System.out.println("===== TEST 1: seller findByID =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("######################################");
		System.out.println();
		
		System.out.println("===== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		 
		System.out.println();
		System.out.println("######################################");
		System.out.println();
		
		System.out.println("===== TEST 2: seller findByAll =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		
	}

}
