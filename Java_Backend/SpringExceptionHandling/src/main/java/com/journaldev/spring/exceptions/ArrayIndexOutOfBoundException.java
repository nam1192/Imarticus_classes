package com.journaldev.spring.exceptions;

public class ArrayIndexOutOfBoundException extends Exception{
	
	public ArrayIndexOutOfBoundException(){
		super("ArrayOutOfBoundException with id="+id);
	}

}