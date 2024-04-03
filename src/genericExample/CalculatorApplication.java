package genericExample;

public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator<Integer> integerCalculator = new Calculator<Integer>();
       integerCalculator.add(2,3);


        Calculator<Integer> doubleCalculator = new Calculator<Integer>();
        doubleCalculator.add(2,3);


        GenericPair<Integer, Integer> integerPair = new GenericPair<>(2, 3);
        integerPair.getA();

        GenericPair<Double, Double> doublePair = new GenericPair<>(2.3,4.3);
        doublePair.getB();

        GenericPair<Integer,Double> doubleLongPair = new GenericPair<>(2,3.4);
    }
}
