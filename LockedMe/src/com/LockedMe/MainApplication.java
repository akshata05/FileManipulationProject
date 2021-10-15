package com.LockedMe;

import java.util.Scanner;

public class MainApplication {

	// Implementation

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
System.out.println("-----Welcome To LockedMe---");
System.out.println("By Akshata Naik");
Scanner s=new Scanner(System.in);
FileManipulation fileManipulation=new FileManipulation();
boolean exit=false;
MainMenu();
int option=s.nextInt();
while(!exit) {	
	
	switch(option) {
	case 1:
		fileManipulation.ListFiles();
		break;
	case 2:
		SubMenu();
		int subOption=s.nextInt();
		fileManipulation.PerformOperation(subOption);
		break;
	case 3: 
		break;
	case 4:
		MainMenu();
		option=s.nextInt();
		break;
	}
}

	}
	
	public static void MainMenu() {
		System.out.println("Please choose the options");
		System.out.println("1. Display file names");
		System.out.println("2.Main Menu");
		System.out.println("3. Exit Application");
	}
	public static void SubMenu() {
		System.out.println("Please choose the options");
		System.out.println("1. Add a file");
		System.out.println("2.Delete a file");
		System.out.println("3. Search a file");
		System.out.println("4. Go to Main Menu");
	}


}
