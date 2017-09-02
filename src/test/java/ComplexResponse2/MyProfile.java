
package ComplexResponse2;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyProfile {

    @SerializedName("avatar")
    @Expose
    private Avatar avatar;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("birthday")
    @Expose
    private String birthday;
    @SerializedName("celebrity_hub_id")
    @Expose
    private Object celebrityHubId;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("coins")
    @Expose
    private Integer coins;
    @SerializedName("community_posts_count")
    @Expose
    private Integer communityPostsCount;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("device_is_banned")
    @Expose
    private Boolean deviceIsBanned;
    @SerializedName("dm_pushes_enabled")
    @Expose
    private Boolean dmPushesEnabled;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("favorites")
    @Expose
    private Object favorites;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("follow_me")
    @Expose
    private Integer followMe;
    @SerializedName("following")
    @Expose
    private Boolean following;
    @SerializedName("i_follow")
    @Expose
    private Integer iFollow;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_banned")
    @Expose
    private Boolean isBanned;
    @SerializedName("is_deleted")
    @Expose
    private Boolean isDeleted;
    @SerializedName("is_fahlo_user")
    @Expose
    private Boolean isFahloUser;
    @SerializedName("is_follow")
    @Expose
    private Boolean isFollow;
    @SerializedName("is_followed")
    @Expose
    private Boolean isFollowed;
    @SerializedName("is_verified")
    @Expose
    private Boolean isVerified;
    @SerializedName("labels")
    @Expose
    private String labels;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("notifications_count")
    @Expose
    private Integer notificationsCount;
    @SerializedName("optional_title")
    @Expose
    private String optionalTitle;
    @SerializedName("permissions")
    @Expose
    private List<Object> permissions = null;
    @SerializedName("private_address")
    @Expose
    private String privateAddress;
    @SerializedName("private_address_location")
    @Expose
    private Object privateAddressLocation;
    @SerializedName("public_address")
    @Expose
    private String publicAddress;
    @SerializedName("public_address_location")
    @Expose
    private PublicAddressLocation publicAddressLocation;
    @SerializedName("pushes_enabled")
    @Expose
    private Boolean pushesEnabled;
    @SerializedName("registration_email_confirmed")
    @Expose
    private Boolean registrationEmailConfirmed;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("show_private_content")
    @Expose
    private Boolean showPrivateContent;
    @SerializedName("social")
    @Expose
    private Object social;
    @SerializedName("stage_title")
    @Expose
    private String stageTitle;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("unread_messages_count")
    @Expose
    private Integer unreadMessagesCount;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("zip")
    @Expose
    private String zip;

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Object getCelebrityHubId() {
        return celebrityHubId;
    }

    public void setCelebrityHubId(Object celebrityHubId) {
        this.celebrityHubId = celebrityHubId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    public Integer getCommunityPostsCount() {
        return communityPostsCount;
    }

    public void setCommunityPostsCount(Integer communityPostsCount) {
        this.communityPostsCount = communityPostsCount;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getDeviceIsBanned() {
        return deviceIsBanned;
    }

    public void setDeviceIsBanned(Boolean deviceIsBanned) {
        this.deviceIsBanned = deviceIsBanned;
    }

    public Boolean getDmPushesEnabled() {
        return dmPushesEnabled;
    }

    public void setDmPushesEnabled(Boolean dmPushesEnabled) {
        this.dmPushesEnabled = dmPushesEnabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getFavorites() {
        return favorites;
    }

    public void setFavorites(Object favorites) {
        this.favorites = favorites;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getFollowMe() {
        return followMe;
    }

    public void setFollowMe(Integer followMe) {
        this.followMe = followMe;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public Integer getIFollow() {
        return iFollow;
    }

    public void setIFollow(Integer iFollow) {
        this.iFollow = iFollow;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsBanned() {
        return isBanned;
    }

    public void setIsBanned(Boolean isBanned) {
        this.isBanned = isBanned;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsFahloUser() {
        return isFahloUser;
    }

    public void setIsFahloUser(Boolean isFahloUser) {
        this.isFahloUser = isFahloUser;
    }

    public Boolean getIsFollow() {
        return isFollow;
    }

    public void setIsFollow(Boolean isFollow) {
        this.isFollow = isFollow;
    }

    public Boolean getIsFollowed() {
        return isFollowed;
    }

    public void setIsFollowed(Boolean isFollowed) {
        this.isFollowed = isFollowed;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNotificationsCount() {
        return notificationsCount;
    }

    public void setNotificationsCount(Integer notificationsCount) {
        this.notificationsCount = notificationsCount;
    }

    public String getOptionalTitle() {
        return optionalTitle;
    }

    public void setOptionalTitle(String optionalTitle) {
        this.optionalTitle = optionalTitle;
    }

    public List<Object> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Object> permissions) {
        this.permissions = permissions;
    }

    public String getPrivateAddress() {
        return privateAddress;
    }

    public void setPrivateAddress(String privateAddress) {
        this.privateAddress = privateAddress;
    }

    public Object getPrivateAddressLocation() {
        return privateAddressLocation;
    }

    public void setPrivateAddressLocation(Object privateAddressLocation) {
        this.privateAddressLocation = privateAddressLocation;
    }

    public String getPublicAddress() {
        return publicAddress;
    }

    public void setPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
    }

    public PublicAddressLocation getPublicAddressLocation() {
        return publicAddressLocation;
    }

    public void setPublicAddressLocation(PublicAddressLocation publicAddressLocation) {
        this.publicAddressLocation = publicAddressLocation;
    }

    public Boolean getPushesEnabled() {
        return pushesEnabled;
    }

    public void setPushesEnabled(Boolean pushesEnabled) {
        this.pushesEnabled = pushesEnabled;
    }

    public Boolean getRegistrationEmailConfirmed() {
        return registrationEmailConfirmed;
    }

    public void setRegistrationEmailConfirmed(Boolean registrationEmailConfirmed) {
        this.registrationEmailConfirmed = registrationEmailConfirmed;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getShowPrivateContent() {
        return showPrivateContent;
    }

    public void setShowPrivateContent(Boolean showPrivateContent) {
        this.showPrivateContent = showPrivateContent;
    }

    public Object getSocial() {
        return social;
    }

    public void setSocial(Object social) {
        this.social = social;
    }

    public String getStageTitle() {
        return stageTitle;
    }

    public void setStageTitle(String stageTitle) {
        this.stageTitle = stageTitle;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getUnreadMessagesCount() {
        return unreadMessagesCount;
    }

    public void setUnreadMessagesCount(Integer unreadMessagesCount) {
        this.unreadMessagesCount = unreadMessagesCount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
