package javaTraining;

import java.math.BigDecimal;
import java.math.MathContext;

public class Sample6 {

	public static void main(String[] args) {
		
		BigDecimal bdNum1 = new BigDecimal("1");
		BigDecimal bdNum2 = new BigDecimal("1.2034");
		int intNum1 = 1;
		int intNum2 = 3;
		double dbNum1 = 1;
		double dbNum2 = 1.2034;

		System.out.println(intNum1 + intNum2);
		System.out.println(dbNum1 + dbNum2);
		System.out.println(bdNum1.add(bdNum2));

		System.out.println(intNum1 - intNum2);
		System.out.println(dbNum1 - dbNum2);
		System.out.println(bdNum1.subtract(bdNum2));
		
		System.out.println(intNum1 * intNum2);
		System.out.println(dbNum1 * dbNum2);
		System.out.println(bdNum1.multiply(bdNum2));
		
		System.out.println(intNum1 / intNum2);
		System.out.println(dbNum1 / dbNum2);
		
		BigDecimal ans = bdNum1.divide(bdNum2,MathContext.DECIMAL128);
	
		System.out.println(ans);
	

	}
}
