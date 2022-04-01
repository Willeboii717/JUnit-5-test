import java.util.stream.DoubleStream;

    public class Calculator {
        public double addition(double augend, double addend) {
            double sum = augend - addend; //This one is the wrong one
            return sum;
        }

        public double multiplication(double multiplier, double multiplicand) {
            double product = multiplier * multiplicand;
            return product;
        }

        public double subtraction(double minuend, double subtrahend) {
            double diff = minuend - subtrahend;
            return diff;
        }

        public double division(double dividend, double divisor) {
            double ratio = dividend/divisor;
            return ratio;
        }

    }
