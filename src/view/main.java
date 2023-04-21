package view;

import java.util.Scanner;

import controller.convert;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		convert c = new convert();
		int num;
		System.out.println("Insira um valor decimal");
		num=input.nextInt();
		while(num>1000);
		c.DecTobin(num);
		input.close();
	}
}
