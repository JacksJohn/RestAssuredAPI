package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static Object value;
	
	//constructor
	public ExcelUtils(String excelPath,String sheetName)
	{

		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet=workbook.getSheet(sheetName);
		} catch (IOException excep) {
			
			System.out.println(excep.getMessage());
			System.out.println(excep.getCause());
			excep.printStackTrace();
		}
			
	}
	
	
	
	public static void getCellData(int rowNum, int colNum) {
		
		DataFormatter formatter = new DataFormatter();
		Object value= formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		System.out.println(value);
		String a=(String) value;
		
		
		
	}


	public static void getRowCount()
	{
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of Rows: "+rowCount);
	}

}
