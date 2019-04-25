package java.util;


public class Collections {
  private Collections( ) {
  }
  public static <T extends Comparable<? super T>> void sort(List<T> list) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> void sort(List<T> list, Comparator<? super T> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> int binarySearch(List<? extends T> list,T key, Comparator<? super T> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void reverse(List<?> list) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void shuffle(List<?> list) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void shuffle(List<?> list, Random rnd) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void swap(List<?> list,int i, int j) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> void fill(List<? super T> list, T obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> void copy(List<? super T> dest, List<? extends T> src) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T extends Object& Comparable<? super T>> T min(Collection<? extends T> coll) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> T min(Collection<? extends T> coll, Comparator<? super T> comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T extends Object& Comparable<? super T>> T max(Collection<? extends T> coll) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void rotate(List<?> list, int distance) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> boolean replaceAll(List<T> list,T oldVal, T newVal) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int indexOfSubList(List<?> source, List<?> target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int lastIndexOfSubList(List<?> source, List<?> target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Collection<T> unmodifiableCollection(Collection<? extends T> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Set<T> unmodifiableSet(Set<? extends T> s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> SortedSet<T> unmodifiableSortedSet(SortedSet<T> s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> NavigableSet<T> unmodifiableNavigableSet(NavigableSet<T> s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> List<T> unmodifiableList(List<? extends T> list) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <K,V> Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <K,V> SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <K,V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Collection<T> synchronizedCollection(Collection<T> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Set<T> synchronizedSet(Set<T> s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> SortedSet<T> synchronizedSortedSet(SortedSet<T> s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> NavigableSet<T> synchronizedNavigableSet(NavigableSet<T> s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> List<T> synchronizedList(List<T> list) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <K,V> Map<K, V> synchronizedMap(Map<K, V> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <K,V> SortedMap<K, V> synchronizedSortedMap(SortedMap<K, V> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <K,V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <E> Collection<E> checkedCollection(Collection<E> c, Class<E> type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <E> Queue<E> checkedQueue(Queue<E> queue, Class<E> type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <E> Set<E> checkedSet(Set<E> s, Class<E> type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <E> SortedSet<E> checkedSortedSet(SortedSet<E> s, Class<E> type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <E> NavigableSet<E> checkedNavigableSet(NavigableSet<E> s, Class<E> type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <E> List<E> checkedList(List<E> list, Class<E> type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <K,V> Map<K, V> checkedMap(Map<K, V> m,Class<K> keyType, Class<V> valueType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <K,V> SortedMap<K, V> checkedSortedMap(SortedMap<K, V> m,Class<K> keyType, Class<V> valueType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <K,V> NavigableMap<K, V> checkedNavigableMap(NavigableMap<K, V> m,Class<K> keyType, Class<V> valueType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Iterator<T> emptyIterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> ListIterator<T> emptyListIterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Enumeration<T> emptyEnumeration( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final Set EMPTY_SET;
  public static final <T> Set<T> emptySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <E> SortedSet<E> emptySortedSet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <E> NavigableSet<E> emptyNavigableSet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final List EMPTY_LIST;
  public static final <T> List<T> emptyList( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final Map EMPTY_MAP;
  public static final <K,V> Map<K, V> emptyMap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final <K,V> SortedMap<K, V> emptySortedMap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final <K,V> NavigableMap<K, V> emptyNavigableMap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Set<T> singleton(T o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> List<T> singletonList(T o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <K,V> Map<K, V> singletonMap(K key, V value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> List<T> nCopies(int n, T o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Comparator<T> reverseOrder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Comparator<T> reverseOrder(Comparator<T> cmp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Enumeration<T> enumeration(final Collection<T> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> ArrayList<T> list(Enumeration<T> e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int frequency(Collection<?> c, Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean disjoint(Collection<?> c1, Collection<?> c2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> boolean addAll(Collection<? super T> c, T ... elements) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Queue<T> asLifoQueue(Deque<T> deque) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}