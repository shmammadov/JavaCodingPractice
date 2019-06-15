package OCA;

public class Ch1Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "java";       
//		String[] str2 = {"j","a","v","a"};   
//		String   str3 = " ";           
//		for (String s:str2 ) 
//		{            System.out.println(s);  str3 += s;        }    
//		System.out.println(str3);  //false     System.out.println(str3 == str);       //false     System.out.println(str3 == str1);
		
		String str = "java"; 
		String[] str2 = { "j", "a", "v", "a" }; 
		String str3 = " "; 
		for (String s : str2) 
		{ str3 += s; } 
		System.out.println(str3 == str);     
		System.out.println(str3.equals(str)); 

	}

}
