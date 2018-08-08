package com.view;

import java.util.Scanner;

import com.iview.ImpInputData;

public class InputData implements ImpInputData {
	boolean flag;

	@Override
	public String inputString(String message) {
		String stringValue = "";
		do {
			Scanner sc = new Scanner(System.in);
			flag = false;
			System.out.println(message);
			try {
				stringValue = sc.nextLine();

			} catch (Exception e) {
				flag = true;
				System.out
						.println("Sorry you must enter string value. Please try again! ");
			}
		} while (flag);
		return stringValue;
	}

	@Override
	public int inputInt(String messages) {
		int intValue = 0;
		do {
			Scanner sc = new Scanner(System.in);
			flag = false;
			System.out.println(messages);
			try {
				intValue = sc.nextInt();
			} catch (Exception e) {
				flag = true;
				System.out
						.println("Sorry you must enter int value. Please try again!");
			}
		} while (flag);
		return intValue;
	}

	@Override
	public Float inputFloat(String messages) {
		float floatValue = 0;
		do {
			Scanner sc = new Scanner(System.in);
			flag = false;
			System.out.println(messages);
			try {
				floatValue = sc.nextFloat();
			} catch (Exception e) {
				flag = true;
				System.out
						.println("Sorry you must enter float value. Please try again!");
			}
		} while (flag);
		return floatValue;
	}

}
