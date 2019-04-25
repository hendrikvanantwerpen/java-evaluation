package java.sql;


public enum JDBCType implements SQLType {
  BIT (null), TINYINT (null), SMALLINT (null), INTEGER (null), BIGINT (null), FLOAT (null), REAL (null), DOUBLE (null), NUMERIC (null), DECIMAL (null), CHAR (null), VARCHAR (null), LONGVARCHAR (null), DATE (null), TIME (null), TIMESTAMP (null), BINARY (null), VARBINARY (null), LONGVARBINARY (null), NULL (null), OTHER (null), JAVA_OBJECT (null), DISTINCT (null), STRUCT (null), ARRAY (null), BLOB (null), CLOB (null), REF (null), DATALINK (null), BOOLEAN (null), ROWID (null), NCHAR (null), NVARCHAR (null), LONGNVARCHAR (null), NCLOB (null), SQLXML (null), REF_CURSOR (null), TIME_WITH_TIMEZONE (null), TIMESTAMP_WITH_TIMEZONE (null)
  ;  private Integer type;
     JDBCType(final Integer type) {
  }
     public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public String getVendor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public Integer getVendorTypeNumber( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
     public static JDBCType valueOf(int type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}