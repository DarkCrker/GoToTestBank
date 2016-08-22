package net.mabiya;

public class BankUser {
	
	private int userMoney;
	private int saveUserMoney;
	
	public int getSaveUserMoney() {
		return saveUserMoney;
	}
	public void setSaveUserMoney(int saveUserMoney) {
		this.saveUserMoney = saveUserMoney;
	}
	public int getUserMoney() {
		return userMoney;
	}
	public void setUserMoney(int userMoney) {
		this.userMoney = userMoney;
	}
	
	public void drpositMoney(BankManager bankManager,int money){

		bankManager.setSaveManagerMoney((bankManager.getSaveManagerMoney() + money ));	
		
	}
	public void withdraw(BankManager bankManager, int money){

		bankManager.setSaveManagerMoney(bankManager.getSaveManagerMoney() - money);
		
	}
	
}
