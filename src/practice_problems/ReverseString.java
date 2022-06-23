package practice_problems;

public class ReverseString {

    public String solution(String aString){
        StringBuilder reversedString=new StringBuilder();
        for(int i=aString.length()-1;i>=0;i--){
           reversedString.append(aString.charAt(i));

        }
        return reversedString.toString();
    }
}
