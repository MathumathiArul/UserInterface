package displayScreen;

import java.io.File;
import java.io.IOException;

public class FileAddition {
	File mydir=new File("D:/training/UserInterface/root");
	private boolean b;
	public void fileAdd(String filename)
	{	
		b = false;
		File newfile = new File(mydir,filename);
		try {
			if(b=newfile.createNewFile())
			{
				System.out.println("Created file successfully");
			}
			else
			{
				System.out.println("File already exists /Please enter a valid file name");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
			
		
		
	}
	
	
}
