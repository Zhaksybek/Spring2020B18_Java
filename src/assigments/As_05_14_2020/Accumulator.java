package assigments.As_05_14_2020;

public class Accumulator {
    int sum;

    public Accumulator(int sum) {
        this.sum = sum;
    }

    public int getSum(){
        return sum;
    }

    public void add(int num){
        sum += num;
    }

    public void remove(int num2){
        sum -= num2;
    }
    public String toString(){
        return "Sum is: " + sum;
    }


}
