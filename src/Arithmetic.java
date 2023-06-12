public class Arithmetic {
    int number1;
    int number2;

    public void konstruktor (int number3, int number4) {

        number3 = number1;
        number4 = number2;
    }

    public void sumOfNumbers (int sum) {
       sum = number1 + number2;
    }

    public void productOfNumbers (int product) {
        product = number1 * number2;
    }

    public void maxNumbers (int max) {
        if (number1 > number2) {
            max = number1;
        } else if (number2 > number1) {
            max = number2;
        } else {
            return;
        }
    }

    public void minNumbers (int min) {
        if (number1 < number2) {
            min = number1;
        } else if (number2 < number1) {
            min = number2;
        } else {
            return;
        }
    }


}
