package java.awt.im;


public final class InputSubset extends Character. Subset {
  private InputSubset(String name) {
    super(name);
  }
  public static final InputSubset LATIN;
  public static final InputSubset LATIN_DIGITS;
  public static final InputSubset TRADITIONAL_HANZI;
  public static final InputSubset SIMPLIFIED_HANZI;
  public static final InputSubset KANJI;
  public static final InputSubset HANJA;
  public static final InputSubset HALFWIDTH_KATAKANA;
  public static final InputSubset FULLWIDTH_LATIN;
  public static final InputSubset FULLWIDTH_DIGITS;
}