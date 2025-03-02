package com.Ale;

public class BankAccounts {
	private int bankAccountId;
    private String accountNumber;
    private String ifscCode;
    private String bankName;
    private String branch;
    private Users user; 
    private AccountStatus accountStatus;
    public BankAccounts() {
    	super();
    }
    
	public BankAccounts(int bankAccountId, Users user, String accountNumber, String ifscCode, String bankName,
			String branch, AccountStatus accountStatus) {
		super();
		this.bankAccountId = bankAccountId;
		this.user = user;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.branch = branch;
		this.accountStatus = accountStatus;
	}
	public int getBankAccountId() {
		return bankAccountId;
	}
	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}
    
}
