public class CsvFormatter implements ReportFormatter {
    @Override
    public String format(String title, String[] headers, String[][] rows) {
        StringBuilder sb = new StringBuilder();
        sb.append("# TITLE: ").append(title).append("\n");
        sb.append(quoteJoin(headers)).append("\n");
        for (String[] row : rows) {
            sb.append(quoteJoin(row)).append("\n");
        }
        return sb.toString();
    }

    private String quoteJoin(String[] a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append("\"").append(a[i]).append("\"");
            if (i < a.length - 1) s.append(",");
        }
        return s.toString();
    }
}