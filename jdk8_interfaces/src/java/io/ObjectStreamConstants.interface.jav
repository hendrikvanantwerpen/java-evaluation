package java.io;


public interface ObjectStreamConstants {
  final static short STREAM_MAGIC
  ;
  final static short STREAM_VERSION
  ;
  final static byte TC_BASE
  ;
  final static byte TC_NULL
  ;
  final static byte TC_REFERENCE
  ;
  final static byte TC_CLASSDESC
  ;
  final static byte TC_OBJECT
  ;
  final static byte TC_STRING
  ;
  final static byte TC_ARRAY
  ;
  final static byte TC_CLASS
  ;
  final static byte TC_BLOCKDATA
  ;
  final static byte TC_ENDBLOCKDATA
  ;
  final static byte TC_RESET
  ;
  final static byte TC_BLOCKDATALONG
  ;
  final static byte TC_EXCEPTION
  ;
  final static byte TC_LONGSTRING
  ;
  final static byte TC_PROXYCLASSDESC
  ;
  final static byte TC_ENUM
  ;
  final static byte TC_MAX
  ;
  final static int baseWireHandle
  ;
  final static byte SC_WRITE_METHOD
  ;
  final static byte SC_BLOCK_DATA
  ;
  final static byte SC_SERIALIZABLE
  ;
  final static byte SC_EXTERNALIZABLE
  ;
  final static byte SC_ENUM
  ;
  final static SerializablePermission SUBSTITUTION_PERMISSION
  ;
  final static SerializablePermission SUBCLASS_IMPLEMENTATION_PERMISSION
  ;
  public final static int PROTOCOL_VERSION_1
  ;
  public final static int PROTOCOL_VERSION_2
  ;
}