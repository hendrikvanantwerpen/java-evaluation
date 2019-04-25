package java.awt.color;

import sun.java2d.cmm.Profile;
import sun.java2d.cmm.ProfileDeferralInfo;

public class ICC_ProfileRGB extends ICC_Profile {
  public static final int REDCOMPONENT;
  public static final int GREENCOMPONENT;
  public static final int BLUECOMPONENT;
  ICC_ProfileRGB(Profile p) {
    super(p);
  }
  ICC_ProfileRGB(ProfileDeferralInfo pdi) {
    super(pdi);
  }
  public float [] getMediaWhitePoint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] [] getMatrix( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getGamma(int component) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public short [] getTRC(int component) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}