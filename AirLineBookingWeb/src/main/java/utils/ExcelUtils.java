package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static String projectpath;
	static XSSFSheet sheet;

	public ExcelUtils(String excelpath,String sheetName) {
		try {
		projectpath=System.getProperty("user.dir");
		workbook = new XSSFWorkbook(excelpath);
		sheet=workbook.getSheet(sheetName);
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
	public static void main(String[] args) {
		getRowCount();
		String data=getCellDate(1,1);
		System.out.println(data);
	}
	public static void getRowCount() {

		try {
			
			int rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows: "+ rowcount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	public static String getCellDate(int rowNum, int collNum) {
		String celldata=null;
		try { 
		    celldata=sheet.getRow(rowNum).getCell(collNum).getStringCellValue();
			System.out.println("Clicked on : "+celldata);
			
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return celldata;
	}

}
