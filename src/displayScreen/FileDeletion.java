package displayScreen;

import java.io.File;

public class FileDeletion extends FileAddition {

	public void fileDelete(String filename) {
		
		File myfile=new File(mydir,filename);		
		Boolean b=myfile.delete();
		if(b==true)
		{
			System.out.println("deleted successfully");
		}
		else
		{
			System.out.println("FILE NOT FOUND");
		}

	}

}
