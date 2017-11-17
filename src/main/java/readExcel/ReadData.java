package readExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static final String excel_file = "E:\\TestProject\\Testdata.xlsx";
	
	public Map<String,String> read_data(int row,int uname,int pwd) throws IOException {
		
		FileInputStream f = new FileInputStream(excel_file);
		Workbook wb = new XSSFWorkbook(f);
		Sheet sh = wb.getSheet("Data");
		Row rw = sh.getRow(row);
		
		DataFormatter df = new DataFormatter();
		Map <String,String> map = new HashMap <String,String>();
		
		Cell us_name = rw.getCell(uname);
		Cell us_pwd = rw.getCell(pwd);
		
		map.put(df.formatCellValue(us_name), df.formatCellValue(us_pwd));
		
		wb.close();
		
		return map;
			
	}

}
