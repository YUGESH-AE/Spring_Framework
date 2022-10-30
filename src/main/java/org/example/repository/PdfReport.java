package org.example.repository;


import org.springframework.stereotype.Component;

//@Component
public class PdfReport implements ReportGenerator {
    @Override
    public String generateReport(int records) {
        return "PDF Report generated with "+records +" no of pages";
    }
}
