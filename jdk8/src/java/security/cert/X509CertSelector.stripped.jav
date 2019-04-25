package java.security.cert;

import java.io.IOException;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.*;
import javax.security.auth.x500.X500Principal;
import sun.security.x509.*;

public class X509CertSelector implements CertSelector {
  ;
  public X509CertSelector( ) {
  }
  public void setCertificate(X509Certificate cert) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSerialNumber(BigInteger serial) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setIssuer(X500Principal issuer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setIssuer(String issuerDN) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setIssuer(byte [] issuerDN) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSubject(X500Principal subject) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSubject(String subjectDN) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSubject(byte [] subjectDN) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSubjectKeyIdentifier(byte [] subjectKeyID) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setAuthorityKeyIdentifier(byte [] authorityKeyID) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCertificateValid(Date certValid) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPrivateKeyValid(Date privateKeyValid) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSubjectPublicKeyAlgID(String oid) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSubjectPublicKey(PublicKey key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSubjectPublicKey(byte [] key) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setKeyUsage(boolean [] keyUsage) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setExtendedKeyUsage(Set<String> keyPurposeSet) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMatchAllSubjectAltNames(boolean matchAllNames) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSubjectAlternativeNames(Collection<List<?>> names) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addSubjectAlternativeName(int type, String name) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addSubjectAlternativeName(int type, byte [] name) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setNameConstraints(byte [] bytes) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBasicConstraints(int minMaxPathLen) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPolicy(Set<String> certPolicySet) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPathToNames(Collection<List<?>> names) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPathToName(int type, String name) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPathToName(int type, byte [] name) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public X509Certificate getCertificate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getSerialNumber( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public X500Principal getIssuer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getIssuerAsString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getIssuerAsBytes( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public X500Principal getSubject( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getSubjectAsString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getSubjectAsBytes( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getSubjectKeyIdentifier( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getAuthorityKeyIdentifier( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Date getCertificateValid( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Date getPrivateKeyValid( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getSubjectPublicKeyAlgID( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PublicKey getSubjectPublicKey( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean [] getKeyUsage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<String> getExtendedKeyUsage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getMatchAllSubjectAltNames( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Collection<List<?>> getSubjectAlternativeNames( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getNameConstraints( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getBasicConstraints( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<String> getPolicy( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Collection<List<?>> getPathToNames( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean match(Certificate cert) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}