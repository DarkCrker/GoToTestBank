package net.mabiya;

import java.util.Scanner;

public class SinhanBank {
	
	private BankUser bankUser = new BankUser();
	private BankManager bankManager = new BankManager();
	private Scanner input;

	public void view(){
		
		input = new Scanner(System.in);
		
		int drpositMoney = 0;
		int menuNumber = 0;
		int withdrawMoney = 0;
		
		System.out.println("신한은행입니다. 계좌를 개설 합니다.");
		System.out.println("예금주 명을 입력하세요");
		String name = input.nextLine();
		System.out.println("계좌번호를 입력하세요.");		
		String accountNumber = input.nextLine();
		System.out.println("개설일자를 입력하세요.");
		String data = input.nextLine();
		System.out.println("입금하실 금액을 입력하세요.");
		drpositMoney = input.nextInt();
		
		bankManager.setSaveManagerMoney(drpositMoney);
		bankManager.setUserName(name);
		bankManager.setAccountNumber(accountNumber);
		bankManager.setData(data);
		
		System.out.println("계좌를 생성 하였습니다.");
		bankManager.showCredit();

		while(true){
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 종료");
			
			menuNumber = input.nextInt();
			
			if(menuNumber ==1){
					System.out.println("입금 금액을 입력하세요.");
					drpositMoney = input.nextInt();
					
					bankUser.drpositMoney(bankManager, (drpositMoney));
					
					System.out.println((drpositMoney)+"원 입금 되었습니다.");
					bankManager.showCredit();
			}
			else if(menuNumber==2){
				
				while(true){
					System.out.println("출금 금액을 입력하세요.");
					withdrawMoney = input.nextInt();
					
					if(withdrawMoney<= bankManager.getSaveManagerMoney()){
						
						bankUser.withdraw(bankManager, withdrawMoney);
						System.out.println((withdrawMoney)+"원 출금 되었습니다.");

						bankManager.showCredit();
						break;
					}
					else{
						System.out.println("입력하신 금액보다 잔액이 부족합니다.");
					}	
				}		
			}
			else if(menuNumber==3){
				System.out.println("업무를 마칩니다 즐거운 하루 되세요.");
				break;
			}
			else{
				System.out.println("잘못 입력 하셧습니다.");
			}
		}	
	}
	
	public static void main(String[] args) {	
		new SinhanBank().view();
	}

}
