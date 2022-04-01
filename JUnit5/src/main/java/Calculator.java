import java.util.stream.DoubleStream;

    public class Calculator {
        public double addition(double a, double b) {
            double sum = a + b;
            return sum;
        }

        static double multiply(double... operands) {
            return DoubleStream.of(operands)
                    .reduce(1, (a, b) -> a * b);
        }
    }
