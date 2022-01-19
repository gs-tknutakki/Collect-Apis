package TejaUtilities;

public class ConfigFileread {
    public String getReportConfigPath() {
        String reportConfigPath = "C:/ToolsQA/CucumberFramework/configs/extent-config.xml";
        if (reportConfigPath != null) return reportConfigPath;
        else
            throw new RuntimeException("Report Config Path not specified in the allure.properties file for the Key:reportConfigPath");
    }
}
