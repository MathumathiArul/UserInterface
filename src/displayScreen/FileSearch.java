package displayScreen;

import java.io.File;


public class FileSearch extends FileAddition{
	
	public void Search(String searchfile)
	{
	
		File myfile=new File(mydir,searchfile);		
		Boolean b=myfile.exists();
		if(b==true)
		{
			System.out.println("File Found "+searchfile);
		}
		else
		{
			System.out.println("File Not Found");
		}
}
}
