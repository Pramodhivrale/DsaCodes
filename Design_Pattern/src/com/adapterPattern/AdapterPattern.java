package com.adapterPattern;

public class AdapterPattern {
	public static void main(String[] args) {

		AshokIt as = new AshokIt();
		as.setpaymentType("UPI");
		as.setDetails("CARD_PAYMENT");

		Paytm p = AdapterPaymentAdapter.convertBilldeskToPytm(as);

	}

}

interface BillDesk {

	void setpaymentType(String paymentType);

	String getPaymentType();

	void setDetails(String details);

	String getDetails();

}

interface Paytm {

	void pymentTypePytm(String paymentType);

	String getPaymentTypePytm();

	void provideDetails(String details);

	String getDetailsPytm();

}

class AdapterPaymentAdapter {

	static Paytm p = null;

	public AdapterPaymentAdapter(Paytm pa) {
		// TODO Auto-generated constructor stub
		this.p = pa;
	}

	static Paytm convertBilldeskToPytm(BillDesk b) {
		p.pymentTypePytm(b.getPaymentType());
		p.provideDetails(b.getDetails());
		return p;
	}

}

class AshokIt implements BillDesk {

	String paymentMethod = null;
	String details = null;

	@Override
	public void setpaymentType(String paymentType) {
		this.paymentMethod = paymentType;

	}

	@Override
	public String getPaymentType() {
		return paymentMethod;
	}

	@Override
	public void setDetails(String details) {
		this.details = details;

	}

	@Override
	public String getDetails() {
		return details;
	}

}
