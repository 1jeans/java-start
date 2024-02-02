package operator;

public class Operator {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a+b;

        System.out.println(sum);

        int diff = a -b;

        System.out.println(diff);

        int multi = a * b;

        System.out.println(multi);

        int div = a / b;

        System.out.println(div);

        int mod = a % b;
        System.out.println(mod);

        //0으로 나눌 수 없음 예외처리됨
        //int z = 10 / 0 ;
    }
}
