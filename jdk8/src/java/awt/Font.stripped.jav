package java.awt;

import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.LineMetrics;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.peer.FontPeer;
import java.io.*;
import java.text.AttributedCharacterIterator.Attribute;
import java.text.CharacterIterator;
import java.util.Locale;
import java.util.Map;
import sun.font.AttributeValues;
import sun.font.CreatedFontTracker;
import sun.font.Font2DHandle;

public class Font implements java. io. Serializable {
  public static final String DIALOG;
  public static final String DIALOG_INPUT;
  public static final String SANS_SERIF;
  public static final String SERIF;
  public static final String MONOSPACED;
  public static final int PLAIN;
  public static final int BOLD;
  public static final int ITALIC;
  public static final int ROMAN_BASELINE;
  public static final int CENTER_BASELINE;
  public static final int HANGING_BASELINE;
  public static final int TRUETYPE_FONT;
  public static final int TYPE1_FONT;
  public FontPeer getPeer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Font(String name,int style, int size) {
  }
  private Font(String name,int style, float sizePts) {
  }
  private Font(String name,int style,float sizePts,boolean created, Font2DHandle handle) {
    this(name, style, sizePts);
  }
  private Font(File fontFile,int fontFormat,boolean isCopy, CreatedFontTracker tracker) throws FontFormatException{
  }
  private Font(AttributeValues values,String oldName,int oldStyle,boolean created, Font2DHandle handle) {
  }
  public Font(Map<? extends Attribute, ?> attributes) {
  }
  protected Font(Font font) {
  }
  public static Font getFont(Map<? extends Attribute, ?> attributes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Font createFont(int fontFormat, InputStream fontStream) throws java. awt. FontFormatException, java. io. IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Font createFont(int fontFormat, File fontFile) throws java. awt. FontFormatException, java. io. IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AffineTransform getTransform( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getFamily( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getFamily(Locale l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getPSName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getFontName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getFontName(Locale l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getStyle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getSize2D( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isPlain( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isBold( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isItalic( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isTransformed( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasLayoutAttributes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Font getFont(String nm) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Font decode(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Font getFont(String nm, Font font) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNumGlyphs( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMissingGlyphCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte getBaselineFor(char c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map<TextAttribute, ?> getAttributes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Attribute [] getAvailableAttributes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Font deriveFont(int style, float size) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Font deriveFont(int style, AffineTransform trans) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Font deriveFont(float size) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Font deriveFont(AffineTransform trans) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Font deriveFont(int style) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Font deriveFont(Map<? extends Attribute, ?> attributes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean canDisplay(char c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean canDisplay(int codePoint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int canDisplayUpTo(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int canDisplayUpTo(char [] text,int start, int limit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int canDisplayUpTo(CharacterIterator iter,int start, int limit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getItalicAngle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasUniformLineMetrics( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LineMetrics getLineMetrics(String str, FontRenderContext frc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LineMetrics getLineMetrics(String str,int beginIndex,int limit, FontRenderContext frc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LineMetrics getLineMetrics(char [] chars,int beginIndex,int limit, FontRenderContext frc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LineMetrics getLineMetrics(CharacterIterator ci,int beginIndex,int limit, FontRenderContext frc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getStringBounds(String str, FontRenderContext frc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getStringBounds(String str,int beginIndex,int limit, FontRenderContext frc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getStringBounds(char [] chars,int beginIndex,int limit, FontRenderContext frc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getStringBounds(CharacterIterator ci,int beginIndex,int limit, FontRenderContext frc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getMaxCharBounds(FontRenderContext frc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public GlyphVector createGlyphVector(FontRenderContext frc, String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public GlyphVector createGlyphVector(FontRenderContext frc, char [] chars) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public GlyphVector createGlyphVector(FontRenderContext frc, CharacterIterator ci) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public GlyphVector createGlyphVector(FontRenderContext frc, int [] glyphCodes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public GlyphVector layoutGlyphVector(FontRenderContext frc,char [] text,int start,int limit, int flags) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final int LAYOUT_LEFT_TO_RIGHT;
  public static final int LAYOUT_RIGHT_TO_LEFT;
  public static final int LAYOUT_NO_START_CONTEXT;
  public static final int LAYOUT_NO_LIMIT_CONTEXT;
}