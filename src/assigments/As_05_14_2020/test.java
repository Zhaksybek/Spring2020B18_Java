package assigments.As_05_14_2020;

public class test {
    public static void main(String[] args) {
        int quantity = 250 ;
        double total = 15658.92;
        String number =quantity+"-"+(int) (total/100) +"-"+(int)(total*100)%10000;
        System.out.println(number);
        //System.out.println(total*100%10000);
    }
}
