package java.awt.font;

import java.text.AttributedCharacterIterator;
import java.awt.font.FontRenderContext;

public final class TextMeasurer implements Cloneable {
  public TextMeasurer(AttributedCharacterIterator text, FontRenderContext frc) {
  }
  public int getLineBreakIndex(int start, float maxAdvance) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getAdvanceBetween(int start, int limit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TextLayout getLayout(int start, int limit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void insertChar(AttributedCharacterIterator newParagraph, int insertPos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void deleteChar(AttributedCharacterIterator newParagraph, int deletePos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}