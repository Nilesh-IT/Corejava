//fing special char
public class FIndSpecialcharater {
	
	public static void main(String[] args) {
		String s="akshay@Itadd";
		
		int count=0;
		String spchar="";
		String emove="";
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))){
				count++;
				System.out.println("counnt "+count);
				spchar=spchar+s.charAt(i);
				System.out.println("SPCHAR"+spchar);
			}else {
				emove=emove+s.charAt(i);
				
			}
		
			
		}
		System.out.println("wothout sp::: "+emove);
		
	}
	
	
   
	

}
