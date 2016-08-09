package com.training.daos;

import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.training.domains.*;

import com.training.domains.Donor;
import com.training.domains.DonorContribution;
import com.training.ifaces.DonorContributionMyDAO;
import com.training.ifaces.DonorMyDAO;
import com.training.utils.MySqlConnection;

public class DonorContributionDAO implements DonorContributionMyDAO<DonorContribution> {
	Connection con=null;
	Statement stmt = null;

	/**
	 * 
	 */
	public DonorContributionDAO() {
		super();
		// TODO Auto-generated constructor stub
		con=MySqlConnection.getMyOracleConnection();
	}

	/**
	 * @param con
	 */
	public DonorContributionDAO(Connection con) {
		super();
		this.con = con;
	}

	/* (non-Javadoc)
	 * @see com.training.ifaces.MyDAO#add(java.lang.Object)
	 */
	@Override
	public int add(DonorContribution object) {
		// TODO Auto-generated method stub
		
		int rowAdded=0;
		
		try {
			CallableStatement st=con.prepareCall("{call addDonorContribution(?,?,?)}");
			st.setLong(1, object.getDonorCode());
			st.setLong(2, object.getProjectId());
			st.setLong(3, object.getAmountDonated());
			rowAdded=st.executeUpdate();
			
		    String sql = "UPDATE Project SET amountCollected = amountCollected+ ? , pendingAmount=pendingAmount-? WHERE projectId=?";
		    PreparedStatement ps =con.prepareStatement(sql);

			ps.setLong(1,object.getAmountDonated());
			ps.setLong(2,object.getAmountDonated());
			ps.setLong(3,object.getProjectId());

		    ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return rowAdded;
	}

}
