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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public void setMarketingOptIn(boolean marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
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