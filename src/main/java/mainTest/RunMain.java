package mainTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import adminLogin.Login;
import readExcel.ReadData;
import reportResult.Result;

public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map <String,String> login_data = new HashMap <String,String>();

DataEnum td;
td = DataEnum.Datarow;
int r_val = td.getdata();

td = DataEnum.U_col;
int ucol = td.getdata();

td = DataEnum.P_col;
int pcol = td.getdata();
		
		ReadData rd = new ReadData();
		
		try {
			login_data = rd.read_data(r_val,ucol,pcol);
			Login lg = new Login();
			String result = lg.Ad_Login(login_data);
			Result report = new Result();
			report.sendResult(result);
		} 
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
