public class GCDorHCF {
    public static void main(String[] args){

        int a=36;
        int b=8;

        int num1=a;
        int num2=b;

        while(b !=0){
            int temp = b;
            b= a%b;
            a=temp;
        }
        System.out.print("the HCF of " + num1 + " and " + num2 + " is " + a);


    }
}
