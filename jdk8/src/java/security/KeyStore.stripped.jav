package java.security;

import java.io.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.*;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.callback.*;

public class KeyStore {
  public static interface LoadStoreParameter {
    public ProtectionParameter getProtectionParameter( ) ;
  }
  public static interface ProtectionParameter {
  }
  public static class PasswordProtection implements ProtectionParameter, javax. security. auth. Destroyable {
    public PasswordProtection(char [] password) {
    }
    public PasswordProtection(char [] password,String protectionAlgorithm, AlgorithmParameterSpec protectionParameters) {
    }
    public String getProtectionAlgorithm( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public AlgorithmParameterSpec getProtectionParameters( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public synchronized char [] getPassword( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public synchronized void destroy( ) throws DestroyFailedException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public synchronized boolean isDestroyed( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class CallbackHandlerProtection implements ProtectionParameter {
    public CallbackHandlerProtection(CallbackHandler handler) {
    }
    public CallbackHandler getCallbackHandler( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static interface Entry {
    public default Set<Attribute> getAttributes( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public interface Attribute {
      public String getName( ) ;
      public String getValue( ) ;
    }
  }
  public static final class PrivateKeyEntry implements Entry {
    public PrivateKeyEntry(PrivateKey privateKey, Certificate [] chain) {
      this(privateKey, chain, Collections.<Attribute> emptySet( ));
    }
    public PrivateKeyEntry(PrivateKey privateKey,Certificate [] chain, Set<Attribute> attributes) {
    }
    public PrivateKey getPrivateKey( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Certificate [] getCertificateChain( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Certificate getCertificate( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Set<Attribute> getAttributes( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public String toString( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static final class SecretKeyEntry implements Entry {
    public SecretKeyEntry(SecretKey secretKey) {
    }
    public SecretKeyEntry(SecretKey secretKey, Set<Attribute> attributes) {
    }
    public SecretKey getSecretKey( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Set<Attribute> getAttributes( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public String toString( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static final class TrustedCertificateEntry implements Entry {
    public TrustedCertificateEntry(Certificate trustedCert) {
    }
    public TrustedCertificateEntry(Certificate trustedCert, Set<Attribute> attributes) {
    }
    public Certificate getTrustedCertificate( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Set<Attribute> getAttributes( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public String toString( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  protected KeyStore(KeyStoreSpi keyStoreSpi,Provider provider, String type) {
  }
  public static KeyStore getInstance(String type) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static KeyStore getInstance(String type, String provider) throws KeyStoreException, NoSuchProviderException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static KeyStore getInstance(String type, Provider provider) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final static String getDefaultType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Provider getProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Key getKey(String alias, char [] password) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Certificate [] getCertificateChain(String alias) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Certificate getCertificate(String alias) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Date getCreationDate(String alias) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setKeyEntry(String alias,Key key,char [] password, Certificate [] chain) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setKeyEntry(String alias,byte [] key, Certificate [] chain) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setCertificateEntry(String alias, Certificate cert) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void deleteEntry(String alias) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Enumeration<String> aliases( ) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean containsAlias(String alias) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int size( ) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isKeyEntry(String alias) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isCertificateEntry(String alias) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getCertificateAlias(Certificate cert) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void store(OutputStream stream, char [] password) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void store(LoadStoreParameter param) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void load(InputStream stream, char [] password) throws IOException, NoSuchAlgorithmException, CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void load(LoadStoreParameter param) throws IOException, NoSuchAlgorithmException, CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Entry getEntry(String alias, ProtectionParameter protParam) throws NoSuchAlgorithmException, UnrecoverableEntryException, KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setEntry(String alias,Entry entry, ProtectionParameter protParam) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean entryInstanceOf(String alias, Class<? extends KeyStore. Entry> entryClass) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static abstract class Builder {
    protected Builder( ) {
    }
    public abstract KeyStore getKeyStore( ) throws KeyStoreException ;
    public abstract ProtectionParameter getProtectionParameter(String alias) throws KeyStoreException ;
    public static Builder newInstance(final KeyStore keyStore, final ProtectionParameter protectionParameter) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public static Builder newInstance(String type,Provider provider,File file, ProtectionParameter protection) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public static Builder newInstance(final String type,final Provider provider, final ProtectionParameter protection) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
}