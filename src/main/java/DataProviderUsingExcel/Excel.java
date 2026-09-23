package DataProviderUsingExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel {
		@Test
		public void getdata() throws IOException {
			
		
				
				FileInputStream fs= new FileInputStream("E:\\Test2.xlsx");
				XSSFWorkbook wb= new XSSFWorkbook(fs);
				XSSFSheet ws=	wb.getSheetAt(0);
				int rowCount=ws.getPhysicalNumberOfRows();
				XSSFRow row=ws.getRow(0);
				int colCount= row.getLastCellNum();
				
				Object [][] data=new Object [rowCount-1][colCount];
				for (int i=0;i<rowCount-1;i++) {
					row=ws.getRow(i+1);
					for (int j=0;j<colCount;j++) {
						System.out.println(row.getCell(j));
						
						
					}
				}
				
			}
		}

	


