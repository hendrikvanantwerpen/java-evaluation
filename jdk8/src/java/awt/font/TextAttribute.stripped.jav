package java.awt.font;

import java.text.AttributedCharacterIterator.Attribute;

public final class TextAttribute extends Attribute {
  protected TextAttribute(String name) {
    super(name);
  }
  public static final TextAttribute FAMILY;
  public static final TextAttribute WEIGHT;
  public static final Float WEIGHT_EXTRA_LIGHT;
  public static final Float WEIGHT_LIGHT;
  public static final Float WEIGHT_DEMILIGHT;
  public static final Float WEIGHT_REGULAR;
  public static final Float WEIGHT_SEMIBOLD;
  public static final Float WEIGHT_MEDIUM;
  public static final Float WEIGHT_DEMIBOLD;
  public static final Float WEIGHT_BOLD;
  public static final Float WEIGHT_HEAVY;
  public static final Float WEIGHT_EXTRABOLD;
  public static final Float WEIGHT_ULTRABOLD;
  public static final TextAttribute WIDTH;
  public static final Float WIDTH_CONDENSED;
  public static final Float WIDTH_SEMI_CONDENSED;
  public static final Float WIDTH_REGULAR;
  public static final Float WIDTH_SEMI_EXTENDED;
  public static final Float WIDTH_EXTENDED;
  public static final TextAttribute POSTURE;
  public static final Float POSTURE_REGULAR;
  public static final Float POSTURE_OBLIQUE;
  public static final TextAttribute SIZE;
  public static final TextAttribute TRANSFORM;
  public static final TextAttribute SUPERSCRIPT;
  public static final Integer SUPERSCRIPT_SUPER;
  public static final Integer SUPERSCRIPT_SUB;
  public static final TextAttribute FONT;
  public static final TextAttribute CHAR_REPLACEMENT;
  public static final TextAttribute FOREGROUND;
  public static final TextAttribute BACKGROUND;
  public static final TextAttribute UNDERLINE;
  public static final Integer UNDERLINE_ON;
  public static final TextAttribute STRIKETHROUGH;
  public static final Boolean STRIKETHROUGH_ON;
  public static final TextAttribute RUN_DIRECTION;
  public static final Boolean RUN_DIRECTION_LTR;
  public static final Boolean RUN_DIRECTION_RTL;
  public static final TextAttribute BIDI_EMBEDDING;
  public static final TextAttribute JUSTIFICATION;
  public static final Float JUSTIFICATION_FULL;
  public static final Float JUSTIFICATION_NONE;
  public static final TextAttribute INPUT_METHOD_HIGHLIGHT;
  public static final TextAttribute INPUT_METHOD_UNDERLINE;
  public static final Integer UNDERLINE_LOW_ONE_PIXEL;
  public static final Integer UNDERLINE_LOW_TWO_PIXEL;
  public static final Integer UNDERLINE_LOW_DOTTED;
  public static final Integer UNDERLINE_LOW_GRAY;
  public static final Integer UNDERLINE_LOW_DASHED;
  public static final TextAttribute SWAP_COLORS;
  public static final Boolean SWAP_COLORS_ON;
  public static final TextAttribute NUMERIC_SHAPING;
  public static final TextAttribute KERNING;
  public static final Integer KERNING_ON;
  public static final TextAttribute LIGATURES;
  public static final Integer LIGATURES_ON;
  public static final TextAttribute TRACKING;
  public static final Float TRACKING_TIGHT;
  public static final Float TRACKING_LOOSE;
}