package java.sql;


public interface Array {
  String getBaseTypeName( ) throws SQLException ;
  int getBaseType( ) throws SQLException ;
  Object getArray( ) throws SQLException ;
  Object getArray(java. util. Map<String, Class<?>> map) throws SQLException ;
  Object getArray(long index, int count) throws SQLException ;
  Object getArray(long index,int count, java. util. Map<String, Class<?>> map) throws SQLException ;
  ResultSet getResultSet( ) throws SQLException ;
  ResultSet getResultSet(java. util. Map<String, Class<?>> map) throws SQLException ;
  ResultSet getResultSet(long index, int count) throws SQLException ;
  ResultSet getResultSet(long index,int count, java. util. Map<String, Class<?>> map) throws SQLException ;
  void free( ) throws SQLException ;
}