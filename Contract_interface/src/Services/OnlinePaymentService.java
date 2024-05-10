package Services;

//6 Passo
public interface OnlinePaymentService {
	
	double paymentFee(double amount);
	double interest(double amount, int mouths);
	
}
