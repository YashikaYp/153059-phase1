package com.cg.mypaymentapp.exception;

public class InsufficientBalanceException extends RuntimeException{

	public InsufficientBalanceException(String msg) {
		System.err.println(msg);
	}
}

