public class AssignmentOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Basic Assignment Operator
        int result1 = num1;
        System.out.println("Basic Assignment: " + result1); // Output: 10

        // Add and Assign
        num1 += num2; // equivalent to num1 = num1 + num2
        System.out.println("Add and Assign: " + num1); // Output: 15

        // Subtract and Assign
        num1 -= num2; // equivalent to num1 = num1 - num2
        System.out.println("Subtract and Assign: " + num1); // Output: 10

        // Multiply and Assign
        num1 *= num2; // equivalent to num1 = num1 * num2
        System.out.println("Multiply and Assign: " + num1); // Output: 50

        // Divide and Assign
        num1 /= num2; // equivalent to num1 = num1 / num2
        System.out.println("Divide and Assign: " + num1); // Output: 10

        // Modulus and Assign
        num1 %= num2; // equivalent to num1 = num1 % num2
        System.out.println("Modulus and Assign: " + num1); // Output: 0

        // Bitwise AND and Assign
        num1 &= num2; // equivalent to num1 = num1 & num2
        System.out.println("Bitwise AND and Assign: " + num1); // Output: 0

        // Bitwise OR and Assign
        num1 |= num2; // equivalent to num1 = num1 | num2
        System.out.println("Bitwise OR and Assign: " + num1); // Output: 5

        // Bitwise XOR and Assign
        num1 ^= num2; // equivalent to num1 = num1 ^ num2
        System.out.println("Bitwise XOR and Assign: " + num1); // Output: 0

        // Bitwise Left Shift and Assign
        num1 <<= num2; // equivalent to num1 = num1 << num2
        System.out.println("Bitwise Left Shift and Assign: " + num1); // Output: 0

        // Bitwise Right Shift and Assign
        num1 >>= num2; // equivalent to num1 = num1 >> num2
        System.out.println("Bitwise Right Shift and Assign: " + num1); // Output: 0
    }
}

