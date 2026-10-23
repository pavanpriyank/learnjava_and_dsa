import java.util.Scanner;

public interface findsumofevennum {
    public static void main(String[] args){

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter value of N : ");
        // int n = sc .nextInt();

        // int sum = 0;

        // for(int i=2;i<=n;i+=2){
        //     sum=i;
        //     System.out.println(sum);
        // }
        // sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
            
            int evensum = 0;

        for(int i=1;i<=n;i++){
            if(i % 2 == 0){
                evensum=i;
                System.out.println(evensum);
                }
            }
            
                sc.close();
        }
    }

