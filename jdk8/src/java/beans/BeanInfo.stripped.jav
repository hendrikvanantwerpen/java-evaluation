package java.beans;

import java.awt.Image;

public interface BeanInfo {
  BeanDescriptor getBeanDescriptor( ) ;
  EventSetDescriptor [] getEventSetDescriptors( ) ;
  int getDefaultEventIndex( ) ;
  PropertyDescriptor [] getPropertyDescriptors( ) ;
  int getDefaultPropertyIndex( ) ;
  MethodDescriptor [] getMethodDescriptors( ) ;
  BeanInfo [] getAdditionalBeanInfo( ) ;
  Image getIcon(int iconKind) ;
  final static int ICON_COLOR_16x16
  ;
  final static int ICON_COLOR_32x32
  ;
  final static int ICON_MONO_16x16
  ;
  final static int ICON_MONO_32x32
  ;
}