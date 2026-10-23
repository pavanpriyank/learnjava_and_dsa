public class fibonacciEasy {
    public static void main(String[] args) {
        
        int a=0;
        int b=1;

        System.out.print(a);

        while(b <= 370){
            System.out.print(" , " + b);
            int next= a+b;
            a=b;
            b=next;
        }
    }
}
