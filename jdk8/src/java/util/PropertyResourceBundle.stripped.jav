package java.util;

import java.io.InputStream;
import java.io.Reader;
import java.io.IOException;

public class PropertyResourceBundle extends ResourceBundle {
  @SuppressWarnings({"unchecked","rawtypes"}) public PropertyResourceBundle(InputStream stream) throws IOException{
  }
  @SuppressWarnings({"unchecked","rawtypes"}) public PropertyResourceBundle(Reader reader) throws IOException{
  }
  public Object handleGetObject(String key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Enumeration<String> getKeys( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}