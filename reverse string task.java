
public class Main
{
	public String reverseWords( String s){
		int i = s.length() - 1;
		
		String ans = "";
		
		while(i > 0){
		
    		while( i >=0 && s.charAt(i) == " ") i-- ;
    		
    		int j = i;
    		if(i<0)
    		break;
    		
    		while( i>=0 && s.charAt(i) == " ") i--;
    		
    		// enter your code here
    		
    		
    		
    	    
    	   //enter code till here
		} 
		
	    System.out.println(reverseWords("you are mad."));
		
	}
}
