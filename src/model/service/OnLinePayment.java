package model.service;

public interface OnLinePayment {
	
	double paymentFee(double amount);
	double interest(double amount, int months);

}
