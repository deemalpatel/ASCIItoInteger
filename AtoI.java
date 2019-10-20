import java.util.*;

public class Main {
		public static void main (String [] args)
		{
		
			System.out.print(myAtoi("-1243"));
		}
		public static int myAtoi(String str) {
	        String trimmed = str.trim();
	        int sum = 0;
	        int sign = 1;
	            
	        int max = Integer.MAX_VALUE;
	        int min = Integer.MIN_VALUE;
	        
	        if (trimmed.isEmpty())
	            return 0;
	        
	        int i=0;
	        if (trimmed.charAt(0) == '-') {
	            sign = -1;
	            i++;
	        } else if (trimmed.charAt(0) == '+')
	            i++;
	        
	        while (i<trimmed.length()) {
	            char c = trimmed.charAt(i);
	            if (c < '0' || c > '9')
	                break;
	            
	            int rem = c - '0';
	            if (sign > 0) {
	                if (sum > max / 10 || max - sum * 10 < rem )
	                    return max;
	            } else {
	                if (-sum < min / 10 || min + sum * 10 > -rem)    
	                    return min;
	            }
	            
	            sum *= 10;
	            sum += rem;
	            i++;
	        }
	        
	        return sign * sum;
	    }
		
		
}
		



