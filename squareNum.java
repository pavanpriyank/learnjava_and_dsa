public class squareNum {
    public static void main(String[] args){

        // for(int i=1;i<=10;i++){
        //     int result =0;
        //     result = i*i;
        //     System.out.println(result);
        // }


        for(int i=0;i<=10;i++){
            int square = (int)Math.pow(i,2);       // we use type casting to convert double into intger
            System.out.println(square);
        }
    }
}
