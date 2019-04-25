package java.awt.color;

import sun.java2d.cmm.Profile;
import sun.java2d.cmm.ProfileDeferralInfo;

public class ICC_ProfileGray extends ICC_Profile {
  ICC_ProfileGray(Profile p) {
    super(p);
  }
  ICC_ProfileGray(ProfileDeferralInfo pdi) {
    super(pdi);
  }
  public float [] getMediaWhitePoint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getGamma( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public short [] getTRC( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}