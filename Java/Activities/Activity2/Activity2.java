package Activity2;

public class Activity2 {

    public static void main(String[] args) {
        int[] arrayOfNumber ={10,77,10,54,-11,10};
        int total = 0;
        int arraySize= arrayOfNumber.length;

        for(int i=0;i<arraySize;i++){
            if(arrayOfNumber[i]==10){
                total= total+arrayOfNumber[i];
            }
        }
        //System.out.println(total);
        if(total==30){
            System.out.println("The total is 30");
        }else{
            System.out.println("The total is not 30");
        }

    }
}
