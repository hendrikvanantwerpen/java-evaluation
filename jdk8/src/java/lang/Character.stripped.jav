package java.lang;

import java.util.HashMap;

public final class Character implements java. io. Serializable, Comparable<Character> {
  public static final int MIN_RADIX;
  public static final int MAX_RADIX;
  public static final char MIN_VALUE;
  public static final char MAX_VALUE;
  public static final Class<Character> TYPE;
  public static final byte UNASSIGNED;
  public static final byte UPPERCASE_LETTER;
  public static final byte LOWERCASE_LETTER;
  public static final byte TITLECASE_LETTER;
  public static final byte MODIFIER_LETTER;
  public static final byte OTHER_LETTER;
  public static final byte NON_SPACING_MARK;
  public static final byte ENCLOSING_MARK;
  public static final byte COMBINING_SPACING_MARK;
  public static final byte DECIMAL_DIGIT_NUMBER;
  public static final byte LETTER_NUMBER;
  public static final byte OTHER_NUMBER;
  public static final byte SPACE_SEPARATOR;
  public static final byte LINE_SEPARATOR;
  public static final byte PARAGRAPH_SEPARATOR;
  public static final byte CONTROL;
  public static final byte FORMAT;
  public static final byte PRIVATE_USE;
  public static final byte SURROGATE;
  public static final byte DASH_PUNCTUATION;
  public static final byte START_PUNCTUATION;
  public static final byte END_PUNCTUATION;
  public static final byte CONNECTOR_PUNCTUATION;
  public static final byte OTHER_PUNCTUATION;
  public static final byte MATH_SYMBOL;
  public static final byte CURRENCY_SYMBOL;
  public static final byte MODIFIER_SYMBOL;
  public static final byte OTHER_SYMBOL;
  public static final byte INITIAL_QUOTE_PUNCTUATION;
  public static final byte FINAL_QUOTE_PUNCTUATION;
  public static final byte DIRECTIONALITY_UNDEFINED;
  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT;
  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT;
  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC;
  public static final byte DIRECTIONALITY_EUROPEAN_NUMBER;
  public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR;
  public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR;
  public static final byte DIRECTIONALITY_ARABIC_NUMBER;
  public static final byte DIRECTIONALITY_COMMON_NUMBER_SEPARATOR;
  public static final byte DIRECTIONALITY_NONSPACING_MARK;
  public static final byte DIRECTIONALITY_BOUNDARY_NEUTRAL;
  public static final byte DIRECTIONALITY_PARAGRAPH_SEPARATOR;
  public static final byte DIRECTIONALITY_SEGMENT_SEPARATOR;
  public static final byte DIRECTIONALITY_WHITESPACE;
  public static final byte DIRECTIONALITY_OTHER_NEUTRALS;
  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING;
  public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE;
  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING;
  public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE;
  public static final byte DIRECTIONALITY_POP_DIRECTIONAL_FORMAT;
  public static final char MIN_HIGH_SURROGATE;
  public static final char MAX_HIGH_SURROGATE;
  public static final char MIN_LOW_SURROGATE;
  public static final char MAX_LOW_SURROGATE;
  public static final char MIN_SURROGATE;
  public static final char MAX_SURROGATE;
  public static final int MIN_SUPPLEMENTARY_CODE_POINT;
  public static final int MIN_CODE_POINT;
  public static final int MAX_CODE_POINT;
  public static class Subset {
    protected Subset(String name) {
    }
    public final boolean equals(Object obj) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final int hashCode( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final String toString( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static final class UnicodeBlock extends Subset {
    private UnicodeBlock(String idName) {
      super(idName);
    }
    private UnicodeBlock(String idName, String alias) {
      this(idName);
    }
    private UnicodeBlock(String idName, String ... aliases) {
      this(idName);
    }
    public static final UnicodeBlock BASIC_LATIN;
    public static final UnicodeBlock LATIN_1_SUPPLEMENT;
    public static final UnicodeBlock LATIN_EXTENDED_A;
    public static final UnicodeBlock LATIN_EXTENDED_B;
    public static final UnicodeBlock IPA_EXTENSIONS;
    public static final UnicodeBlock SPACING_MODIFIER_LETTERS;
    public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS;
    public static final UnicodeBlock GREEK;
    public static final UnicodeBlock CYRILLIC;
    public static final UnicodeBlock ARMENIAN;
    public static final UnicodeBlock HEBREW;
    public static final UnicodeBlock ARABIC;
    public static final UnicodeBlock DEVANAGARI;
    public static final UnicodeBlock BENGALI;
    public static final UnicodeBlock GURMUKHI;
    public static final UnicodeBlock GUJARATI;
    public static final UnicodeBlock ORIYA;
    public static final UnicodeBlock TAMIL;
    public static final UnicodeBlock TELUGU;
    public static final UnicodeBlock KANNADA;
    public static final UnicodeBlock MALAYALAM;
    public static final UnicodeBlock THAI;
    public static final UnicodeBlock LAO;
    public static final UnicodeBlock TIBETAN;
    public static final UnicodeBlock GEORGIAN;
    public static final UnicodeBlock HANGUL_JAMO;
    public static final UnicodeBlock LATIN_EXTENDED_ADDITIONAL;
    public static final UnicodeBlock GREEK_EXTENDED;
    public static final UnicodeBlock GENERAL_PUNCTUATION;
    public static final UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS;
    public static final UnicodeBlock CURRENCY_SYMBOLS;
    public static final UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS;
    public static final UnicodeBlock LETTERLIKE_SYMBOLS;
    public static final UnicodeBlock NUMBER_FORMS;
    public static final UnicodeBlock ARROWS;
    public static final UnicodeBlock MATHEMATICAL_OPERATORS;
    public static final UnicodeBlock MISCELLANEOUS_TECHNICAL;
    public static final UnicodeBlock CONTROL_PICTURES;
    public static final UnicodeBlock OPTICAL_CHARACTER_RECOGNITION;
    public static final UnicodeBlock ENCLOSED_ALPHANUMERICS;
    public static final UnicodeBlock BOX_DRAWING;
    public static final UnicodeBlock BLOCK_ELEMENTS;
    public static final UnicodeBlock GEOMETRIC_SHAPES;
    public static final UnicodeBlock MISCELLANEOUS_SYMBOLS;
    public static final UnicodeBlock DINGBATS;
    public static final UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION;
    public static final UnicodeBlock HIRAGANA;
    public static final UnicodeBlock KATAKANA;
    public static final UnicodeBlock BOPOMOFO;
    public static final UnicodeBlock HANGUL_COMPATIBILITY_JAMO;
    public static final UnicodeBlock KANBUN;
    public static final UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS;
    public static final UnicodeBlock CJK_COMPATIBILITY;
    public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS;
    public static final UnicodeBlock HANGUL_SYLLABLES;
    public static final UnicodeBlock PRIVATE_USE_AREA;
    public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS;
    public static final UnicodeBlock ALPHABETIC_PRESENTATION_FORMS;
    public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_A;
    public static final UnicodeBlock COMBINING_HALF_MARKS;
    public static final UnicodeBlock CJK_COMPATIBILITY_FORMS;
    public static final UnicodeBlock SMALL_FORM_VARIANTS;
    public static final UnicodeBlock ARABIC_PRESENTATION_FORMS_B;
    public static final UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS;
    public static final UnicodeBlock SPECIALS;
    public static final UnicodeBlock SURROGATES_AREA;
    public static final UnicodeBlock SYRIAC;
    public static final UnicodeBlock THAANA;
    public static final UnicodeBlock SINHALA;
    public static final UnicodeBlock MYANMAR;
    public static final UnicodeBlock ETHIOPIC;
    public static final UnicodeBlock CHEROKEE;
    public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS;
    public static final UnicodeBlock OGHAM;
    public static final UnicodeBlock RUNIC;
    public static final UnicodeBlock KHMER;
    public static final UnicodeBlock MONGOLIAN;
    public static final UnicodeBlock BRAILLE_PATTERNS;
    public static final UnicodeBlock CJK_RADICALS_SUPPLEMENT;
    public static final UnicodeBlock KANGXI_RADICALS;
    public static final UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS;
    public static final UnicodeBlock BOPOMOFO_EXTENDED;
    public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A;
    public static final UnicodeBlock YI_SYLLABLES;
    public static final UnicodeBlock YI_RADICALS;
    public static final UnicodeBlock CYRILLIC_SUPPLEMENTARY;
    public static final UnicodeBlock TAGALOG;
    public static final UnicodeBlock HANUNOO;
    public static final UnicodeBlock BUHID;
    public static final UnicodeBlock TAGBANWA;
    public static final UnicodeBlock LIMBU;
    public static final UnicodeBlock TAI_LE;
    public static final UnicodeBlock KHMER_SYMBOLS;
    public static final UnicodeBlock PHONETIC_EXTENSIONS;
    public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A;
    public static final UnicodeBlock SUPPLEMENTAL_ARROWS_A;
    public static final UnicodeBlock SUPPLEMENTAL_ARROWS_B;
    public static final UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B;
    public static final UnicodeBlock SUPPLEMENTAL_MATHEMATICAL_OPERATORS;
    public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_ARROWS;
    public static final UnicodeBlock KATAKANA_PHONETIC_EXTENSIONS;
    public static final UnicodeBlock YIJING_HEXAGRAM_SYMBOLS;
    public static final UnicodeBlock VARIATION_SELECTORS;
    public static final UnicodeBlock LINEAR_B_SYLLABARY;
    public static final UnicodeBlock LINEAR_B_IDEOGRAMS;
    public static final UnicodeBlock AEGEAN_NUMBERS;
    public static final UnicodeBlock OLD_ITALIC;
    public static final UnicodeBlock GOTHIC;
    public static final UnicodeBlock UGARITIC;
    public static final UnicodeBlock DESERET;
    public static final UnicodeBlock SHAVIAN;
    public static final UnicodeBlock OSMANYA;
    public static final UnicodeBlock CYPRIOT_SYLLABARY;
    public static final UnicodeBlock BYZANTINE_MUSICAL_SYMBOLS;
    public static final UnicodeBlock MUSICAL_SYMBOLS;
    public static final UnicodeBlock TAI_XUAN_JING_SYMBOLS;
    public static final UnicodeBlock MATHEMATICAL_ALPHANUMERIC_SYMBOLS;
    public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B;
    public static final UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT;
    public static final UnicodeBlock TAGS;
    public static final UnicodeBlock VARIATION_SELECTORS_SUPPLEMENT;
    public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_A;
    public static final UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_B;
    public static final UnicodeBlock HIGH_SURROGATES;
    public static final UnicodeBlock HIGH_PRIVATE_USE_SURROGATES;
    public static final UnicodeBlock LOW_SURROGATES;
    public static final UnicodeBlock ARABIC_SUPPLEMENT;
    public static final UnicodeBlock NKO;
    public static final UnicodeBlock SAMARITAN;
    public static final UnicodeBlock MANDAIC;
    public static final UnicodeBlock ETHIOPIC_SUPPLEMENT;
    public static final UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED;
    public static final UnicodeBlock NEW_TAI_LUE;
    public static final UnicodeBlock BUGINESE;
    public static final UnicodeBlock TAI_THAM;
    public static final UnicodeBlock BALINESE;
    public static final UnicodeBlock SUNDANESE;
    public static final UnicodeBlock BATAK;
    public static final UnicodeBlock LEPCHA;
    public static final UnicodeBlock OL_CHIKI;
    public static final UnicodeBlock VEDIC_EXTENSIONS;
    public static final UnicodeBlock PHONETIC_EXTENSIONS_SUPPLEMENT;
    public static final UnicodeBlock COMBINING_DIACRITICAL_MARKS_SUPPLEMENT;
    public static final UnicodeBlock GLAGOLITIC;
    public static final UnicodeBlock LATIN_EXTENDED_C;
    public static final UnicodeBlock COPTIC;
    public static final UnicodeBlock GEORGIAN_SUPPLEMENT;
    public static final UnicodeBlock TIFINAGH;
    public static final UnicodeBlock ETHIOPIC_EXTENDED;
    public static final UnicodeBlock CYRILLIC_EXTENDED_A;
    public static final UnicodeBlock SUPPLEMENTAL_PUNCTUATION;
    public static final UnicodeBlock CJK_STROKES;
    public static final UnicodeBlock LISU;
    public static final UnicodeBlock VAI;
    public static final UnicodeBlock CYRILLIC_EXTENDED_B;
    public static final UnicodeBlock BAMUM;
    public static final UnicodeBlock MODIFIER_TONE_LETTERS;
    public static final UnicodeBlock LATIN_EXTENDED_D;
    public static final UnicodeBlock SYLOTI_NAGRI;
    public static final UnicodeBlock COMMON_INDIC_NUMBER_FORMS;
    public static final UnicodeBlock PHAGS_PA;
    public static final UnicodeBlock SAURASHTRA;
    public static final UnicodeBlock DEVANAGARI_EXTENDED;
    public static final UnicodeBlock KAYAH_LI;
    public static final UnicodeBlock REJANG;
    public static final UnicodeBlock HANGUL_JAMO_EXTENDED_A;
    public static final UnicodeBlock JAVANESE;
    public static final UnicodeBlock CHAM;
    public static final UnicodeBlock MYANMAR_EXTENDED_A;
    public static final UnicodeBlock TAI_VIET;
    public static final UnicodeBlock ETHIOPIC_EXTENDED_A;
    public static final UnicodeBlock MEETEI_MAYEK;
    public static final UnicodeBlock HANGUL_JAMO_EXTENDED_B;
    public static final UnicodeBlock VERTICAL_FORMS;
    public static final UnicodeBlock ANCIENT_GREEK_NUMBERS;
    public static final UnicodeBlock ANCIENT_SYMBOLS;
    public static final UnicodeBlock PHAISTOS_DISC;
    public static final UnicodeBlock LYCIAN;
    public static final UnicodeBlock CARIAN;
    public static final UnicodeBlock OLD_PERSIAN;
    public static final UnicodeBlock IMPERIAL_ARAMAIC;
    public static final UnicodeBlock PHOENICIAN;
    public static final UnicodeBlock LYDIAN;
    public static final UnicodeBlock KHAROSHTHI;
    public static final UnicodeBlock OLD_SOUTH_ARABIAN;
    public static final UnicodeBlock AVESTAN;
    public static final UnicodeBlock INSCRIPTIONAL_PARTHIAN;
    public static final UnicodeBlock INSCRIPTIONAL_PAHLAVI;
    public static final UnicodeBlock OLD_TURKIC;
    public static final UnicodeBlock RUMI_NUMERAL_SYMBOLS;
    public static final UnicodeBlock BRAHMI;
    public static final UnicodeBlock KAITHI;
    public static final UnicodeBlock CUNEIFORM;
    public static final UnicodeBlock CUNEIFORM_NUMBERS_AND_PUNCTUATION;
    public static final UnicodeBlock EGYPTIAN_HIEROGLYPHS;
    public static final UnicodeBlock BAMUM_SUPPLEMENT;
    public static final UnicodeBlock KANA_SUPPLEMENT;
    public static final UnicodeBlock ANCIENT_GREEK_MUSICAL_NOTATION;
    public static final UnicodeBlock COUNTING_ROD_NUMERALS;
    public static final UnicodeBlock MAHJONG_TILES;
    public static final UnicodeBlock DOMINO_TILES;
    public static final UnicodeBlock PLAYING_CARDS;
    public static final UnicodeBlock ENCLOSED_ALPHANUMERIC_SUPPLEMENT;
    public static final UnicodeBlock ENCLOSED_IDEOGRAPHIC_SUPPLEMENT;
    public static final UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS;
    public static final UnicodeBlock EMOTICONS;
    public static final UnicodeBlock TRANSPORT_AND_MAP_SYMBOLS;
    public static final UnicodeBlock ALCHEMICAL_SYMBOLS;
    public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C;
    public static final UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D;
    public static final UnicodeBlock ARABIC_EXTENDED_A;
    public static final UnicodeBlock SUNDANESE_SUPPLEMENT;
    public static final UnicodeBlock MEETEI_MAYEK_EXTENSIONS;
    public static final UnicodeBlock MEROITIC_HIEROGLYPHS;
    public static final UnicodeBlock MEROITIC_CURSIVE;
    public static final UnicodeBlock SORA_SOMPENG;
    public static final UnicodeBlock CHAKMA;
    public static final UnicodeBlock SHARADA;
    public static final UnicodeBlock TAKRI;
    public static final UnicodeBlock MIAO;
    public static final UnicodeBlock ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS;
    public static UnicodeBlock of(char c) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public static UnicodeBlock of(int codePoint) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public static final UnicodeBlock forName(String blockName) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static enum UnicodeScript {
    COMMON, LATIN, GREEK, CYRILLIC, ARMENIAN, HEBREW, ARABIC, SYRIAC, THAANA, DEVANAGARI, BENGALI, GURMUKHI, GUJARATI, ORIYA, TAMIL, TELUGU, KANNADA, MALAYALAM, SINHALA, THAI, LAO, TIBETAN, MYANMAR, GEORGIAN, HANGUL, ETHIOPIC, CHEROKEE, CANADIAN_ABORIGINAL, OGHAM, RUNIC, KHMER, MONGOLIAN, HIRAGANA, KATAKANA, BOPOMOFO, HAN, YI, OLD_ITALIC, GOTHIC, DESERET, INHERITED, TAGALOG, HANUNOO, BUHID, TAGBANWA, LIMBU, TAI_LE, LINEAR_B, UGARITIC, SHAVIAN, OSMANYA, CYPRIOT, BRAILLE, BUGINESE, COPTIC, NEW_TAI_LUE, GLAGOLITIC, TIFINAGH, SYLOTI_NAGRI, OLD_PERSIAN, KHAROSHTHI, BALINESE, CUNEIFORM, PHOENICIAN, PHAGS_PA, NKO, SUNDANESE, BATAK, LEPCHA, OL_CHIKI, VAI, SAURASHTRA, KAYAH_LI, REJANG, LYCIAN, CARIAN, LYDIAN, CHAM, TAI_THAM, TAI_VIET, AVESTAN, EGYPTIAN_HIEROGLYPHS, SAMARITAN, MANDAIC, LISU, BAMUM, JAVANESE, MEETEI_MAYEK, IMPERIAL_ARAMAIC, OLD_SOUTH_ARABIAN, INSCRIPTIONAL_PARTHIAN, INSCRIPTIONAL_PAHLAVI, OLD_TURKIC, BRAHMI, KAITHI, MEROITIC_HIEROGLYPHS, MEROITIC_CURSIVE, SORA_SOMPENG, CHAKMA, SHARADA, TAKRI, MIAO, UNKNOWN
    ;  private static final int [] scriptStarts;
       private static final UnicodeScript [] scripts;
       private static HashMap<String, Character. UnicodeScript> aliases;
       static {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
       public static UnicodeScript of(int codePoint) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
       public static final UnicodeScript forName(String scriptName) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public Character(char value) {
  }
  public static Character valueOf(char c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char charValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int hashCode(char value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String toString(char c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isValidCodePoint(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isBmpCodePoint(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isSupplementaryCodePoint(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isHighSurrogate(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isLowSurrogate(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isSurrogate(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isSurrogatePair(char high, char low) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int charCount(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int toCodePoint(char high, char low) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int codePointAt(CharSequence seq, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int codePointAt(char [] a, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int codePointAt(char [] a,int index, int limit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int codePointBefore(CharSequence seq, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int codePointBefore(char [] a, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int codePointBefore(char [] a,int index, int start) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static char highSurrogate(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static char lowSurrogate(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int toChars(int codePoint,char [] dst, int dstIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static char [] toChars(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int codePointCount(CharSequence seq,int beginIndex, int endIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int codePointCount(char [] a,int offset, int count) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int offsetByCodePoints(CharSequence seq,int index, int codePointOffset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int offsetByCodePoints(char [] a,int start,int count,int index, int codePointOffset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isLowerCase(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isLowerCase(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isUpperCase(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isUpperCase(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isTitleCase(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isTitleCase(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isDigit(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isDigit(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isDefined(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isDefined(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isLetter(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isLetter(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isLetterOrDigit(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isLetterOrDigit(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isJavaLetter(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isJavaLetterOrDigit(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isAlphabetic(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isIdeographic(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isJavaIdentifierStart(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isJavaIdentifierStart(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isJavaIdentifierPart(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isJavaIdentifierPart(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isUnicodeIdentifierStart(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isUnicodeIdentifierStart(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isUnicodeIdentifierPart(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isUnicodeIdentifierPart(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isIdentifierIgnorable(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isIdentifierIgnorable(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static char toLowerCase(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int toLowerCase(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static char toUpperCase(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int toUpperCase(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static char toTitleCase(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int toTitleCase(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int digit(char ch, int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int digit(int codePoint, int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int getNumericValue(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int getNumericValue(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isSpace(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isSpaceChar(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isSpaceChar(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isWhitespace(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isWhitespace(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isISOControl(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isISOControl(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int getType(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int getType(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static char forDigit(int digit, int radix) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static byte getDirectionality(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static byte getDirectionality(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isMirrored(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isMirrored(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int compareTo(Character anotherCharacter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int compare(char x, char y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final int SIZE;
  public static final int BYTES;
  public static char reverseBytes(char ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String getName(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}