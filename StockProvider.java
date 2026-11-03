
public interface StockProvider {
    double getMarketPrice(String ticker);
    String getStatus(String ticker);
}