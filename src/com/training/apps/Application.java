package com.training.apps;

import java.util.List;

import com.training.daos.DonorContributionDAO;
import com.training.daos.DonorDAO;
import com.training.daos.ProjectDAO;
import com.training.domains.*;
import com.training.utils.MySqlConnection;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MySqlConnection.getMyOracleConnection());
		
		/**
		 * Create a Interface MyDAO<T>
		 * Interface should have CRUD operations
		 * add,update,find,delete,findaAll
		 * 
		 * Copy the Donor Class From the Previous Example
		 * 
		 * Create a Class Implementing the MyDAO Interface
		 * 
		 * Complete the Methods
		 * 
		 * Test Code Using Application
		 * 
		 * 
		 */
		DonorDAO dao=new DonorDAO();
		ProjectDAO pdao=new ProjectDAO();
		DonorContributionDAO dcdao=new DonorContributionDAO();
		int key=6;
		switch (key) {
		case 1:
			int rowAddedDonor=dao.add(new Donor(984675898,"Rahesh1","rahe@abc.com",110));
			System.out.println("Row[s] Added:="+rowAddedDonor);
			break;
			
		case 2:
			Donor dnr=dao.find(984089897);
			System.out.println("Row[s] Found:="+dnr);
			break;
		case 3:
			List<Donor> dnr1=dao.findAll();
			System.out.println("Row[s] Found:="+dnr1);
			break;
		case 4:
			int rowDelete=dao.delete(984089897);
			System.out.println("Row[s] Deleted:="+rowDelete);
			break;
		case 5:
			int rowAddedProject=pdao.add(new Project(204,"Cancer Cure",4000,3200,800));
			System.out.println("Row[s] Added:="+rowAddedProject);
			break;
			
		case 6:
			int rowAddedDonorProject=dcdao.add(new DonorContribution(102,202,100));
			System.out.println("Row[s] Added:="+rowAddedDonorProject);
			break;
			
		

		default:
			break;
		}

	}

}
