package Services;

//15 Passo
public class PaypalService implements OnlinePaymentService {

	public double paymentFee(double amount) {
		return amount * 0.2;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * 0.08 * months;
	}
}
