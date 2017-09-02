
package ComplexResponse2;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Avatar {

    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("content_type")
    @Expose
    private String contentType;
    @SerializedName("created")
    @Expose
    private Integer created;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("hub_id")
    @Expose
    private String hubId;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_deleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("is_public")
    @Expose
    private Boolean isPublic;
    @SerializedName("mime_type")
    @Expose
    private String mimeType;
    @SerializedName("modified")
    @Expose
    private Integer modified;
    @SerializedName("public_timestamp")
    @Expose
    private Integer publicTimestamp;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("sources")
    @Expose
    private List<Source> sources = null;
    @SerializedName("tags")
    @Expose
    private List<Object> tags = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getHubId() {
        return hubId;
    }

    public void setHubId(String hubId) {
        this.hubId = hubId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getModified() {
        return modified;
    }

    public void setModified(Integer modified) {
        this.modified = modified;
    }

    public Integer getPublicTimestamp() {
        return publicTimestamp;
    }

    public void setPublicTimestamp(Integer publicTimestamp) {
        this.publicTimestamp = publicTimestamp;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
