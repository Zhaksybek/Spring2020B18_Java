package training_mine.FOR_LOOP;

public class Practice9 {
    public static void main(String[] args) {

        for (int i= 1; i<=100; i++){
            if (i%2!=0){
                if (i%3==0 || i%5==0) {
                    System.out.print(i + " ");
                }
            }
        }


    }
}
