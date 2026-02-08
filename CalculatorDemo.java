public class CalculatorDemo {
    public static void main(String[] args) {
	
        Calculator cal = new Calculator();

        int result1 = cal.square(
                cal.add(
                        cal.multiply(3, 4),
                        cal.multiply(5, 7)));

        int result2 = cal.add(
                cal.square(cal.add(4, 7)),
                cal.square(cal.add(8, 3)));

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
