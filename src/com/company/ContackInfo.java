package com.company;

public class ContackInfo {
    private String name;
    private String email;
    private String mobilePhone;

    public ContackInfo(String name, String email, String mobilePhone) {
        this.name = name;
        this.email = email;
        this.mobilePhone = mobilePhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
