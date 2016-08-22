package net.mabiya;

public class BankManager {
	
	private String userName = "";
	private String accountNumber = "";
	private String data = "";
	
	private int saveManagerMoney;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getSaveManagerMoney() {
		return saveManagerMoney;
	}
	public void setSaveManagerMoney(int money) {
		
		this.saveManagerMoney = money;
	}
	
	public void showCredit(){
		
		System.out.printf("[예금주 : %s, 계좌번호 : %s, 개설일자 : %s, 입금액 : %d,]\n",
				userName,accountNumber,data,getSaveManagerMoney());
	}

	

}
