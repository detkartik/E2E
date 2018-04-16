package resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDriven {


	public static Object[][] TestData(String sheetName)  
	{
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\Users\\kgautam\\E2E\\Excel Driven\\E2E.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = wb.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0 ;i< sheet.getLastRowNum();i++)
		{
			for(int j= 0 ; j<sheet.getRow(0).getLastCellNum();j++ )
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString(); 
				
			}
		}
		
	return data;
	 
	}
	
}
