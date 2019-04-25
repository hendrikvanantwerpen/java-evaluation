package java.security;


public interface Key extends java. io. Serializable {
  static final long serialVersionUID
  ;
  public String getAlgorithm( ) ;
  public String getFormat( ) ;
  public byte [] getEncoded( ) ;
}