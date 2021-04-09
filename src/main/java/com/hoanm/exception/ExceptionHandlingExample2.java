package com.hoanm.exception;

//PLEASE GIVE ME A BREAK ON CODING STANDARDS
class Amount {
	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	String currency;
	int amount;// Should ideally use BigDecimal
}

class CurrenciesDoNotMatchException extends RuntimeException {
}

class AmountAdder {
	static com.hoanm.exception.Amount addAmounts(com.hoanm.exception.Amount amount1, com.hoanm.exception.Amount amount2) {
		if (!amount1.currency.equals(amount2.currency)) {
			throw new com.hoanm.exception.CurrenciesDoNotMatchException();
		}
		return new com.hoanm.exception.Amount(amount1.currency, amount1.amount + amount2.amount);
	}
}

public class ExceptionHandlingExample2 {
	public static void main (String[] args) {
		try {
			int a = 10/0;
		}catch (ArithmeticException e){
			System.out.println("Your thread have exception with: " + e);
		}
//		try {
//			AmountAdder.addAmounts(new Amount("RUPEE", 5), new Amount("RUPEE",
//					5));
//			String string = null;
//			string.toString();
//		} catch (CurrenciesDoNotMatchException e) {
//			System.out.println("Handled CurrenciesDoNotMatchException");
//		}
	}
}