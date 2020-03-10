import java.math.BigInteger;

public class Rational {

    private BigInteger num;
    private BigInteger den;

    Rational(int num, int den) {
        this(new BigInteger(String.valueOf(num)),
             new BigInteger(String.valueOf(den)));
    }

    Rational(BigInteger num, BigInteger den) {
        if (den.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("Incorrect rational: The denominator can't be equal to zero");
        }

        BigInteger gcd = num.gcd(den);
        num = num.divide(gcd);
        den = den.divide(gcd);

        if (den.compareTo(BigInteger.ZERO) < 0) {
            den = den.negate();
            num = num.negate();
        }

        this.num = num;
        this.den = den;
    }

    Rational add(Rational other) {
        return new Rational(
            num.multiply(other.den).add(den.multiply(other.num)),
            den.multiply(other.den)
        );
    }

    Rational subtract(Rational other) {
        return new Rational(
            num.multiply(other.den).subtract(den.multiply(other.num)),
            den.multiply(other.den)
        );
    }

    Rational multiply(Rational other) {
        return new Rational(
            num.multiply(other.num),
            den.multiply(other.den)
        );
    }

    Rational divide(Rational other) {
        return new Rational(
            num.multiply(other.den),
            den.multiply(other.num)
        );
    }

    int compareTo(Rational other) {
        return num.multiply(other.den).compareTo(den.multiply(other.num));
    }

    public String toString() {
        return den.equals(BigInteger.ONE) ? num.toString() : num + "/" + den;
    }

    static Rational parseRational(String input) {
        int index = input.indexOf('/');

        Rational result;
        try {
            if (index == -1) {
                result = new Rational(new BigInteger(input), BigInteger.ONE);
            } else {
                BigInteger num = new BigInteger(input.substring(0, index));
                BigInteger den = new BigInteger(input.substring(index + 1));
                result = new Rational(num, den);
            }
        } catch(NumberFormatException e) {
            throw new NumberFormatException("Incorrect rational: " + input);
        }

        return result;
    }

}
