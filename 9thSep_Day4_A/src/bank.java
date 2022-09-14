
public class bank {
	public static int getRandomId() {
		int min = 100;
		int max = 999;
		return min + (int) (Math.random() * ((max - min) + 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank1 = new BankAccount(getRandomId(), "Poojitha", AccountType.CURRENT);
		BankAccount bank2 = new BankAccount(getRandomId(), "Chaitanya", AccountType.CURRENT);
		bank1.setOpeningBalance(500);
		bank2.setOpeningBalance(1000);
		bank1.withdrawAmount(300);
		bank2.withdrawAmount(1000);

	}

}
