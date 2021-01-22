import com.fasterxml.jackson.annotation.JsonProperty;

public class FactsAboutCat {
    private final Status status;
    private final String type;
    private final boolean deleted;
    private final String userId;
    private final String user;
    private final String text;
    private final int v;
    private final String source;
    private final String updatedAt;
    private final String createdAt;
    private final boolean used;


    public FactsAboutCat(
            @JsonProperty("status") Status status,
            @JsonProperty("type") String type,
            @JsonProperty("deleted") boolean deleted,
            @JsonProperty("_id") String userId,
            @JsonProperty("user") String user,
            @JsonProperty("text") String text,
            @JsonProperty("__v") int v,
            @JsonProperty("source") String source,
            @JsonProperty("updatedAt") String updatedAt,
            @JsonProperty("createdAt") String createdAt,
            @JsonProperty("used") boolean used) {

        this.status = status;
        this.type = type;
        this.deleted = deleted;
        this.userId = userId;
        this.user = user;
        this.text = text;
        this.v = v;
        this.source = source;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.used = used;

    }

    public Status getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public String get_id() {
        return userId;
    }

    public String getUser() {
        return user;
    }

    public String getText() {
        return text;
    }

    public int get__v() {
        return v;
    }

    public String getSource() {
        return source;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public boolean isUsed() {
        return used;
    }

    @Override
    public String toString() {
        return "FactsAboutCat{" +
                "status=" + status +
                ", type='" + type + '\'' +
                ", deleted=" + deleted +
                ", _id='" + userId + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", __v=" + v +
                ", source='" + source + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", used=" + used +
                '}';
    }
}
