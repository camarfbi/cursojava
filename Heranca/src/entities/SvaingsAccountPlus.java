package entities;

public class SvaingsAccountPlus extends SavingsAccount {
	//ao adicionar a palavra final na classe SavingsAccont "public final class SavingsAccount extends Account{" o compilador não permite herança
	@Override
	public void withdraw(double amount) {
	//ao adicionar a palavra final na classe SavingsAccont "public final void withdraw(double amount) {" o compilador não permite herança da classe withdr
		super.withdraw(amount);
		balance -= 2.0;
	}
	
}
 //recomenda-se utilizar o final em classes herdadas...