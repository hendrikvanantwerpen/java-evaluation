package java.awt.datatransfer;

import java.io.*;
import java.nio.*;
import java.util.*;

public class DataFlavor implements Externalizable, Cloneable {
  public static final DataFlavor stringFlavor;
  public static final DataFlavor imageFlavor;
  public static final DataFlavor plainTextFlavor;
  public static final String javaSerializedObjectMimeType;
  public static final DataFlavor javaFileListFlavor;
  public static final String javaJVMLocalObjectMimeType;
  public static final String javaRemoteObjectMimeType;
  public static DataFlavor selectionHtmlFlavor;
  public static DataFlavor fragmentHtmlFlavor;
  public static DataFlavor allHtmlFlavor;
  public DataFlavor( ) {
    super( );
  }
  private DataFlavor(String primaryType,String subType,MimeTypeParameterList params,Class<?> representationClass, String humanPresentableName) {
    super( );
  }
  public DataFlavor(Class<?> representationClass, String humanPresentableName) {
    this("application", "x-java-serialized-object", null, representationClass, humanPresentableName);
  }
  public DataFlavor(String mimeType, String humanPresentableName) {
    super( );
  }
  public DataFlavor(String mimeType,String humanPresentableName, ClassLoader classLoader) throws ClassNotFoundException{
    super( );
  }
  public DataFlavor(String mimeType) throws ClassNotFoundException{
    super( );
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final DataFlavor getTextPlainUnicodeFlavor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final DataFlavor selectBestTextFlavor(DataFlavor [] availableFlavors) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Reader getReaderForText(Transferable transferable) throws UnsupportedFlavorException, IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getMimeType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> getRepresentationClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getHumanPresentableName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getPrimaryType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getSubType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getParameter(String paramName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setHumanPresentableName(String humanPresentableName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(DataFlavor that) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(String s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean match(DataFlavor that) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMimeTypeEqual(String mimeType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isMimeTypeEqual(DataFlavor dataFlavor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMimeTypeSerializedObject( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Class<?> getDefaultRepresentationClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getDefaultRepresentationClassAsString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isRepresentationClassInputStream( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isRepresentationClassReader( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isRepresentationClassCharBuffer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isRepresentationClassByteBuffer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isRepresentationClassSerializable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isRepresentationClassRemote( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFlavorSerializedObjectType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFlavorRemoteObjectType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFlavorJavaFileListType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFlavorTextType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void writeExternal(ObjectOutput os) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void readExternal(ObjectInput is) throws IOException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) throws CloneNotSupportedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}