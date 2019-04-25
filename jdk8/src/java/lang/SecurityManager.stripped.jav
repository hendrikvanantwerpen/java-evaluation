package java.lang;

import java.security.*;
import java.io.FileDescriptor;
import java.net.InetAddress;
import java.lang.reflect.*;

public class SecurityManager {
  public boolean getInCheck( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SecurityManager( ) {
  }
  public Object getSecurityContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkPermission(Permission perm) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkPermission(Permission perm, Object context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkCreateClassLoader( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkAccess(Thread t) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkAccess(ThreadGroup g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkExit(int status) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkExec(String cmd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkLink(String lib) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkRead(FileDescriptor fd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkRead(String file) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkRead(String file, Object context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkWrite(FileDescriptor fd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkWrite(String file) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkDelete(String file) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkConnect(String host, int port) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkConnect(String host,int port, Object context) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkListen(int port) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkAccept(String host, int port) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkMulticast(InetAddress maddr) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkMulticast(InetAddress maddr, byte ttl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkPropertiesAccess( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkPropertyAccess(String key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean checkTopLevelWindow(Object window) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkPrintJobAccess( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkSystemClipboardAccess( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkAwtEventQueueAccess( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkPackageAccess(String pkg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkPackageDefinition(String pkg) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkSetFactory( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkMemberAccess(Class<?> clazz, int which) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkSecurityAccess(String target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ThreadGroup getThreadGroup( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}