/**
 * 
 */
package com.training.ifaces;
import com.training.domains.Donor;
import com.training.domains.DonorContribution;

import java.util.List;


/**
 * 
 * @author mrai7
 *
 */
public interface IDonorContribution {
	public boolean addDonorContribution(DonorContribution obj);
	public boolean[] addDonorContributions(DonorContribution... dnrList);
	public void printDonorContributionList();
	public List<Donor> getDonorContributionList();

}
