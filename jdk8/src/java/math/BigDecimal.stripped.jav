package java.math;


public class BigDecimal extends Number implements Comparable<BigDecimal> {
  public static final BigDecimal ZERO;
  public static final BigDecimal ONE;
  public static final BigDecimal TEN;
  BigDecimal(BigInteger intVal,long val,int scale, int prec) {
  }
  public BigDecimal(char [] in,int offset, int len) {
    this(in, offset, len, MathContext.UNLIMITED);
  }
  public BigDecimal(char [] in,int offset,int len, MathContext mc) {
  }
  public BigDecimal(char [] in) {
    this(in, 0, in.length);
  }
  public BigDecimal(char [] in, MathContext mc) {
    this(in, 0, in.length, mc);
  }
  public BigDecimal(String val) {
    this(val. toCharArray( ), 0, val. length( ));
  }
  public BigDecimal(String val, MathContext mc) {
    this(val. toCharArray( ), 0, val. length( ), mc);
  }
  public BigDecimal(double val) {
    this(val, MathContext.UNLIMITED);
  }
  public BigDecimal(double val, MathContext mc) {
  }
  public BigDecimal(BigInteger val) {
  }
  public BigDecimal(BigInteger val, MathContext mc) {
    this(val, 0, mc);
  }
  public BigDecimal(BigInteger unscaledVal, int scale) {
  }
  public BigDecimal(BigInteger unscaledVal,int scale, MathContext mc) {
  }
  public BigDecimal(int val) {
  }
  public BigDecimal(int val, MathContext mc) {
  }
  public BigDecimal(long val) {
  }
  public BigDecimal(long val, MathContext mc) {
  }
  public static BigDecimal valueOf(long unscaledVal, int scale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static BigDecimal valueOf(long val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static BigDecimal valueOf(double val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal add(BigDecimal augend) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal add(BigDecimal augend, MathContext mc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal subtract(BigDecimal subtrahend) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal subtract(BigDecimal subtrahend, MathContext mc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal multiply(BigDecimal multiplicand) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal multiply(BigDecimal multiplicand, MathContext mc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal divide(BigDecimal divisor,int scale, int roundingMode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal divide(BigDecimal divisor,int scale, RoundingMode roundingMode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal divide(BigDecimal divisor, int roundingMode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal divide(BigDecimal divisor, RoundingMode roundingMode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal divide(BigDecimal divisor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal divide(BigDecimal divisor, MathContext mc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal divideToIntegralValue(BigDecimal divisor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal divideToIntegralValue(BigDecimal divisor, MathContext mc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal remainder(BigDecimal divisor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal remainder(BigDecimal divisor, MathContext mc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal [] divideAndRemainder(BigDecimal divisor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal [] divideAndRemainder(BigDecimal divisor, MathContext mc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal pow(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal pow(int n, MathContext mc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal abs( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal abs(MathContext mc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal negate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal negate(MathContext mc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal plus( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal plus(MathContext mc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int signum( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int scale( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int precision( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger unscaledValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static int ROUND_UP;
  public final static int ROUND_DOWN;
  public final static int ROUND_CEILING;
  public final static int ROUND_FLOOR;
  public final static int ROUND_HALF_UP;
  public final static int ROUND_HALF_DOWN;
  public final static int ROUND_HALF_EVEN;
  public final static int ROUND_UNNECESSARY;
  public BigDecimal round(MathContext mc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal setScale(int newScale, RoundingMode roundingMode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal setScale(int newScale, int roundingMode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal setScale(int newScale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal movePointLeft(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal movePointRight(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal scaleByPowerOfTen(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal stripTrailingZeros( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(BigDecimal val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal min(BigDecimal val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal max(BigDecimal val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toEngineeringString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toPlainString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger toBigInteger( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger toBigIntegerExact( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long longValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long longValueExact( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int intValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int intValueExact( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public short shortValueExact( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte byteValueExact( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float floatValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double doubleValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigDecimal ulp( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}