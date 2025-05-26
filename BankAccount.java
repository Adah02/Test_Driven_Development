public class Account{

	public static String setName(String name){
		this.name = name;
	}

	public static String accountName(String name){
		accountName = name;
	return accountName;
	}
	
	public static int accountNumber(int setAccountNumber){
		newAccountNumber = setAccountNumber.toString();
		accountLength = newAccountNumber.length;
		
		if (accountLength == 10){
		this.accountNumber = setAccountNumber;
		return accountNumber;
		}
		else if (accountLength < 10){
		System.out.print("Number is less than 10");
		}
		else if (accountLength > 10){
		System.out.print("Number is more than 10");
		}
		else{
			try{
			integer.parseInt(setAccountNumber);
			} catch (NumberFormatExeption e){
				 System.out.print("Account number contains other characters");
				}
		}
		return accountNumber;
	}

	public static int deposit(int deposit_amount){
		balance += deposit_amount;
	return balance;
	}

	public static int balance(int accountBalance){
		this.balance = balance;
	return balance;
	}


}