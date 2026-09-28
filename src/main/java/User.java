public class User {

    // required
    String username;
    String email;

    // optional
    String phone;
    String address;
    int age;
    boolean newsletter;
    String avatarUrl;
    String timezone;
    String referralCode;
    boolean marketingOptIn;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public User setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
        return this;
    }

    public User setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public User setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public User setReferralCode(String referralCode) {
        this.referralCode = referralCode;
        return this;
    }

    public User setMarketingOptIn(boolean marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
        return this;
    }

    @Override
    public String toString() {
        return "User{username=" + username + ", email=" + email
                + ", phone=" + phone + ", address=" + address
                + ", age=" + age + ", newsletter=" + newsletter
                + ", avatarUrl=" + avatarUrl + ", timezone=" + timezone
                + ", referralCode=" + referralCode + ", marketingOptIn=" + marketingOptIn + "}";
    }
}