package practice_problems;

public class checkPrime {
    public boolean solution(int n){
       for(int i=2;i<=9;i++){
           if(n%i==0 && n!=i){
               return false;
           }
       }
      return true;
    }
}
