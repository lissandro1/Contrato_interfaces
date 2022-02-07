package model.service;

public class PaypalService implements OnLinePayment {
	
	private static final double PAYMENT_FEE = 0.02;
	private static final double MOUNTHLY_INTEREST = 0.01;
	

	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * MOUNTHLY_INTEREST * months;
	}
	
	
}
