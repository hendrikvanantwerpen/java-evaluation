package java.awt;


public final class JobAttributes implements Cloneable {
  public static final class DefaultSelectionType extends AttributeValue {
    public static final DefaultSelectionType ALL;
    public static final DefaultSelectionType RANGE;
    public static final DefaultSelectionType SELECTION;
    private DefaultSelectionType(int type) {
      super(type, NAMES);
    }
  }
  public static final class DestinationType extends AttributeValue {
    public static final DestinationType FILE;
    public static final DestinationType PRINTER;
    private DestinationType(int type) {
      super(type, NAMES);
    }
  }
  public static final class DialogType extends AttributeValue {
    public static final DialogType COMMON;
    public static final DialogType NATIVE;
    public static final DialogType NONE;
    private DialogType(int type) {
      super(type, NAMES);
    }
  }
  public static final class MultipleDocumentHandlingType extends AttributeValue {
    public static final MultipleDocumentHandlingType SEPARATE_DOCUMENTS_COLLATED_COPIES;
    public static final MultipleDocumentHandlingType SEPARATE_DOCUMENTS_UNCOLLATED_COPIES;
    private MultipleDocumentHandlingType(int type) {
      super(type, NAMES);
    }
  }
  public static final class SidesType extends AttributeValue {
    public static final SidesType ONE_SIDED;
    public static final SidesType TWO_SIDED_LONG_EDGE;
    public static final SidesType TWO_SIDED_SHORT_EDGE;
    private SidesType(int type) {
      super(type, NAMES);
    }
  }
  public JobAttributes( ) {
  }
  public JobAttributes(JobAttributes obj) {
  }
  public JobAttributes(int copies,DefaultSelectionType defaultSelection,DestinationType destination,DialogType dialog,String fileName,int maxPage,int minPage,MultipleDocumentHandlingType multipleDocumentHandling,int [] [] pageRanges,String printer, SidesType sides) {
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void set(JobAttributes obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getCopies( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCopies(int copies) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCopiesToDefault( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DefaultSelectionType getDefaultSelection( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDefaultSelection(DefaultSelectionType defaultSelection) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DestinationType getDestination( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDestination(DestinationType destination) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DialogType getDialog( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDialog(DialogType dialog) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getFileName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFileName(String fileName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getFromPage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFromPage(int fromPage) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMaxPage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMaxPage(int maxPage) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMinPage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMinPage(int minPage) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MultipleDocumentHandlingType getMultipleDocumentHandling( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMultipleDocumentHandling(MultipleDocumentHandlingType multipleDocumentHandling) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMultipleDocumentHandlingToDefault( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] [] getPageRanges( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPageRanges(int [] [] pageRanges) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getPrinter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPrinter(String printer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SidesType getSides( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSides(SidesType sides) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSidesToDefault( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getToPage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setToPage(int toPage) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}