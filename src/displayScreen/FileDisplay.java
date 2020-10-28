package displayScreen;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FileDisplay extends FileAddition {
	public void display()
	{
		ArrayList<File> files=new ArrayList<File>(Arrays.asList(mydir.listFiles()));
		Collections.sort(files);
		for(File i:files)
		{
			System.out.println(i.getName());
		}
	}

}
