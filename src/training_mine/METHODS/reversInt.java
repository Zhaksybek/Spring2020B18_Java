package training_mine.METHODS;

public class reversInt {
    public static void main(String[] args) {
        //System.out.println(at3("longword","foo"));



    }

    public static String removeFirst(String target) {

       return target.substring(1);

    }

    public static String biggerS(String a ,String b)
    {
        if (a.length()>b.length()){
            return a;
        }else {
            return b;
        }

    }
    public static String at3(String target,String word)
    {
        String result = target.substring(0,3)+word+target.substring(3);
        return result;

    }



    public static String limit(String text, int maxLength)
    {
        String result = text.substring(0,maxLength);
        return result;

    }

}
