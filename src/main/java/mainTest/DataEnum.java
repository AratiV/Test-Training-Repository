package mainTest;

public enum DataEnum {

		Datarow(0),
		U_col(0),
		P_col(1);
		
		public int data;
		
		DataEnum(int data)
		{
			this.data = data;
		}
		
		public int getdata()
		{
			return data;
		}

	}


