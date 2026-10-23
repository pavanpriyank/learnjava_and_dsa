import java.util.Scanner;

public class findsumododdnum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N : ");
        int n = sc.nextInt();

        int oddsum = 0;
        for(int i=1;i<=n;i++){
            if(i % 2 != 0){
            oddsum=i;
            System.out.print(oddsum);
            }
        }
        sc.close();
    }
}
