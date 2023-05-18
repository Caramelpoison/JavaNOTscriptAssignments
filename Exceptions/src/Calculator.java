public class Calculator {
    public int num1;


    public static int factorial(int num1){
        int answer = 1;
        if (num1 < 0){
            throw new IllegalArgumentException("This method cannot take negative numbers!!");
        }
        for (int i = 1; i <= num1; i++){
            answer = i * answer;
        }
        return answer;
    }

}
