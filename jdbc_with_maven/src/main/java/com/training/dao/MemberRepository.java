package com.training.dao;

import java.util.ArrayList;

import java.util.List;

import com.training.entity.Member;
import com.training.ifaces.CrudRepository;
import java.sql.*;
import java.time.LocalDate;

public class MemberRepository implements CrudRepository<Member> {
	
	private Connection con;

	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	public int add(Member obj) {
		// TODO Auto-generated method stub
		int rowAdded = 0;
		String sql = "insert into rev_product values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement psmt = con.prepareStatement(sql)) {
			psmt.setInt(1, obj.getMemberId());
			psmt.setString(2,obj.getMemberName() );
			psmt.setString(3, obj.getMemberAddress());
			
			java.sql.Date sqlDate = java.sql.Date.valueOf(obj.getAccountOpenType());
			psmt.setDate(4, sqlDate);
			psmt.setString(5, obj.getMemberShipType());
			psmt.setDouble(6, obj.getFeesPaid());

		 psmt.setInt(7, obj.getMaxBookAllowed());
		 psmt.setDouble(8, obj.getPenaltyAmount());
			
			rowAdded = psmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rowAdded;
	
		

	}

	public List<Member> findAll() {
		// TODO Auto-generated method stub
		List<Member> memberList = new ArrayList<Member>();
		String sql = "select * from geemember";
		try(PreparedStatement psmt = con.prepareStatement(sql)) {
			ResultSet rs=psmt.executeQuery();
			while(rs.next()) {
				int memberId =rs.getInt("member_id");
				String memberName=rs.getString("member_name");
				String memberAddress=rs.getString("member_address");
				Date accOpenType=rs.getDate("acc_open_date");
				LocalDate accDate = accOpenType.toLocalDate();
				String memberShipType=rs.getString("membership_type");
				double feesPaid=rs.getDouble("fees_paid");
				int maxBookAllowed=rs.getInt("max_books_allowed");
				double penaltyAmount =rs.getDouble("penalty_amount");
				Member mem = new Member(memberId, memberName, memberAddress, accDate, memberShipType, 
						feesPaid, maxBookAllowed, penaltyAmount);
			
				memberList.add(mem);
				
			
		}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return memberList;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int id, Member obj) {
		// TODO Auto-generated method stub
		
		
			// TODO Auto-generated method stub
			int rowsUpdated=0;
			String sql="update moni_product set fess paid=? where member_id=?";
			try(PreparedStatement pstmt=con.prepareStatement(sql)){
				pstmt.setInt(2, id);
				pstmt.setDouble(1, obj.getFeesPaid());
				rowsUpdated=pstmt.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rowsUpdated;
		
		
	}

	

}
