public class factorialwhile {
    public static void main(String[] args) {
        
        int i=1;
        int factorial = 1;
        int count=0;
        while(i<=10){
        
        factorial = i*i;
            i++;
            count++;
            System.out.println(factorial);
        }
        System.out.println("count factorial Number " + count);
    }
}
