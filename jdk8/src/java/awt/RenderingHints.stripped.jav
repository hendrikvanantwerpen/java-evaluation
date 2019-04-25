package java.awt;

import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class RenderingHints implements Map<Object, Object>, Cloneable {
  public abstract static class Key {
    protected Key(int privatekey) {
    }
    public abstract boolean isCompatibleValue(Object val) ;
    public final int hashCode( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final boolean equals(Object o) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static final Key KEY_ANTIALIASING;
  public static final Object VALUE_ANTIALIAS_ON;
  public static final Object VALUE_ANTIALIAS_OFF;
  public static final Object VALUE_ANTIALIAS_DEFAULT;
  public static final Key KEY_RENDERING;
  public static final Object VALUE_RENDER_SPEED;
  public static final Object VALUE_RENDER_QUALITY;
  public static final Object VALUE_RENDER_DEFAULT;
  public static final Key KEY_DITHERING;
  public static final Object VALUE_DITHER_DISABLE;
  public static final Object VALUE_DITHER_ENABLE;
  public static final Object VALUE_DITHER_DEFAULT;
  public static final Key KEY_TEXT_ANTIALIASING;
  public static final Object VALUE_TEXT_ANTIALIAS_ON;
  public static final Object VALUE_TEXT_ANTIALIAS_OFF;
  public static final Object VALUE_TEXT_ANTIALIAS_DEFAULT;
  public static final Object VALUE_TEXT_ANTIALIAS_GASP;
  public static final Object VALUE_TEXT_ANTIALIAS_LCD_HRGB;
  public static final Object VALUE_TEXT_ANTIALIAS_LCD_HBGR;
  public static final Object VALUE_TEXT_ANTIALIAS_LCD_VRGB;
  public static final Object VALUE_TEXT_ANTIALIAS_LCD_VBGR;
  public static final Key KEY_TEXT_LCD_CONTRAST;
  public static final Key KEY_FRACTIONALMETRICS;
  public static final Object VALUE_FRACTIONALMETRICS_OFF;
  public static final Object VALUE_FRACTIONALMETRICS_ON;
  public static final Object VALUE_FRACTIONALMETRICS_DEFAULT;
  public static final Key KEY_INTERPOLATION;
  public static final Object VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
  public static final Object VALUE_INTERPOLATION_BILINEAR;
  public static final Object VALUE_INTERPOLATION_BICUBIC;
  public static final Key KEY_ALPHA_INTERPOLATION;
  public static final Object VALUE_ALPHA_INTERPOLATION_SPEED;
  public static final Object VALUE_ALPHA_INTERPOLATION_QUALITY;
  public static final Object VALUE_ALPHA_INTERPOLATION_DEFAULT;
  public static final Key KEY_COLOR_RENDERING;
  public static final Object VALUE_COLOR_RENDER_SPEED;
  public static final Object VALUE_COLOR_RENDER_QUALITY;
  public static final Object VALUE_COLOR_RENDER_DEFAULT;
  public static final Key KEY_STROKE_CONTROL;
  public static final Object VALUE_STROKE_DEFAULT;
  public static final Object VALUE_STROKE_NORMALIZE;
  public static final Object VALUE_STROKE_PURE;
  public RenderingHints(Map<Key, ?> init) {
  }
  public RenderingHints(Key key, Object value) {
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEmpty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsKey(Object key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsValue(Object value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object get(Object key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object put(Object key, Object value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(RenderingHints hints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object remove(Object key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void putAll(Map<?, ?> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<Object> keySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Collection<Object> values( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<Map. Entry<Object, Object>> entrySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}