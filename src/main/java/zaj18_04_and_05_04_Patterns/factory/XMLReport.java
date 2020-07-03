package zaj18_04_and_05_04_Patterns.factory;

public class XMLReport implements Report {
    private String reportData;

    public XMLReport(String data) {
        this.reportData = data;
    }

    @Override
    public void print() {
        System.out.println("<xml>\n" +
                "    <report version='1'>\n" +
                "        <body>" +
                reportData +
                "</body>\n" +
                "    </report>\n" +
                "</xml>");
    }
}
