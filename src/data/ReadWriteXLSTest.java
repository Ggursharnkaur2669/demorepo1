package data;

import java.io.IOException;

public class ReadWriteXLSTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Xls_Reader fr=new Xls_Reader("C:\\Users\\gursh\\Desktop\\QATester\\Pratice_Testing\\NikulTest.xlsx");
		System.out.println(fr.getCellData("Data1", 3, 2));
		System.out.println(fr.getColumnCount("Data1"));
		System.out.println(fr.getRowCount("Data1"));
		
		fr.setCellData("Data1", "Name", 10, "User123");
		System.out.println(fr.getCellData("Data1", 4, 3));
		
		fr.addColumn("Data1", "Pass");
		
		
	}

}
