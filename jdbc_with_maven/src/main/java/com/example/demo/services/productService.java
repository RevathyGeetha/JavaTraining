package com.example.demo.services;
import java.sql.*;
import java.util.*;

import com.example.Invoice;
import com.training.entity.product;

public class productService {
	private Connection con;

	public productService(Connection con) {
		super();
		this.con = con;
	}
	public int deleteById(int id) {
		int rowsDeleted = 0;
		String sql = "delete from rev_product where product_id=? ";
		try(PreparedStatement psmt = con.prepareStatement(sql)) {
			psmt.setInt(1,id);
			rowsDeleted = psmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rowsDeleted;
	}
	public Optional<product> findById(int id){
		String sql = "select * from rev_product where product_id=?";
		Optional<product> obj = Optional.empty();
		try 
			(PreparedStatement psmt = con.prepareStatement(sql)){
			psmt.setInt(1, id);
			ResultSet result = psmt.executeQuery();
			if (result.next()) {
				int productid = result.getInt("product_id");
				String productName = result.getString("product_name");
				double price = result.getDouble("price");
			  product prod = new product(productid,productName,price);
			   
				obj = Optional.of(prod);
				

				
			}
			
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return obj;
	}
	public int addproduct(product product) {
		int rowAdded = 0;
		String sql = "insert into rev_product values(?,?,?)";
		try(PreparedStatement psmt = con.prepareStatement(sql)) {
			psmt.setInt(1, product.getProductid());
			psmt.setString(2,product.getProductName() );
			psmt.setDouble(3, product.getPrice());
			rowAdded = psmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rowAdded;
	}
	public int updatePriceByName (String productName,double newprice) {
		int rowsUpdate = 0;
		String sql = "update rev_product set price=? where product_name=?";
		try(PreparedStatement psmt = con.prepareStatement(sql)) {
			psmt.setString(2, productName);
			psmt.setDouble(1, newprice);
			rowsUpdate = psmt.executeUpdate();
			
		} catch (Exception e) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
			// TODO: handle exception
		}
		return rowsUpdate;		
	}
	public List<product> findAll(){
		List<product> productList = new ArrayList<product>();
		String sql = "select * from rev_product";
		
		try(PreparedStatement psmt = con.prepareStatement(sql)){
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				int productId = rs.getInt("product_id");
				String productName = rs.getString("product_name");
				double price = rs.getDouble("price");
				
				product prod = new product(productId,productName,price);
				productList.add(prod);
				
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		
		return productList;
	}
	public void usingTxn(product prd1,product prd2) {
		String sql = "insert into rev_product values(?,?,?)";
		try(PreparedStatement psmt = con.prepareStatement(sql)){
			con.setAutoCommit(false);
			psmt.setInt(1,prd1.getProductid());
			psmt.setString(2, prd1.getProductName());
			psmt.setDouble(3, prd1.getPrice());
			int rowAdded1=psmt.executeUpdate();

			psmt.setInt(1,prd2.getProductid());
			psmt.setString(2, prd2.getProductName());
			psmt.setDouble(3, prd2.getPrice());
			int rowAdded2=psmt.executeUpdate();

			if(prd2.getPrice()>prd1.getPrice()) {
				con.commit();
			}else {
				con.rollback();
			}
			
			con.commit();
			
			System.out.println("rowadded:="+rowAdded1+","+rowAdded2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void usingTxnWithCatchBlock(product prd1,Invoice prd2) {
		String productsql = "insert into rev_product values(?,?,?)";
		String invoicesql = "insert into rev_invoice values(?,?,?,?)";

		
		try(PreparedStatement psmt = con.prepareStatement(productsql);
				PreparedStatement psmt1 = con .prepareStatement(invoicesql)){
			con.setAutoCommit(false);
			psmt.setInt(1,prd1.getProductid());
			psmt.setString(2, prd1.getProductName());
			psmt.setDouble(3, prd1.getPrice());
			int rowAdded1=psmt.executeUpdate();
			
			psmt.setInt(1,prd2.getInvoice_number());
			psmt.setString(2, prd2.getCustomer_name());
			psmt.setInt(3, prd2.getQuantity());
			

			
			int rowAdded2=psmt.executeUpdate();

			
			
			con.commit();
			
			System.out.println("rowadded:="+rowAdded1+","+rowAdded2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
	}

}
