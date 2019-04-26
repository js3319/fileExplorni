import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileRetriever {
	//selects files in preparation for modifiers 
	File fileName;
	public String PS;
	//path separator
	//File fileLoc = new File(fileName);
	public static final String directory = "C:\\Users";

	
	public FileRetriever(String name) throws IOException {
		checkOS();
		
		createFolder(name);
		//System.out.println(fileName.getParent()+PS+getFileExtension(name));
	
		//moveFile(name, (fileName.getParent()+"PS"+getFileExtension(name)));
		massMove(fileName);
	}
	public void checkOS() {
		if(System.getProperty("os.name").equals("Mac OS X")){
		
			PS = "/";
		}
			else {
			PS="\\";
		}
	}
	
	public String getFileExtension(String name) {
		if(name.indexOf(".")>0) {
			
		
		return(name.substring(1+name.lastIndexOf(".")));}
		return "";
	}
	
	public void createFolder(String name) {
		fileName=new File(name);	
		//fileName is the original input
		String parent = fileName.getParent();
		//gets parent directory
		String folderName = parent +PS+ getFileExtension(name)+PS;
		//generates foldername based on parent directory and file extension name
		System.out.println (folderName);
		new File(folderName).mkdirs();
		System.out.println(getFileExtension(name));
	}
	
	public void moveFile(String original, String newLoc) {
		File select= new File(original);
		System.out.println((newLoc+PS+select.getName()));
		System.out.println(select.getName());
	
		select.renameTo(new File(newLoc+PS+select.getName()));
		
		
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
		    if(getFileExtension(file.getName()).toLowerCase().equals(getFileExtension(directory.getName()).toLowerCase())){
		    	moveFile(file.getPath(),file.getParent()+PS+getFileExtension(file.getName()));
		    //	System.out.println(file.getParent()+PS+getFileExtension(file.getName()));

		    }
		}

//		for(int x=0;x<results.size();x++) {
//			if(getFileExtension(directory.getName()).equals(getFileExtension(files[x].getName()))) {

//			System.out.println(files[x].getPath());
//			System.out.println(fileName.getParent()+PS+getFileExtension(files[x].getName()));
//		}
//		System.out.println(results);}
	}
	
	
	
	
		
	
}
