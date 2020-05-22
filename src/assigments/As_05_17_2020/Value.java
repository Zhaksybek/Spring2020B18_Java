package assigments.As_05_17_2020;

public class Value {

    private int val = 0;
    private boolean wasModified = false;
    //WRITE YOUR CODE HERE
    public int k=0;
    public int j=0;


    public Value(int val){
        this.val=val;
        j++;
    }

    public Value(){

    }

    public void setVal(int val){
        this.val=val;
        k++;

    }

    public int getVal(){
        if (k>0){
        return val;
        }else if (j>0){
            return val;
        }else {
            return 0;
        }

    }

    public boolean wasModified(){
        if (k>0){
            return true;
        }else {
            return false;
        }
    }






}
