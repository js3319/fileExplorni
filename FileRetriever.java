import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileRetriever {
	//selects files in preparation for modifiers 
	File fileName;
	
	//File fileLoc = new File(fileName);
	public static final String directory = "C:\\Users";
	
	public FileRetriever(String name) throws IOException {
		
		createFolder(name);
		System.out.println(fileName.getParent()+"/"+getFileExtension(name));
	
		moveFile(name, (fileName.getParent()+"/"+getFileExtension(name)));
		massMove(fileName);
	}
	
	public String getFileExtension(String name) {
		String extName = null;
		int extLoc;
		for(int x=0;x<name.length()-1;x++) {
			if(name.substring(x,x+1).equals(".")) {
				extName=name.substring(x+1);
			
			}
		}
		return extName;
	}
	
	public void createFolder(String name) {
		fileName=new File(name);	
		//fileName is the original input
		String parent = fileName.getParent()+"/";
		//gets parent directory
		String folderName = parent + getFileExtension(name);
		//generates foldername based on parent directory and file extension name
		System.out.println (folderName);
		new File(folderName).mkdirs();
		System.out.println(getFileExtension(name));
	}
	
	public void moveFile(String original, String newLoc) {
		File select= new File(original);
		System.out.println((newLoc+select.getName()));
		System.out.println(select.getName());
	
		select.renameTo(new File(newLoc+"/"+select.getName()));
		
		
	}
//	public String actualFileName(String sample) {
//		int count = 1;
//		for(int x=sample.length();x>0;x--) {
//			if (sample.substring(x-1,x).equals("/")){
//				count--;
//				if(count ==0) {
//					return "/"+sample.substring(x);
//				}
//			
//			}
//		}
//		return null;
//	}
	
	public String actualFileName(File file) {
		return file.getName();
	}
	
	public void massMove(File directory) {
		List<String> results = new ArrayList<String>();


		File[] files = new File(directory.getParent()).listFiles();
		//If this pathname does not denote a directory, then listFiles() returns null. 

		for (File file : files) {
		    if (file.isFile()) {
		        results.add(file.getName());
		    }
		}
		for(int x=0;x<results.size();x++) {
			if(getFileExtension(results.get(x))==getFileExtension(directory.getName()));
			moveFile(files[x].getPath(),fileName.getParent()+"/"+getFileExtension(files[x].getPath()));
		}
		System.out.println(results);
	}

	
		
	
}
