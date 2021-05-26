package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public static void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		
		// Shift b seven bits to the right
		for(int i = 7; i > -1;i--) {
			System.out.print((b >> i) & 1);
		}
		}
		//Use this method to print the remaining 7 bits of b
	
	
	public static void printShortBinary(short s) {
		// Create 2 byte variables
		short holder = s;
	
		for(int i = 15; i > 7;i--) {
			System.out.print((holder >> i) & 1);
		}
		for(int i = 7; i > -1;i--) {
			System.out.print((s >> i) & 1);
		}
		
		
		
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
	}
	
	public static void printIntBinary(int i) {
		// Create 2 short variables
		short s = (short) i;
		short s2 = (short) (i >>16);
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		printShortBinary(s2);
		printShortBinary(s);
	
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
	}
	
	public static void printLongBinary(long l) {
		// Use the same method as before to complete this method
		int i = (int) l;
		int i2 = (int) (l >>32);
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		printIntBinary(i2);
		printIntBinary(i);
	}
	
	public static void main(String[] args) {
		//printByteBinary((byte) 128);
		//printShortBinary( (short) 258);
		printIntBinary(55);
		//printLongBinary(9223372036854775807L);
	}
}
