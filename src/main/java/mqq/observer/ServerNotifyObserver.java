package mqq.observer;

public class ServerNotifyObserver {
    private String key;
    private int seq;

    public void onReceiveVerifyCode(String key, int seq, String note, byte[] image) {
    }

    public void onVerifyClose() {
    }

    public int getSeq() {
        return this.seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
