public class FizzBuzz {
    int num;
    public FizzBuzz(int num) {
        this.num = num;
    }

    String print(){
        if (canDivide(15)){
            return "FizzBuzz";
        }
        if (canDivide(3)){
            return "Fizz";
        }
        if (canDivide(5)){
            return "Buzz";
        }
        return num + "";
    }

    public boolean canDivide(int n){
        return num % n == 0;
    }
}
