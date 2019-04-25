package java.security;

import java.io.*;
import java.util.*;
import java.security.KeyStore.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import javax.security.auth.callback.*;

public abstract class KeyStoreSpi {
  public abstract Key engineGetKey(String alias, char [] password) throws NoSuchAlgorithmException, UnrecoverableKeyException ;
  public abstract Certificate [] engineGetCertificateChain(String alias) ;
  public abstract Certificate engineGetCertificate(String alias) ;
  public abstract Date engineGetCreationDate(String alias) ;
  public abstract void engineSetKeyEntry(String alias,Key key,char [] password, Certificate [] chain) throws KeyStoreException ;
  public abstract void engineSetKeyEntry(String alias,byte [] key, Certificate [] chain) throws KeyStoreException ;
  public abstract void engineSetCertificateEntry(String alias, Certificate cert) throws KeyStoreException ;
  public abstract void engineDeleteEntry(String alias) throws KeyStoreException ;
  public abstract Enumeration<String> engineAliases( ) ;
  public abstract boolean engineContainsAlias(String alias) ;
  public abstract int engineSize( ) ;
  public abstract boolean engineIsKeyEntry(String alias) ;
  public abstract boolean engineIsCertificateEntry(String alias) ;
  public abstract String engineGetCertificateAlias(Certificate cert) ;
  public abstract void engineStore(OutputStream stream, char [] password) throws IOException, NoSuchAlgorithmException, CertificateException ;
  public void engineStore(KeyStore. LoadStoreParameter param) throws IOException, NoSuchAlgorithmException, CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void engineLoad(InputStream stream, char [] password) throws IOException, NoSuchAlgorithmException, CertificateException ;
  public void engineLoad(KeyStore. LoadStoreParameter param) throws IOException, NoSuchAlgorithmException, CertificateException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public KeyStore. Entry engineGetEntry(String alias, KeyStore. ProtectionParameter protParam) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void engineSetEntry(String alias,KeyStore. Entry entry, KeyStore. ProtectionParameter protParam) throws KeyStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean engineEntryInstanceOf(String alias, Class<? extends KeyStore. Entry> entryClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}