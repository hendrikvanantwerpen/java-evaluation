package java.util.regex;

import java.util.function.Predicate;
import java.util.stream.Stream;

public final class Pattern implements java. io. Serializable {
  public static final int UNIX_LINES;
  public static final int CASE_INSENSITIVE;
  public static final int COMMENTS;
  public static final int MULTILINE;
  public static final int LITERAL;
  public static final int DOTALL;
  public static final int UNICODE_CASE;
  public static final int CANON_EQ;
  public static final int UNICODE_CHARACTER_CLASS;
  public static Pattern compile(String regex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Pattern compile(String regex, int flags) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String pattern( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Matcher matcher(CharSequence input) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int flags( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean matches(String regex, CharSequence input) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String [] split(CharSequence input, int limit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String [] split(CharSequence input) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String quote(String s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private Pattern(String p, int f) {
  }
  public Predicate<String> asPredicate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Stream<String> splitAsStream(final CharSequence input) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}