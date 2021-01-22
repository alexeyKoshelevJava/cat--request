public class Status {
    private boolean verified;
    private int sentCount;

    public Status(boolean verified, int sentCount) {
        this.verified = verified;
        this.sentCount = sentCount;

    }

    public Status() {
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getSentCount() {
        return sentCount;
    }

    public void setSentCount(int sentCount) {
        this.sentCount = sentCount;
    }

    @Override
    public String toString() {
        return "Status{" +
                "verified=" + verified +
                ", sentCount=" + sentCount +
                '}';
    }
}
