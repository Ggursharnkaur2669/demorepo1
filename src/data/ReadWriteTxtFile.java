package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTxtFile {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\gursh\\Desktop\\QATester\\Pratice_Testing\\txt.txt");
		f.createNewFile();
		
		FileWriter fWrite=new FileWriter(f);
		BufferedWriter wr=new BufferedWriter(fWrite);
		wr.write("I'm writing to file");
		wr.newLine();
		wr.write("This is line1");
		wr.newLine();
		wr.write("This is line2");
		wr.newLine();
		wr.write("This is line3");
		wr.newLine();
		wr.write("This is line4");
		wr.newLine();
		wr.write("This is line5");
		wr.newLine();
		wr.write("Browser :Firefox");
		wr.flush();
		wr.close();
		
		FileReader fRead=new FileReader(f);
		BufferedReader rd=new BufferedReader(fRead);
		System.out.println(rd.readLine());
		
		String line;
		int i=0;
		while((line=rd.readLine())!=null){
			System.out.println(line);
			i++;	
		}
		rd.close();
		
		
		
		
		
		
	}

}
