package assigments.old_Assigments;

public class assigment_48 {
    public static void main(String[] args) {

        int n1 = 85;
        int n2 = 660;
        int n3 = 20;

        // n2 < n1> n3 ||
        boolean n1Biggest = (n2<n1&&n1>n3);
        boolean n2Biggest = (n1<n2&&n3<n2);
        boolean n3Biggest = (n1<n3&&n2<n3);

        if(n1Biggest){
            System.out.println("n1 is bigger");
        } else  if(n2Biggest){
            System.out.println("n2 is bigger");
        }else if(n3Biggest){
            System.out.println("n3 is bigger");
        }



    }
}
