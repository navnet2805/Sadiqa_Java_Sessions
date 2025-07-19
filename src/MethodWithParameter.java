public class MethodWithParameter {


    static int SumOfTwoNumbers(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {

        int num1= 10;
        int num2 = 30;

        int result = SumOfTwoNumbers(num1,num2);
        System.out.println(result);
    }
}
