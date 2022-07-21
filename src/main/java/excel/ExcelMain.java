package excel;

import java.io.IOException;

public class ExcelMain {
public static void main(String[] args) throws IOException {
			String a=ExcelCode.readIntegerData(3, 1);
			System.out.println(a);
			String b=ExcelCode.readStringData(2,1);
			System.out.println(b);

		}
	}

