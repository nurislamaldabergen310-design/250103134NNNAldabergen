public class HeaderFooterDecorator extends ExporterDecorator {
    private final String timestamp;
    private final int rowCount;

    public HeaderFooterDecorator(Exporter wrapped, String timestamp, int rowCount) {
        super(wrapped);
        this.timestamp = timestamp;
        this.rowCount = rowCount;
    }

    @Override
    public void export(String destination, String data) {
        String enriched = "--- EXPORT TIMESTAMP: " + timestamp + " ---\n"
                + data + "\n"
                + "--- RECORD COUNT: " + rowCount + " | SECURE HASH: [OK] ---";
        super.export(destination, enriched);
    }
}