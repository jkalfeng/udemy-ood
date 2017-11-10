package com.udemy.ood.employees_manager.reporting;

public abstract class ReportFormatter {

   private Format format;

   protected ReportFormatter(Format format) {
      this.format = format;
   }

   protected String getFormattedValue(Object object) {
      return format == Format.CSV ? convertToCsv(object) : convertToXml(object);
   }

   private String convertToXml(Object object) {
      return "XML: " + object.toString();
   }

   private String convertToCsv(Object object) {
      return "CSV: " + object.toString();
   }

}
