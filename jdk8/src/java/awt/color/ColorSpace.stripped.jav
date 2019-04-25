package java.awt.color;


public abstract class ColorSpace implements java. io. Serializable {
  public static final int TYPE_XYZ;
  public static final int TYPE_Lab;
  public static final int TYPE_Luv;
  public static final int TYPE_YCbCr;
  public static final int TYPE_Yxy;
  public static final int TYPE_RGB;
  public static final int TYPE_GRAY;
  public static final int TYPE_HSV;
  public static final int TYPE_HLS;
  public static final int TYPE_CMYK;
  public static final int TYPE_CMY;
  public static final int TYPE_2CLR;
  public static final int TYPE_3CLR;
  public static final int TYPE_4CLR;
  public static final int TYPE_5CLR;
  public static final int TYPE_6CLR;
  public static final int TYPE_7CLR;
  public static final int TYPE_8CLR;
  public static final int TYPE_9CLR;
  public static final int TYPE_ACLR;
  public static final int TYPE_BCLR;
  public static final int TYPE_CCLR;
  public static final int TYPE_DCLR;
  public static final int TYPE_ECLR;
  public static final int TYPE_FCLR;
  public static final int CS_sRGB;
  public static final int CS_LINEAR_RGB;
  public static final int CS_CIEXYZ;
  public static final int CS_PYCC;
  public static final int CS_GRAY;
  protected ColorSpace(int type, int numcomponents) {
  }
  public static ColorSpace getInstance(int colorspace) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCS_sRGB( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract float [] toRGB(float [] colorvalue) ;
  public abstract float [] fromRGB(float [] rgbvalue) ;
  public abstract float [] toCIEXYZ(float [] colorvalue) ;
  public abstract float [] fromCIEXYZ(float [] colorvalue) ;
  public int getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNumComponents( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getName(int idx) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getMinValue(int component) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getMaxValue(int component) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}