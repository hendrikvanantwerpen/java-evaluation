package java.awt.font;


public interface OpenType {
  public final static int TAG_CMAP
  ;
  public final static int TAG_HEAD
  ;
  public final static int TAG_NAME
  ;
  public final static int TAG_GLYF
  ;
  public final static int TAG_MAXP
  ;
  public final static int TAG_PREP
  ;
  public final static int TAG_HMTX
  ;
  public final static int TAG_KERN
  ;
  public final static int TAG_HDMX
  ;
  public final static int TAG_LOCA
  ;
  public final static int TAG_POST
  ;
  public final static int TAG_OS2
  ;
  public final static int TAG_CVT
  ;
  public final static int TAG_GASP
  ;
  public final static int TAG_VDMX
  ;
  public final static int TAG_VMTX
  ;
  public final static int TAG_VHEA
  ;
  public final static int TAG_HHEA
  ;
  public final static int TAG_TYP1
  ;
  public final static int TAG_BSLN
  ;
  public final static int TAG_GSUB
  ;
  public final static int TAG_DSIG
  ;
  public final static int TAG_FPGM
  ;
  public final static int TAG_FVAR
  ;
  public final static int TAG_GVAR
  ;
  public final static int TAG_CFF
  ;
  public final static int TAG_MMSD
  ;
  public final static int TAG_MMFX
  ;
  public final static int TAG_BASE
  ;
  public final static int TAG_GDEF
  ;
  public final static int TAG_GPOS
  ;
  public final static int TAG_JSTF
  ;
  public final static int TAG_EBDT
  ;
  public final static int TAG_EBLC
  ;
  public final static int TAG_EBSC
  ;
  public final static int TAG_LTSH
  ;
  public final static int TAG_PCLT
  ;
  public final static int TAG_ACNT
  ;
  public final static int TAG_AVAR
  ;
  public final static int TAG_BDAT
  ;
  public final static int TAG_BLOC
  ;
  public final static int TAG_CVAR
  ;
  public final static int TAG_FEAT
  ;
  public final static int TAG_FDSC
  ;
  public final static int TAG_FMTX
  ;
  public final static int TAG_JUST
  ;
  public final static int TAG_LCAR
  ;
  public final static int TAG_MORT
  ;
  public final static int TAG_OPBD
  ;
  public final static int TAG_PROP
  ;
  public final static int TAG_TRAK
  ;
  public int getVersion( ) ;
  public byte [] getFontTable(int sfntTag) ;
  public byte [] getFontTable(String strSfntTag) ;
  public byte [] getFontTable(int sfntTag,int offset, int count) ;
  public byte [] getFontTable(String strSfntTag,int offset, int count) ;
  public int getFontTableSize(int sfntTag) ;
  public int getFontTableSize(String strSfntTag) ;
}