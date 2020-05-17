package assigments.As_05_14_2020;

public class Carpet {

    //do not change -- Start
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below

   //  Carpet c2 = new Carpet(20.0, 20.0 , 2.0 , false);
   public Carpet(){
       this.width = 300;
       this.length = 300;
       this.totalPrice = 200;
       this.isPersian = false;
       this.unitPrice = 0;
   }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        if (isPersian==true){
            totalPrice= (width+length) * unitPrice +200;

        }else {
            totalPrice = (width+length) * unitPrice;
        }
    }





}
