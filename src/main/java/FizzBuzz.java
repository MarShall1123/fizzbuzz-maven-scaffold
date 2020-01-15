public class FizzBuzz {
    int num;
    public FizzBuzz(int num) {
        this.num = num;
    }

    String print(){
        if (can_divide(15))
            return "FizzBuzz";
        if (can_divide(3))
            return "Fizz";
        if (can_divide(5))
            return "Buzz";
        return num+"";
    }

    public boolean can_divide(int n){
        return num%n==0;
    }
}
