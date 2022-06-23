package codeChallenge;

public class practiceProgram {
    public void numGen(){

       for(int i=1;i<=5;i++){
           for (int j=1;j<=i;j++){
               System.out.print(i);
           }
           System.out.println("");

       }
    }

    public static void main(String[] args) {
        practiceProgram demo1=new practiceProgram();
        demo1.numGen();

    }


}
