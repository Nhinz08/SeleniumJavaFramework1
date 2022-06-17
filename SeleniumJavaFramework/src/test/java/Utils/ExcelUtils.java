package Utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelUtils {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static Cell cell;
	
	public ExcelUtils(String excelPath, String sheetname) {
		try {
		
		projectPath = System.getProperty("user.dir");
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetname);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		}
	
//	public static void main(String[] args) {
//			//getRowCount();
//			//getColCount();
//			//getCellDataString(0,0);
//			//getCellDataNumber(1,1);
//		}
	
	public int getRowCount() {
		int rowCount=0;
		try {

		
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows : "+rowCount);
		
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		
		}	
		return rowCount;
		
		}
		
		public int getcolCount() {
			int colCount=0;
			try {

			
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of Columns: "+colCount);
			
			}catch(Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			
			}	
			return colCount;
		}
	
	public String getCellDataString(int rowNum, int colNum) {
		String cellData = null;
		DataFormatter formatter = new DataFormatter();
		try {
		
			cellData = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
			
//		cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		return cellData;
		}
		
//		public static double getCellDataNumber(int rowNum, int colNum) {
//			int CellDataNumber=0;
//			try {
//			
//			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
//			System.out.println(cellData);
//			
//			}catch(Exception exp) {
//				System.out.println(exp.getMessage());
//				System.out.println(exp.getCause());
//				exp.printStackTrace();
//
//		}
//		return CellDataNumber;
//
//		}
		}
