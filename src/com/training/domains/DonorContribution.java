/**
 * 
 */
package com.training.domains;

import com.training.domains.*;

/**
 * @author mrai7
 *
 */
public class DonorContribution {
	private long donorCode;
	private long projectId;
	private long amountDonated;

	/**
	 * 
	 */
	public DonorContribution() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param donorCode
	 * @param projectId
	 * @param amountDonated
	 */
	public DonorContribution(long donorCode, long projectId, long amountDonated) {
		super();
		this.donorCode = donorCode;
		this.projectId = projectId;
		this.amountDonated = amountDonated;
	}
	
	

	/**
	 * @return the donorCode
	 */
	public long getDonorCode() {
		return donorCode;
	}

	/**
	 * @param donorCode the donorCode to set
	 */
	public void setDonorCode(long donorCode) {
		this.donorCode = donorCode;
	}

	/**
	 * @return the projectId
	 */
	public long getProjectId() {
		return projectId;
	}

	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	/**
	 * @return the amountDonated
	 */
	public long getAmountDonated() {
		return amountDonated;
	}

	/**
	 * @param amountDonated the amountDonated to set
	 */
	public void setAmountDonated(long amountDonated) {
		this.amountDonated = amountDonated;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DonorContribution [donorCode=" + donorCode + ", projectId=" + projectId + ", amountDonated="
				+ amountDonated + "]";
	}

	
	
	
	

}
