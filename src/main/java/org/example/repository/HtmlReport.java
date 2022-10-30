package org.example.repository;

import org.springframework.stereotype.Component;

//@Component
public class HtmlReport implements ReportGenerator {
    @Override
    public String generateReport(int records) {
        return "HTML Report generated with "+records +" no of pages";
    }
}
