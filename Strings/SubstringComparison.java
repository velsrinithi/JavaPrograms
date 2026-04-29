import java.util.Scanner;

public class SubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
         int n=s.length();
         String min=s.substring(0,k);
         String max=s.substring(0,k);
         int i=0;
         while(i<=n-k){
            String val= s.substring(i,i+k);
            if(val.compareTo(min)<0) {
                min=val;
            }
            if(val.compareTo(max)>0){
                max=val;
            }
            i++;
         }
        String smallest = min;
        String largest =max ;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }
