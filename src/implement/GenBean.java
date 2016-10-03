package implement;
import java.util.HashMap;
import java.util.HashSet;

public class GenBean {

	public boolean checkString_NoDatastructure(String s){
		boolean duplicate=false;
		String copy = s;
		int count=0;
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			count = 0;
			for (int j=0;j<copy.length();j++){
				
				if(c == copy.charAt(j)){ 
					count++;
				}
				if(count > 1){
					duplicate = true;
					break;
				}
			}
			//break;
		}
		return duplicate;
	}
	
	public void getPermutation(String str){
		int n = str.length();
		
		for(int i=0; i<n; i++){
			
		}
	}
	
	public boolean checkPermutation(String s1, String s2){
		boolean ifPerm = false;
		HashMap<String, Integer> mapStr1 = this.getCharCount(s1);
		HashMap<String, Integer> mapStr2 = this.getCharCount(s2);
		if (mapStr1.equals(mapStr2)){
			System.out.println("Strings are permuted..");
		}
		else{
			System.out.println("Strings are different...!");
		}
		return ifPerm;
	}
	
	
	public HashMap<String,Integer> getCharCount(String s){
		HashMap<String,Integer> mapStr = new HashMap<String,Integer>();
		String key;
		int count;
		for (int i=0;i<s.length(); i++){
			key = s.charAt(i)+"";
			if (mapStr.containsKey(key)){
				count = mapStr.get(key);
				count++;
				mapStr.put(key, count);
			}
			else{
				mapStr.put(key.toLowerCase(), 1);
			}
		}
		return mapStr;
		
	}
	
	public String stringCompressor(String str){
		String result = "";
		int count = 1;
		for(int i=0; i< str.length() ; i++){
 			if((i+1<str.length()) && (str.charAt(i) == str.charAt(i+1))){
					count++;
				}
				else{
					result =result+ str.charAt(i)+count+"";
					count = 1;
				}
			}
		System.out.println(result);
		if(result.length() >= str.length()){
			result = str;
		}
		return result;
	}
	
	public void inPlaceMove(char[] c){
		int l;
		for(int i=0;i<c.length;i++){
			if(c[i] == ' '){
				l= (c.length-1) - i;
				c = shiftCharTo(c,l,3);
			}
		}
	}
	
	public char[] shiftCharTo(char[] c,int pos,int spaces){
		for(int i=c.length;i<=0;i++){
			 c[i+spaces] = c[i];
			 if(i==pos){
				 c[i] = '%';
				 c[i+1] = '2';
				 c[i+2] = '0';
			 }
		}
		return c;
	}
	
	

}
