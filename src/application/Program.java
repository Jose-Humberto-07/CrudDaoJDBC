package application;




import java.util.Date;
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
		
		System.out.println("===== TEST 3: seller findByAll =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("######################################");
		System.out.println();
		
		System.out.println("===== TEST 4: seller insert =====");
		Seller newSeller = new Seller(null, "Cristiano Ronaldo", "Cristiano_Ronaldo@gmail.com",new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id = " + newSeller.getId());
		
		System.out.println();
		System.out.println("######################################");
		System.out.println();
		
		System.out.println("===== TEST 5: seller update =====");
		seller = sellerDao.findById(11);
		seller.setName("DI Maria");
		sellerDao.update(seller);
		System.out.println("Update Completed");
	}
	
	

}
