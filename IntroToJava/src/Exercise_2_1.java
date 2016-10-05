/**
 * Author: Vien Van
 * Description: Bitwise Operator
 * Name: Exercise 2.1
 * Date: 10/01/2016
 */
public class Exercise_2_1 {
    public static void main(String args[]) {
        short num1, num2, mask;
        num1 = 0x0A5C; // 0000 1010 0101 1100 //
        mask = 0x00F0; // 0000 0000 1111 0000 //
        num2 = (short) ((num1 << 4) & mask); // 0000 0000 1100 0000 //

        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toBinaryString(mask));
        System.out.println(Integer.toBinaryString(num2));

    }
}
