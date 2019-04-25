package java.nio.file.attribute;

import java.io.IOException;

public class UserPrincipalNotFoundException extends IOException {
  public UserPrincipalNotFoundException(String name) {
    super( );
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}