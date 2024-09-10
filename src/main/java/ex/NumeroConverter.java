package ex;

public class NumeroConverter {
	public static Double convertToDouble(String strNum){
		if(strNum == null) {
			return 0D;
		}
		
		String num = strNum.replaceAll(",", ".");
		if(isNumeric(num)) {
			return Double.parseDouble(num);
		}
		return 0D;
	}
	
	public static boolean isNumeric(String strNum) {
		if(strNum == null) {
			return false;
		}
		String num = strNum.replaceAll(",", ".");
		return num.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
