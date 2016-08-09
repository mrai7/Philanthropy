package com.training.domains;

import java.util.ArrayList;
import java.util.List;

import com.training.ifaces.IDonor;
import com.training.ifaces.IDonorContribution;

public class DonorContributionImpl implements IDonorContribution {
	private List<DonorContribution> donorContributionList;


	public DonorContributionImpl(List<DonorContribution> donorContributionList) {
		super();
		this.donorContributionList = donorContributionList;
	}
	
	public DonorContributionImpl(){
		super();
		donorContributionList = new ArrayList<>();
	}

	@Override
	public boolean addDonorContribution(DonorContribution obj) {
		// TODO Auto-generated method stub
		boolean result = false;
		result = donorContributionList.add(obj);
		return result;
	}

	@Override
	public boolean[] addDonors(Donor... dnrList) {
		// TODO Auto-generated method stub
		int size = dnrList.length;
		boolean result[] = new boolean[size];
		int i = 0;
		
		for(Donor donor : dnrList)
		{
			result[i] = donorList.add(donor);
			i++;
		}
		return result;
	}

	@Override
	public void printDonorList() {
		// TODO Auto-generated method stub
        for(Donor donor : donorList)
        {	
		  System.out.println(donor);
        }
	}

	@Override
	public List<Donor> getDonorList() {
		// TODO Auto-generated method stub
		return donorList;
		
	
	}
	

}
