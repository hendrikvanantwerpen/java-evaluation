package java.awt;


public final class PageAttributes implements Cloneable {
  public static final class ColorType extends AttributeValue {
    public static final ColorType COLOR;
    public static final ColorType MONOCHROME;
    private ColorType(int type) {
      super(type, NAMES);
    }
  }
  public static final class MediaType extends AttributeValue {
    public static final MediaType ISO_4A0;
    public static final MediaType ISO_2A0;
    public static final MediaType ISO_A0;
    public static final MediaType ISO_A1;
    public static final MediaType ISO_A2;
    public static final MediaType ISO_A3;
    public static final MediaType ISO_A4;
    public static final MediaType ISO_A5;
    public static final MediaType ISO_A6;
    public static final MediaType ISO_A7;
    public static final MediaType ISO_A8;
    public static final MediaType ISO_A9;
    public static final MediaType ISO_A10;
    public static final MediaType ISO_B0;
    public static final MediaType ISO_B1;
    public static final MediaType ISO_B2;
    public static final MediaType ISO_B3;
    public static final MediaType ISO_B4;
    public static final MediaType ISO_B5;
    public static final MediaType ISO_B6;
    public static final MediaType ISO_B7;
    public static final MediaType ISO_B8;
    public static final MediaType ISO_B9;
    public static final MediaType ISO_B10;
    public static final MediaType JIS_B0;
    public static final MediaType JIS_B1;
    public static final MediaType JIS_B2;
    public static final MediaType JIS_B3;
    public static final MediaType JIS_B4;
    public static final MediaType JIS_B5;
    public static final MediaType JIS_B6;
    public static final MediaType JIS_B7;
    public static final MediaType JIS_B8;
    public static final MediaType JIS_B9;
    public static final MediaType JIS_B10;
    public static final MediaType ISO_C0;
    public static final MediaType ISO_C1;
    public static final MediaType ISO_C2;
    public static final MediaType ISO_C3;
    public static final MediaType ISO_C4;
    public static final MediaType ISO_C5;
    public static final MediaType ISO_C6;
    public static final MediaType ISO_C7;
    public static final MediaType ISO_C8;
    public static final MediaType ISO_C9;
    public static final MediaType ISO_C10;
    public static final MediaType ISO_DESIGNATED_LONG;
    public static final MediaType EXECUTIVE;
    public static final MediaType FOLIO;
    public static final MediaType INVOICE;
    public static final MediaType LEDGER;
    public static final MediaType NA_LETTER;
    public static final MediaType NA_LEGAL;
    public static final MediaType QUARTO;
    public static final MediaType A;
    public static final MediaType B;
    public static final MediaType C;
    public static final MediaType D;
    public static final MediaType E;
    public static final MediaType NA_10X15_ENVELOPE;
    public static final MediaType NA_10X14_ENVELOPE;
    public static final MediaType NA_10X13_ENVELOPE;
    public static final MediaType NA_9X12_ENVELOPE;
    public static final MediaType NA_9X11_ENVELOPE;
    public static final MediaType NA_7X9_ENVELOPE;
    public static final MediaType NA_6X9_ENVELOPE;
    public static final MediaType NA_NUMBER_9_ENVELOPE;
    public static final MediaType NA_NUMBER_10_ENVELOPE;
    public static final MediaType NA_NUMBER_11_ENVELOPE;
    public static final MediaType NA_NUMBER_12_ENVELOPE;
    public static final MediaType NA_NUMBER_14_ENVELOPE;
    public static final MediaType INVITE_ENVELOPE;
    public static final MediaType ITALY_ENVELOPE;
    public static final MediaType MONARCH_ENVELOPE;
    public static final MediaType PERSONAL_ENVELOPE;
    public static final MediaType A0;
    public static final MediaType A1;
    public static final MediaType A2;
    public static final MediaType A3;
    public static final MediaType A4;
    public static final MediaType A5;
    public static final MediaType A6;
    public static final MediaType A7;
    public static final MediaType A8;
    public static final MediaType A9;
    public static final MediaType A10;
    public static final MediaType B0;
    public static final MediaType B1;
    public static final MediaType B2;
    public static final MediaType B3;
    public static final MediaType B4;
    public static final MediaType ISO_B4_ENVELOPE;
    public static final MediaType B5;
    public static final MediaType ISO_B5_ENVELOPE;
    public static final MediaType B6;
    public static final MediaType B7;
    public static final MediaType B8;
    public static final MediaType B9;
    public static final MediaType B10;
    public static final MediaType C0;
    public static final MediaType ISO_C0_ENVELOPE;
    public static final MediaType C1;
    public static final MediaType ISO_C1_ENVELOPE;
    public static final MediaType C2;
    public static final MediaType ISO_C2_ENVELOPE;
    public static final MediaType C3;
    public static final MediaType ISO_C3_ENVELOPE;
    public static final MediaType C4;
    public static final MediaType ISO_C4_ENVELOPE;
    public static final MediaType C5;
    public static final MediaType ISO_C5_ENVELOPE;
    public static final MediaType C6;
    public static final MediaType ISO_C6_ENVELOPE;
    public static final MediaType C7;
    public static final MediaType ISO_C7_ENVELOPE;
    public static final MediaType C8;
    public static final MediaType ISO_C8_ENVELOPE;
    public static final MediaType C9;
    public static final MediaType ISO_C9_ENVELOPE;
    public static final MediaType C10;
    public static final MediaType ISO_C10_ENVELOPE;
    public static final MediaType ISO_DESIGNATED_LONG_ENVELOPE;
    public static final MediaType STATEMENT;
    public static final MediaType TABLOID;
    public static final MediaType LETTER;
    public static final MediaType NOTE;
    public static final MediaType LEGAL;
    public static final MediaType ENV_10X15;
    public static final MediaType ENV_10X14;
    public static final MediaType ENV_10X13;
    public static final MediaType ENV_9X12;
    public static final MediaType ENV_9X11;
    public static final MediaType ENV_7X9;
    public static final MediaType ENV_6X9;
    public static final MediaType ENV_9;
    public static final MediaType ENV_10;
    public static final MediaType ENV_11;
    public static final MediaType ENV_12;
    public static final MediaType ENV_14;
    public static final MediaType ENV_INVITE;
    public static final MediaType ENV_ITALY;
    public static final MediaType ENV_MONARCH;
    public static final MediaType ENV_PERSONAL;
    public static final MediaType INVITE;
    public static final MediaType ITALY;
    public static final MediaType MONARCH;
    public static final MediaType PERSONAL;
    private MediaType(int type) {
      super(type, NAMES);
    }
  }
  public static final class OrientationRequestedType extends AttributeValue {
    public static final OrientationRequestedType PORTRAIT;
    public static final OrientationRequestedType LANDSCAPE;
    private OrientationRequestedType(int type) {
      super(type, NAMES);
    }
  }
  public static final class OriginType extends AttributeValue {
    public static final OriginType PHYSICAL;
    public static final OriginType PRINTABLE;
    private OriginType(int type) {
      super(type, NAMES);
    }
  }
  public static final class PrintQualityType extends AttributeValue {
    public static final PrintQualityType HIGH;
    public static final PrintQualityType NORMAL;
    public static final PrintQualityType DRAFT;
    private PrintQualityType(int type) {
      super(type, NAMES);
    }
  }
  public PageAttributes( ) {
  }
  public PageAttributes(PageAttributes obj) {
  }
  public PageAttributes(ColorType color,MediaType media,OrientationRequestedType orientationRequested,OriginType origin,PrintQualityType printQuality, int [] printerResolution) {
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void set(PageAttributes obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ColorType getColor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setColor(ColorType color) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MediaType getMedia( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMedia(MediaType media) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMediaToDefault( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OrientationRequestedType getOrientationRequested( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOrientationRequested(OrientationRequestedType orientationRequested) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOrientationRequested(int orientationRequested) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOrientationRequestedToDefault( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public OriginType getOrigin( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOrigin(OriginType origin) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PrintQualityType getPrintQuality( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPrintQuality(PrintQualityType printQuality) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPrintQuality(int printQuality) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPrintQualityToDefault( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getPrinterResolution( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPrinterResolution(int [] printerResolution) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPrinterResolution(int printerResolution) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPrinterResolutionToDefault( ) {
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