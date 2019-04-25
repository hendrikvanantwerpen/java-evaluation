package java.security.cert;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class PKIXParameters implements CertPathParameters {
  public PKIXParameters(Set<TrustAnchor> trustAnchors) throws InvalidAlgorithmParameterException{
  }
  public PKIXParameters(KeyStore keystore) throws KeyStoreException, InvalidAlgorithmParameterException{
  }
  public Set<TrustAnchor> getTrustAnchors( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTrustAnchors(Set<TrustAnchor> trustAnchors) throws InvalidAlgorithmParameterException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<String> getInitialPolicies( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setInitialPolicies(Set<String> initialPolicies) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCertStores(List<CertStore> stores) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addCertStore(CertStore store) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<CertStore> getCertStores( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setRevocationEnabled(boolean val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isRevocationEnabled( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setExplicitPolicyRequired(boolean val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isExplicitPolicyRequired( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPolicyMappingInhibited(boolean val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isPolicyMappingInhibited( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setAnyPolicyInhibited(boolean val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAnyPolicyInhibited( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPolicyQualifiersRejected(boolean qualifiersRejected) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getPolicyQualifiersRejected( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Date getDate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDate(Date date) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCertPathCheckers(List<PKIXCertPathChecker> checkers) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<PKIXCertPathChecker> getCertPathCheckers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addCertPathChecker(PKIXCertPathChecker checker) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getSigProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSigProvider(String sigProvider) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CertSelector getTargetCertConstraints( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTargetCertConstraints(CertSelector selector) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}