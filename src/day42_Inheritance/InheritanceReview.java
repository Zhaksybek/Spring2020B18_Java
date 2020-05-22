package day42_Inheritance;

class B{
    public B(int a){
        System.out.println("int");
    }
    public B(double a){
        System.out.println("double");
    }
    public B(long a){
        this(1.3);
        System.out.println("long");
        // this(1.3);  we cannot call constructor after other statement
    }
}

public class InheritanceReview extends B{

    public InheritanceReview(String a){
        super(19); // int
        System.out.println("String"); // string
    }

    public static void main(String[] args) {
        InheritanceReview obj = new InheritanceReview("Hello kitty");
    }

}
