public class calcu {
        public int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a % b;
    }
}

