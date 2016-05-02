package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class IOFile {

	public static void main(String[] args) throws FileNotFoundException {
//		String filePath = "H:\\Desktop\\UMLS";
//		File directory = new File(filePath);
//		System.out.println("Files are : ");
//		File[] fileList = directory.listFiles();
//		for(File file : fileList) {
//			System.out.println("\t" + file.getName());
//		}
		String filePath = "H:\\Desktop\\UMLS.test\\testUMLS.json";
		File file = new File(filePath);
		FileReader fr = new FileReader(file);
		Gson gson = new Gson();
		
		UmlsOut obj = gson.fromJson(fr, UmlsOut.class);
		
		System.out.println(obj.getUmlss());
	}

}
