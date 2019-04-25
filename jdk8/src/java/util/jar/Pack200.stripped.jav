package java.util.jar;

import java.util.SortedMap;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.IOException;
import java.beans.PropertyChangeListener;

public abstract class Pack200 {
  private Pack200( ) {
  }
  public synchronized static Packer newPacker( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Unpacker newUnpacker( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public interface Packer {
    String SEGMENT_LIMIT
    ;
    String KEEP_FILE_ORDER
    ;
    String EFFORT
    ;
    String DEFLATE_HINT
    ;
    String MODIFICATION_TIME
    ;
    String PASS_FILE_PFX
    ;
    String UNKNOWN_ATTRIBUTE
    ;
    String CLASS_ATTRIBUTE_PFX
    ;
    String FIELD_ATTRIBUTE_PFX
    ;
    String METHOD_ATTRIBUTE_PFX
    ;
    String CODE_ATTRIBUTE_PFX
    ;
    String PROGRESS
    ;
    String KEEP
    ;
    String PASS
    ;
    String STRIP
    ;
    String ERROR
    ;
    String TRUE
    ;
    String FALSE
    ;
    String LATEST
    ;
    SortedMap<String, String> properties( ) ;
    void pack(JarFile in, OutputStream out) throws IOException ;
    void pack(JarInputStream in, OutputStream out) throws IOException ;
    @Deprecated default void addPropertyChangeListener(PropertyChangeListener listener) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Deprecated default void removePropertyChangeListener(PropertyChangeListener listener) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public interface Unpacker {
    String KEEP
    ;
    String TRUE
    ;
    String FALSE
    ;
    String DEFLATE_HINT
    ;
    String PROGRESS
    ;
    SortedMap<String, String> properties( ) ;
    void unpack(InputStream in, JarOutputStream out) throws IOException ;
    void unpack(File in, JarOutputStream out) throws IOException ;
    @Deprecated default void addPropertyChangeListener(PropertyChangeListener listener) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Deprecated default void removePropertyChangeListener(PropertyChangeListener listener) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
}