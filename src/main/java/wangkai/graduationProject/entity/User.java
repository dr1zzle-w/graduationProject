package wangkai.graduationProject.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
    private String uid;
    private String uName;
    private String phone;
    @JsonIgnore
    private String pwd;
    private Boolean is_banned;

    public String getUid() {
        return uid;
    }

    public String getUName() {
        return uName;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPhone() {
        return phone;
    }

    public Boolean getIs_banned() {
        return is_banned;
    }

    public void setIs_banned(Boolean is_banned) {
        this.is_banned = is_banned;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Boolean getBanned() {
        return is_banned;
    }

    public void setBanned(Boolean banned) {
        is_banned = banned;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uName='" + uName + '\'' +
                ", phone='" + phone + '\'' +
                ", pwd='" + pwd + '\'' +
                ", is_banned=" + is_banned +
                '}';
    }
}
