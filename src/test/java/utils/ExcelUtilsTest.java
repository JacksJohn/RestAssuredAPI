package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExcelUtilsTest {

	public static void main(String[] args) throws Exception {
		String excelPath="./params/TestParameters.xlsx";
		String sheetName1="1_QueryBooks";
		ExcelUtils VQB=new ExcelUtils(excelPath, sheetName1);
		
		VQB.getRowCount();
		VQB.getCellData(1,0);
		VQB.getCellData(1,1);
		
	}
}
