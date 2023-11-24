package access;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount myAccount = new SavingAccount("김지우", 987654321, 0.5);
		
		System.out.println(myAccount.name);
		System.out.println(myAccount.open);
		System.out.println(myAccount.number);
		System.out.println(myAccount.checkBalance());
	}

}
