package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
    
    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/reports/TestReport.html";
            
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            spark.config().setDocumentTitle("Automation Report");
            spark.config().setReportName("Test Execution Report");
            spark.config().setTheme(Theme.DARK);

            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo("Tester", "Rohit");
            extent.setSystemInfo("Environment", "QA");
        }

        return extent;
    }
}
