package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
//generic reusable method read data 
{
	public String readExcelData1(String excelPath,int rowCount, int i) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(excelPath);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(rowCount);
		String data = cell.getStringCellValue();
		return data;
	}


	//generic reusable method read data 
	
		public void writeExcelData(String excelPath,String data,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			Row row = sh.getRow(rowCount);
			Cell cell = row.createCell(cellCount);


			cell.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(excelPath);
			wb.write(fos);
		}
		public int getRowCountMethod(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetName);
			int rc = sh.getLastRowNum();
			return rc;
			
		}


		public String readPropertyData(String propPath, String string) {
			// TODO Auto-generated method stub
			return null;
		}


	}










