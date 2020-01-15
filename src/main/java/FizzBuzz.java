public class FizzBuzz {
    int num;

    public FizzBuzz(int num) {
        this.num = num;
    }

    String result = "";

    public String print() {
        if (canDivide(15)) {
            result += "FizzBuzz";
        } else if (canDivide(3)) {
            result += "Fizz";
        } else if (canDivide(5)) {
            result += "Buzz";
        } else {
            result += num;
        }
        return result;
    }

    public boolean canDivide(int n) {
        return num % n == 0;
    }
}
