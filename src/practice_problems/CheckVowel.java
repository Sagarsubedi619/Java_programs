package practice_problems;

public class CheckVowel {
    public boolean vowelCheck(String aString){
        char[] anArray={'a','e','i','o','u'};
        for(int i=0;i<aString.length()-1;i++){
            for(int j=0;j<anArray.length;j++){
                if(aString.charAt(i)==anArray[j]){
                    return true;
                }
            }
        }
      return false;
    }
}
