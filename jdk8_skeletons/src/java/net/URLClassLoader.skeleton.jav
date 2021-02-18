package java.net;

import java.io.Closeable;
import java.security.SecureClassLoader;

public class URLClassLoader extends SecureClassLoader implements Closeable {
}
final class FactoryURLClassLoader extends URLClassLoader {
}