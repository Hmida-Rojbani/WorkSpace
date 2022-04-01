package test;

import date.MyDate;

public class TestDate {

	public static void main(String[] args) {
		MyDate date = new MyDate(4, 3, 2020);
		int i = 15;
		date.setDay(i);
		System.out.println(date);
	}
}
