package honeywell.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlUtils {

	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static Row r;
	public static Cell c;
	
	public static int getRowCount(String xlfile,String xlSheet) throws IOException {
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(xlSheet);
		int rowcount=sheet.getLastRowNum();
		fis.close();
		System.out.println("A");
		return rowcount;
		
		
	}
	
	public static int getCellCount(String xlfile,String xlSheet,int rowno) throws IOException {
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(xlSheet);
		r=sheet.getRow(rowno);
		int cellcount=r.getLastCellNum();
		fis.close();
		System.out.println("B");
		return cellcount;
		}
	
	public static String getCellData(String xlfile,String xlSheet,int rowno,int colno ) throws IOException {
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(xlSheet);
		r=sheet.getRow(rowno);
		c=r.getCell(colno);
		String data="";
		System.out.println("C");
		return data;
		
	}
	public static void setCellData(String xlfile,String xlSheet,int rowno,int colno,String data) throws IOException {
		fis=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(xlSheet);
		r=sheet.getRow(rowno);
		c=r.createCell(colno);
		c.setCellValue(data);
		fos=new FileOutputStream("xlfile");
		wb.write(fos);
		fos.close();
		System.out.println("D");
	}
	
	
}
