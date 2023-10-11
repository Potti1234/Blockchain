class DigitSum {
	public static void main(String[] args) {
		int value = 827492749;
		
		
		int result = 0;
		String valueString = "" + value;
		
		for(int i = 0; i < valueString.length(); i++) {
			result = result + Integer.valueOf("" + valueString.charAt(i));
		}
		
		String resultString = "" + result;
		
		int fixedLenght = 8;
		
		while(resultString.length() < fixedLenght) {
			resultString = "0" + resultString;
		}
		
		if(resultString.length() > fixedLenght) {
			resultString = resultString.substring(resultString.length() - fixedLenght);
		}
		
		System.out.println(resultString);
	}
	
}
