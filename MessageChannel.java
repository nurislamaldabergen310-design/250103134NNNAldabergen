public interface MessageChannel {
    void transmit(String recipient, String message);
}