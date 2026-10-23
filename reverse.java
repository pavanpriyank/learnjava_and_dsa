public class reverse {
public static void main(String[] args){

    int n = 654321;

int  reverseSum = 0;
    while(n>0){
        int lastdigit = n%10;
        reverseSum= (reverseSum * 10) + lastdigit;
        n=n/10;

    }
    System.out.println(reverseSum);
    }
}
