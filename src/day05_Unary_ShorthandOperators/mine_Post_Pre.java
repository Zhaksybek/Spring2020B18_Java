package day05_Unary_ShorthandOperators;

public class mine_Post_Pre {
    public static void main(String[] args) {

      /*  -a--; => -1 ; because a=1 and "-" negates it. but post "--" means next a = 1-1=0
        a++; => 0 ; "++" means next a increases by 1.
                -a--; => -1; a=0+1=1 and "-" negates it. But post "--" means next a is going to be reduced by 1, making a=0 for the next step
                --a; => -1; because pre "--" means reducing by 1 immediately. thus a=0-1=-1    */

     /*   int a =5;
       a =-a-- + -a++;
        //a  =  -a--  + a++  / -a--  * --a;
        System.out.println(a);
        //  -1   +  0  / - 1   *  -1
        // -1 + 0 * -1
        //  -1 + 0 = -1    */


      /*  int b  = -98;
        b = -b--;
        System.out.println(b);  */

      /*  int p = 100; // 100
        System.out.println("p" + p++); // 100
        System.out.println("p" + p++); // 101
        System.out.println("p" + ++p); // 102 + 1
        System.out.println("p:= " + p);   */

      /*  -a--; => -1 ; because a=1 and "-" negates it. but post "--" means next a = 1-1=0
        a++; => 0 ; "++" means next a increases by 1.
                -a--; => -1; a=0+1=1 and "-" negates it. But post "--" means next a is going to be reduced by 1, making a=0 for the next step
                --a; => -1; because pre "--" means reducing by 1 immediately. thus a=0-1=-1
        */


       /* int b = 1;
        b =   -b-- + b++ / -b-- * --b;

        System.out.println(b);   */

        // -1   +  0  /  -1   *  -1     ==    -1 + 0 * -1  == -1 + 0 = -1
     /* b = 1;     value b in round bracket (1)
      b = -(b)-- == -(1), post b (1)-- => (0)       negative b then post decrement
     b = (b)++  ==  (0), post b (0)++ => (1)       value of b then post increment
     b = -(b)-- == -(1), post b (1)-- => (0)       negative b then post decrement
     b = --(b)  == pre b --(0) ==> (-1)            pre decrement of b

      int r = 7;
      r = --r + -r++ + r + ++r;
        System.out.println(r);
*/


       //int i =5;
      //  i = i++;
       // System.out.println(i);

        int i =5;
        int temp = -i;
        i++;
        i= temp;
        System.out.println(i);
        System.out.println(i);

        int b = 6; //-6
            b = -b-- + b++ / -b-- * --b; // -6   +  6
        System.out.println(b);





    }
}
