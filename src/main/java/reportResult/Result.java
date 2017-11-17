package reportResult;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Result {
	
public static final String result_file = "E:\\TestProject\\TestData.xlsx";
	
	public void sendResult(String result) throws Exception {
	    
      	FileInputStream f = new FileInputStream(result_file);
        XSSFWorkbook wb = new XSSFWorkbook(f);
        XSSFSheet sh = wb.getSheet("Result");
        Cell cell = null;
        cell = sh.getRow(1).getCell(1);
        cell.setCellValue(result);
        f.close();
		
        FileOutputStream file = new FileOutputStream(result_file);
        wb.write(file);
	
		wb.close(); 
        
		
	}


}
