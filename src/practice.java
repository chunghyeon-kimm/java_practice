
public class practice {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iVal = 100;
		String strVal = String.valueOf(iVal); //int -> String ��ȯ
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt("+"+strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal,"+", strVal2, "=") +sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
	}

}

