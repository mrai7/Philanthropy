/**
 * 
 */
package com.training.ifaces;
import com.training.domains.Donor;
import java.util.List;


/**
 * 
 * @author mrai7
 *
 */
public interface IDonor {
	public boolean addDonor(Donor obj);
	public boolean[] addDonors(Donor... dnrList);
	public void printDonorList();
	public List<Donor> getDonorList();

}
