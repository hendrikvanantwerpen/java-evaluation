package java.awt.color;


public class ICC_ColorSpace extends ColorSpace {
  public ICC_ColorSpace(ICC_Profile profile) {
    super(profile. getColorSpaceType( ), profile. getNumComponents( ));
  }
  public ICC_Profile getProfile( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] toRGB(float [] colorvalue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] fromRGB(float [] rgbvalue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] toCIEXYZ(float [] colorvalue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] fromCIEXYZ(float [] colorvalue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getMinValue(int component) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getMaxValue(int component) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}