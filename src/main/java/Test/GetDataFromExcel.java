package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcel {
	
	public ArrayList<String> getTestData(String TestCaseName) throws IOException {

		FileInputStream fs=new FileInputStream("E:\\Test1.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fs);
		int NumberofSheets= wb.getNumberOfSheets();
		ArrayList<String> arr= new ArrayList<>();
		for(int i=0;i<NumberofSheets;i++) {
			if(wb.getSheetName(i).equalsIgnoreCase("TestSheet")) {
				
			
			XSSFSheet ws=wb.getSheetAt(i);
			
			Iterator<Row> rows= ws.iterator();
			Row firstRow = rows.next();
			Iterator<Cell> ce= firstRow.cellIterator();
			int k=0;
			int col=0;
			while(ce.hasNext()){
				Cell value= ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("TestCaseName"))
				{
					col=k;
				}
			k++;
			}
			System.out.println("col :"+col);
			
			while(rows.hasNext()) {
				Row r= rows.next();
				if(r.getCell(col).getStringCellValue().equalsIgnoreCase("Vysh"))
				{
					Iterator<Cell> cv=r.cellIterator();
					while(cv.hasNext()) {
						Cell c=cv.next();
						if(c.getCellType()==CellType.STRING) {
							arr.add(c.getStringCellValue());
						}
						else {
							arr.add(NumberToTextConverter.toText(c.getNumericCellValue()));
						}
						
						
					}
				}
			}
			
	}
	}
		return arr;
	}

	public static void main(String[] args) throws IOException {
		GetDataFromExcel g = new GetDataFromExcel();
	ArrayList data=	g.getTestData("Name");
	System.out.println(data.get(0));	
	System.out.println(data.get(1));
	System.out.println(data.get(2));
	System.out.println(data.get(3));
}}
