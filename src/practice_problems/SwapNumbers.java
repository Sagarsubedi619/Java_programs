package practice_problems;

public class SwapNumbers {
    public void solution(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}
