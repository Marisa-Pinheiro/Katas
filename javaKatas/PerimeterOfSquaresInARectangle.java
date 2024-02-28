package javaKatas;

import java.math.BigInteger;

public class PerimeterOfSquaresInARectangle {

    public static BigInteger perimeter(BigInteger n) {
        // n + 1 is equal to the number of squares inside the rectangle (numbered 0 to n )
        // fibonacci sequence
        if (n.compareTo(BigInteger.ONE) <= 0) {
            return n.multiply(BigInteger.valueOf(4));
        }
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger sum = BigInteger.TWO; // two squares already n = 0 and n = 1

        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
            sum = sum.add(c);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }
}

/* I preferred this one solution

public class SumFct {
	public static BigInteger perimeter(BigInteger n) {

    BigInteger a = BigInteger.ZERO;
    BigInteger b = BigInteger.ONE;
    BigInteger c = BigInteger.ONE;
    BigInteger sum = BigInteger.ZERO;

    for(int i = 0; i <= n.intValue(); i++) {
      a = b;
      b = c;
      c = a.add(b);
      sum = sum.add(a);
    }

    return sum.multiply(BigInteger.valueOf(4));
	}
}
 */