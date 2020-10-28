package displayScreen;

import java.io.IOException;
import java.util.Scanner;


public class DisplayScreen {

	public static void main(String[] args) throws IOException {
	
		System.out.println("-----------------------------------LockedMe.COM-----------------------------------");
		System.out.println("----------------------Prototype Developed By: MATHUMATHI A------------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("\n\n\t1. Display files\n\t2. Add a file\n\t3. Delete a file\n\t4. Search for file\n\t5. Exit");
		System.out.println("----------------------------------------------------------------------------------");
		FileAddition fa=new FileAddition();
		FileSearch fs=new FileSearch();
		FileDeletion fd=new FileDeletion();
		FileDisplay dis=new FileDisplay();
		while(true)
		{
		System.out.println("\n\nEnter your choice: ");
		try {
		int option=Integer.parseInt(sc.nextLine());
		switch(option)
		{
		case 1:
			System.out.println("The files in the directory are: ");
			dis.display();
			break;
		case 2:
			System.out.println("Enter file name to be added: ");
			fa.fileAdd(sc.nextLine());
			break;
		case 3:
			System.out.println("Enter the file name to be deleted:");
			fd.fileDelete(sc.nextLine());
			break;
		case 4:
			System.out.println("Enter the file name to be searched:");
			fs.Search(sc.nextLine());
			break;
		case 5:
			System.out.println("----------------------------Exited from the Application---------------------------");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option");
		}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid input format[Enter your option in number format(0-9)]");
		}

	}

}
}