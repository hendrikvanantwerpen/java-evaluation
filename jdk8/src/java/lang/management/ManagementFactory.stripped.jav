package java.lang.management;

import javax.management.MBeanServer;
import javax.management.MBeanServerConnection;
import java.util.List;
import java.util.Set;

public class ManagementFactory {
  private ManagementFactory( ) {
  }
  ;
  public final static String CLASS_LOADING_MXBEAN_NAME;
  public final static String COMPILATION_MXBEAN_NAME;
  public final static String MEMORY_MXBEAN_NAME;
  public final static String OPERATING_SYSTEM_MXBEAN_NAME;
  public final static String RUNTIME_MXBEAN_NAME;
  public final static String THREAD_MXBEAN_NAME;
  public final static String GARBAGE_COLLECTOR_MXBEAN_DOMAIN_TYPE;
  public final static String MEMORY_MANAGER_MXBEAN_DOMAIN_TYPE;
  public final static String MEMORY_POOL_MXBEAN_DOMAIN_TYPE;
  public static ClassLoadingMXBean getClassLoadingMXBean( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MemoryMXBean getMemoryMXBean( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ThreadMXBean getThreadMXBean( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static RuntimeMXBean getRuntimeMXBean( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static CompilationMXBean getCompilationMXBean( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static OperatingSystemMXBean getOperatingSystemMXBean( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static List<MemoryPoolMXBean> getMemoryPoolMXBeans( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static List<MemoryManagerMXBean> getMemoryManagerMXBeans( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static List<GarbageCollectorMXBean> getGarbageCollectorMXBeans( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized MBeanServer getPlatformMBeanServer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> T newPlatformMXBeanProxy(MBeanServerConnection connection,String mxbeanName, Class<T> mxbeanInterface) throws java. io. IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T extends PlatformManagedObject> T getPlatformMXBean(Class<T> mxbeanInterface) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T extends PlatformManagedObject> List<T> getPlatformMXBeans(Class<T> mxbeanInterface) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T extends PlatformManagedObject> T getPlatformMXBean(MBeanServerConnection connection, Class<T> mxbeanInterface) throws java. io. IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T extends PlatformManagedObject> List<T> getPlatformMXBeans(MBeanServerConnection connection, Class<T> mxbeanInterface) throws java. io. IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Set<Class<? extends PlatformManagedObject>> getPlatformManagementInterfaces( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}