package java.rmi.server;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RemoteObjectInvocationHandler extends RemoteObject implements InvocationHandler {
  public RemoteObjectInvocationHandler(RemoteRef ref) {
    super(ref);
  }
  public Object invoke(Object proxy,Method method, Object [] args) throws Throwable {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}