package java.sql;


public interface ParameterMetaData extends Wrapper {
  int getParameterCount( ) throws SQLException ;
  int isNullable(int param) throws SQLException ;
  int parameterNoNulls
  ;
  int parameterNullable
  ;
  int parameterNullableUnknown
  ;
  boolean isSigned(int param) throws SQLException ;
  int getPrecision(int param) throws SQLException ;
  int getScale(int param) throws SQLException ;
  int getParameterType(int param) throws SQLException ;
  String getParameterTypeName(int param) throws SQLException ;
  String getParameterClassName(int param) throws SQLException ;
  int parameterModeUnknown
  ;
  int parameterModeIn
  ;
  int parameterModeInOut
  ;
  int parameterModeOut
  ;
  int getParameterMode(int param) throws SQLException ;
}