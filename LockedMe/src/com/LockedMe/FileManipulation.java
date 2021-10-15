package com.LockedMe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileManipulation {

private String directoryPath="C:\\Users\\Akshata Naik\\Desktop\\Testing";

	public void ListFiles(){
		// TODO Auto-generated method stub
	
		File file=new File(directoryPath);
		String fileList[]=file.list();
		Arrays.sort(fileList);
		for(String names:fileList) {
			System.out.println(names);
		}
		
		
	}

	public void PerformOperation(int subOption) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		switch(subOption) {
		case 1:
			try {
			System.out.println("\nEnter a file name to create");
			String fileName=s.nextLine();
			File file=new File(directoryPath,fileName);
			file.createNewFile();
			if(file.exists())
			{
			System.out.println("File Created");
			}
			break;
			}
			catch(Exception e) {
				System.err.print(e.getMessage());				
			}
			finally {
				MainApplication.SubMenu();
			}
		case 2:
			try {
				System.out.println("\nEnter a file name to delete");
				String fileName=s.nextLine();
				File file=new File(directoryPath,fileName);
				if(file.exists()) {
				file.delete();
				System.out.println("File Deleted");
				}
				else {
					System.err.println("File not found.");
				}
				
				
				break;
			}
			catch(Exception e) {
				System.err.print(e.getMessage());
				
			}
			finally {
				MainApplication.SubMenu();
			}
		case 3:
			try {
				System.out.println("\nEnter a file name to search");
				String fileName=s.nextLine();
				File file=new File(directoryPath,fileName);
				if(file.exists()) {
				System.out.println("File is found");
				}
				else {
					System.err.print("File not found");
				}
				
				break;
			}
			catch(Exception e) {
				System.err.print(e.getMessage());
				
			}
			finally {
				MainApplication.SubMenu();
			}
		case 4:
			MainApplication.MainMenu();
			break;
			default:
				System.err.println("Your have choosen invalid option. Please try again");
				MainApplication.SubMenu();
				break;
		}
	
	}

}
