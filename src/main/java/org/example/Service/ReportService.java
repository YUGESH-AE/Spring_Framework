package org.example.Service;

import org.example.repository.ReportGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class ReportService {
//    @Autowired
//    @Qualifier("pdfReport")
    private ReportGenerator reportGenerator;

//    @Value("100")
    private int records;

    public ReportService(ReportGenerator reportGenerator, int records) {
        this.reportGenerator = reportGenerator;
        this.records = records;
    }

    public ReportService() {

    }

    public ReportGenerator getReportGenerator() {
        return reportGenerator;
    }

    public void setReportGenerator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public void generateReport(){
        System.out.println(reportGenerator.generateReport(records));
    }
}
