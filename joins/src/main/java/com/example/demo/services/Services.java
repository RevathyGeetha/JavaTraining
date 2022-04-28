package com.example.demo.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.entity.Customer;
import com.example.entity.LoanApplication;
import com.example.ifaces.CrudRespository;

public class Services implements CrudRespository<LoanApplication> {
	
	private Connection con;
	
	

	public Services(Connection con) {
		super();
		this.con = con;
	}

	
		

	public List<LoanApplication> findAll() {
		// TODO Auto-generated method stub
          List<LoanApplication> loanList=new ArrayList<LoanApplication>();
		
		String sql="select a.customer_id,a.phone_number,a.credit_Score,b.application_number,b.customer_ref,b.loan_amount from rev_customer A , rev_loan_application B where  A.customer_id = B.customer_ref and a.customer_id = b.customer_ref";
				
				 
				
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)){
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int customerId = rs.getInt(1);
				String customerName = rs.getString(2);
				Long phoneNumber = rs.getLong(2);
				double creditscore = rs.getDouble(3);
				int applicationNumber=rs.getInt(4);
				int customerRef=rs.getInt(5);
				double loanAmount =rs.getDouble(6);
				Customer cus =new Customer(customerId, customerName, phoneNumber, creditscore);
				LoanApplication prod=new LoanApplication(applicationNumber, cus , loanAmount);
				loanList.add(prod);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();		
		}
		
		return loanList;
		
	}

	@Override
	public int add(LoanApplication obj) {
		// TODO Auto-generated method stub
		int rowAdded = 0;
		String sql = "insert into rev_loan_application values(?,?,?)";
		String sql2="insert into rev_customer values(?,?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql);
				PreparedStatement pstmt2=con.prepareStatement(sql2))
		{
					pstmt2.setInt(1, obj.getCustomer().getCustomerId());
					pstmt2.setString(2, obj.getCustomer().getCustomerName());
					pstmt2.setLong(3, obj.getCustomer().getPhoneNumber());
					pstmt2.setDouble(4, obj.getCustomer().getCreditScore());
					
					pstmt.setInt(1, obj.getApplicationNumber());
					pstmt.setInt(2, obj.getCustomer().getCustomerId());
					pstmt.setDouble(3, obj.getLoanAmount());
					pstmt2.executeUpdate();

					rowAdded = pstmt.executeUpdate();
					}catch (SQLException e) {
					e.printStackTrace();		
				}
				return rowAdded;
			}




	@Override
	
		// TODO Auto-generated method stub
		public Optional<LoanApplication> findById(int id) {
			Optional<LoanApplication> obj=Optional.empty();
			String sql="select a.customer_id,a.customer_name,a.phone_number,a.credit_score,b.application_number,b.customer_ref,b.loan_amount FROM rev_customer a ,rev_loan_application b where a.customer_id=b.CUSTOMER_REF WHERE CUST.CUSTOMER_ID=?";

			try(PreparedStatement prepstmt=con.prepareStatement(sql)){
				prepstmt.setInt(1, id);
				ResultSet rs=prepstmt.executeQuery();            
				if(rs.next()) {
					int customerId=rs.getInt(1);
					String customerName=rs.getString(2);
					long phoneNumber=rs.getLong(3);
					double creditScore=rs.getDouble(4);
					int applicationNumber=rs.getInt(5);
					double loanAmount=rs.getDouble(6);
					Customer customer=new Customer(customerId, customerName, phoneNumber, creditScore);
					LoanApplication loan=new LoanApplication(applicationNumber, customer, loanAmount);
					obj=Optional.of(loan);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return obj;
		}
		
		
	}
		
		

	

