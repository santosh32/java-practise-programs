package ds.arrays;
public class FindSubString {
    public static void main(String[] args) {
 
           String inputString;
           String searchSubString;
           int foundIndex;         //index at which subString is found by our method.
           int javaApiFoundIndex;  //index at which subString is found by JAVA API's indexOf() method.
 
           inputString="abctigeraCd";
           searchSubString="tiger";       
           System.out.println("TEST1");
           foundIndex=isSubString(inputString,searchSubString);
           System.out.println(foundIndex>-1 ? inputString+ " contains "+searchSubString + " at index " +foundIndex :  inputString+ "doesn't contains "+searchSubString);
           javaApiFoundIndex=inputString.indexOf("tiger");
           System.out.print("Java API's indexOf() method says> ");
           System.out.println(javaApiFoundIndex>-1 ? inputString+ " contains "+searchSubString + " at index " +javaApiFoundIndex :  inputString+ "doesn't contains "+searchSubString);
           
 
           inputString="tigeraCd";
           searchSubString="tiger";       
           System.out.println("\nTEST2");
           foundIndex=isSubString(inputString,searchSubString);
           System.out.println(foundIndex>-1 ? inputString+ " contains "+searchSubString + " at index " +foundIndex :  inputString+ "doesn't contains "+searchSubString);
           javaApiFoundIndex=inputString.indexOf("tiger");
           System.out.print("Java API's indexOf() method says> ");
           System.out.println(javaApiFoundIndex>-1 ? inputString+ " contains "+searchSubString + " at index " +javaApiFoundIndex :  inputString+ "doesn't contains "+searchSubString);
    }
 
    /**
     * Below method returns subString index in given inputString.
     * Returns -1 if  subString is not found.
     */
    public static int isSubString(String inputString, String searchSubString){
           char inputStringAr[]=inputString.toCharArray();
           char searchSubStringAr[]=searchSubString.toCharArray();
           int count=0; //if count matches searchSubStringAr length,than string is found in  string
           
           for(int i=0;i<inputStringAr.length;i++){
                  
                  if( String.valueOf(inputStringAr[i]).equals(String.valueOf(searchSubStringAr[count]))){
                        count++; //index of  searchSubStringAr
                        if(count==searchSubStringAr.length){
                               return i-count+1; //substring found, return starting index of
                        }
                  }
                  else{
                        /*
                         *Below if condition comes into role, when some part of searchSubString is present before whole searchSubString.
                           Eg= searchSubString=tiger & inputString="tigtiger" [here,  (tig) is present before (tiger)]
                         */
                        if(count>0){ 
                               count=0;
                               i--;
                        }
                        
                  }
                  
           }
           return -1; //substring not found.
    }
}
/*OUTPUT
 
TEST1
abctigeraCd contains tiger at index 3
Java API's indexOf() method says> abctigeraCd contains tiger at index 3
 
TEST2
tigeraCd contains tiger at index 0
Java API's indexOf() method says> tigeraCd contains tiger at index 0
 
 
*/