package com.training.domains;

public class Project {
	private long projectId;
	private String projectName;
	private long projectCost;
	private long amountCollected;
	private long pendingAmount;
	/**
	 * 
	 */
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param projectId
	 * @param projectName
	 * @param projectCost
	 * @param amountCollected
	 * @param pendingAmount
	 */
	public Project(long projectId, String projectName, long projectCost, long amountCollected, long pendingAmount) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCost = projectCost;
		this.amountCollected = amountCollected;
		this.pendingAmount = pendingAmount;
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
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the projectCost
	 */
	public long getProjectCost() {
		return projectCost;
	}
	/**
	 * @param projectCost the projectCost to set
	 */
	public void setProjectCost(long projectCost) {
		this.projectCost = projectCost;
	}
	/**
	 * @return the amountCollected
	 */
	public long getAmountCollected() {
		return amountCollected;
	}
	/**
	 * @param amountCollected the amountCollected to set
	 */
	public void setAmountCollected(long amountCollected) {
		this.amountCollected = amountCollected;
	}
	/**
	 * @return the pendingAmount
	 */
	public long getPendingAmount() {
		return pendingAmount;
	}
	/**
	 * @param pendingAmount the pendingAmount to set
	 */
	public void setPendingAmount(long pendingAmount) {
		this.pendingAmount = pendingAmount;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectCost=" + projectCost
				+ ", amountCollected=" + amountCollected + ", pendingAmount=" + pendingAmount + "]";
	}
	
	
	
	

}
