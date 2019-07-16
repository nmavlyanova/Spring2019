package day39;

import java.util.*;
import java.nio.file.*;


public class TextToFileList {


	

	  public static void main(String[] args) {

	    List<String> lineLst = getTextFileAsList("Otabek.txt");
	    //List<String>lineLst2=getTextFileAsList("");
	    
	    System.out.println(lineLst);
	       	  
	  System.out.println(lineLst.size());
	  
	  
	  //xlc doc ppt pdf
	  String s = "erat_quisque_erat.xls";
	  //how do we just get file extension
	  String fileExtension= s.substring(s.indexOf(".")+1);
	  System.out.println(fileExtension);
	  int count = 0;
	  for (String each: lineLst) {
			 
		 if(each.endsWith(".xls")) {
			 count++;
		 }
		 
	}
	  System.out.println(" Excel file count is : "+count);
	  
	  
	   String longest=lineLst.get(0);
	   for(String each: lineLst) {
		   if(longest.length()<each.length()) {
			   longest=each;
		   }
	   }
	   System.out.println("Longest file is: " + longest);
	  
	   String longetsXls= lineLst.get(0);
	   for(String each: lineLst) {
		     
	   if(each.endsWith(".xls")&&longetsXls.length()<each.length()) {
		   longetsXls=each;
	   }
	  
	  }
	   System.out.println("Longest Excel file is:  "+ longetsXls);
	   
	   lineLst.remove(longetsXls);
	   
	   
	  }
	  /*
	   * DO NOT MODIFY AND JUST USE IT
	   * Method name : getTextFileAsList
	   * @parameter  location of text file as String
	   *   if your file is at root path (right under project folder)
	   *  you may directly path your filename.txt
	   *  if not pass /your/own/folder/name/filename.txt as String to method
	   * 
	   * @return List of String that contain each line as per element

	   */
	  public static List<String> getTextFileAsList(String filePath) {

	    List<String> allLines = null;
	    try {
	      allLines = Files.readAllLines(Paths.get(filePath));
	    } catch (Exception e) {
	      System.out.println("Wrong file path probably");
	    }
	    return allLines;

	    


	}

}
