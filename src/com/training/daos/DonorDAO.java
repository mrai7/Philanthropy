package com.training.daos;

import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.domains.Donor;
import com.training.ifaces.DonorMyDAO;
import com.training.utils.MySqlConnection;

public class DonorDAO implements DonorMyDAO<Donor> {
	Connection con=null;

	/**
	 * 
	 */
	public DonorDAO() {
		super();
		// TODO Auto-generated constructor stub
		con=MySqlConnection.getMyOracleConnection();
	}

	/**
	 * @param con
	 */
	public DonorDAO(Connection con) {
		super();
		this.con = con;
	}

	/* (non-Javadoc)
	 * @see com.training.ifaces.MyDAO#add(java.lang.Object)
	 */
	@Override
	public int add(Donor object) {
		// TODO Auto-generated method stub
		
		int rowAdded=0;
		
		try {
			CallableStatement st=con.prepareCall("{call addDonor(?,?,?,?)}");
			st.setLong(1, object.getHandPhone());
			st.setString(2, object.getDonorName());
			st.setString(3, object.getEmail());
			st.setLong(4, object.getDonorCode());
			
			
			rowAdded=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	/* (non-Javadoc)
	 * @see com.training.ifaces.MyDAO#delete(long)
	 */
	@Override
	public int delete(long handPhone) {
		// TODO Auto-generated method stub
					int rowDeleted = 0;
					try
					{
					String sql = "Delete from Donor where handphone=?";
					PreparedStatement ps =con.prepareStatement(sql);

					ps.setLong(1,handPhone);

					rowDeleted= ps.executeUpdate();

					con.close();
					} 
					catch ( SQLException e) {
					  e.printStackTrace();
					}

					
					return rowDeleted;
				}

	@Override
	public Donor find(long handPhone) {
		Donor dnr=null;
		try
		{
			
			String sql="Select * from Donor where handPhone=?";
			
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			pstmt.setLong(1,handPhone);
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				long donor_donorCode=rs.getLong("donorCode");
				long donor_handPhone=rs.getLong("handPhone");
				String donor_donorName=rs.getString("donorName");
				String donor_email=rs.getString("email");
				dnr=new Donor(donor_handPhone,donor_donorName,donor_email,donor_donorCode);
				return dnr;
			}
		
		

		pstmt.close();

		} catch (SQLException e) {
		   e.printStackTrace();
		   }

		return dnr;
	}


	@Override
	public List<Donor> findAll() {
		// TODO Auto-generated method stub
		
		List<Donor> list=new ArrayList<Donor>();
		
		
		
		try {
			String sql="Select * from Donor";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				list.add(new Donor(rs.getLong("handPhone"),rs.getString("donorName"),rs.getString("email"),rs.getLong("donorCode")));
			}
			//return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	
	
	
	

}
