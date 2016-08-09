
package com.training.daos;

import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import com.training.domains.Project;
import com.training.ifaces.ProjectMyDAO;
import com.training.utils.MySqlConnection;

public class ProjectDAO implements ProjectMyDAO<Project> {
	Connection con=null;

	/**
	 * 
	 */
	public ProjectDAO() {
		super();
		// TODO Auto-generated constructor stub
		con=MySqlConnection.getMyOracleConnection();
	}

	/**
	 * @param con
	 */
	public ProjectDAO(Connection con) {
		super();
		this.con = con;
	}

	/* (non-Javadoc)
	 * @see com.training.ifaces.MyDAO#add(java.lang.Object)
	 */
	@Override
	public int add(Project object) {
		// TODO Auto-generated method stub
		
		int rowAdded=0;
		
		try {
			CallableStatement st=con.prepareCall("{call addProject(?,?,?,?,?)}");
			st.setLong(1, object.getProjectId());
			st.setString(2, object.getProjectName());
			st.setLong(3, object.getProjectCost());
			st.setLong(4, object.getAmountCollected());
			st.setLong(5, object.getPendingAmount());
			
			
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
	public int delete(long projectId) {
		// TODO Auto-generated method stub
					int rowDeleted = 0;
					try
					{
					String sql = "Delete from Project where ProjectId=?";
					PreparedStatement ps =con.prepareStatement(sql);

					ps.setLong(1,projectId);

					rowDeleted= ps.executeUpdate();

					con.close();
					} 
					catch ( SQLException e) {
					  e.printStackTrace();
					}

					
					return rowDeleted;
				}

	@Override
	public Project find(long projectId) {
		Project dnr=null;
		try
		{
			
			String sql="Select * from Project where ProjectId=?";
			
			PreparedStatement pstmt=con.prepareStatement(sql);
			
			pstmt.setLong(1,projectId);
			
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				long Project_ProjectId=rs.getLong("ProjectId");
				String Project_projectName=rs.getString("projectName");
				long Project_projectCost=rs.getLong("projectCost");
				long Project_amountCollected=rs.getLong("amountCollected");
				long Project_pendingAmount=rs.getLong("pendingAmount");
				dnr=new Project(Project_ProjectId,Project_projectName,Project_projectCost,Project_amountCollected,Project_pendingAmount);
				return dnr;
			}
		
		

		pstmt.close();

		} catch (SQLException e) {
		   e.printStackTrace();
		   }

		return dnr;
	}

	@Override
	public List<Project> findAll() {
		// TODO Auto-generated method stub
		
		List<Project> list=new ArrayList<Project>();
		
		
		
		try {
			String sql="Select * from Project";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				list.add(new Project(rs.getLong("projectId"),rs.getString("projectName"),rs.getLong("projectCost"),rs.getLong("amountCollected"),rs.getLong("pendingAmount")));
			}
			//return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	
	
	
	

}
