package com.abhishek.onlineofflinequizapp;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class Model {

    @Expose
    @SerializedName("updateTimestamp")
    public String updateTimestamp;
    @Expose
    @SerializedName("createTimestamp")
    public String createTimestamp;
    @Expose
    @SerializedName("membership")
    public String membership;
    @Expose
    @SerializedName("company")
    public String company;
    @Expose
    @SerializedName("otpCountPerUser")
    public OtpCountPerUser otpCountPerUser;
    @Expose
    @SerializedName("address")
    public List<String> address;
    @Expose
    @SerializedName("role")
    public String role;
    @Expose
    @SerializedName("meltingSealing")
    public List<String> meltingSealing;
    @Expose
    @SerializedName("wishList")
    public List<String> wishList;
    @Expose
    @SerializedName("mobileNumber")
    public String mobileNumber;
    @Expose
    @SerializedName("password")
    public String password;
    @Expose
    @SerializedName("email")
    public String email;
    @Expose
    @SerializedName("isRequestRecieved")
    public boolean isRequestRecieved;
    @Expose
    @SerializedName("isRequestSent")
    public boolean isRequestSent;
    @Expose
    @SerializedName("isInvited")
    public boolean isInvited;
    @Expose
    @SerializedName("firmName")
    public String firmName;
    @Expose
    @SerializedName("lastName")
    public String lastName;
    @Expose
    @SerializedName("verifyRequest")
    public boolean verifyRequest;
    @Expose
    @SerializedName("verified")
    public boolean verified;
    @Expose
    @SerializedName("firstName")
    public String firstName;
    @Expose
    @SerializedName("parentId")
    public int parentId;
    @Expose
    @SerializedName("id")
    public int id;

    public static class OtpCountPerUser {
        @Expose
        @SerializedName("otpCount")
        public int otpCount;
        @Expose
        @SerializedName("id")
        public int id;
    }

    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public String getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public OtpCountPerUser getOtpCountPerUser() {
        return otpCountPerUser;
    }

    public void setOtpCountPerUser(OtpCountPerUser otpCountPerUser) {
        this.otpCountPerUser = otpCountPerUser;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getMeltingSealing() {
        return meltingSealing;
    }

    public void setMeltingSealing(List<String> meltingSealing) {
        this.meltingSealing = meltingSealing;
    }

    public List<String> getWishList() {
        return wishList;
    }

    public void setWishList(List<String> wishList) {
        this.wishList = wishList;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRequestRecieved() {
        return isRequestRecieved;
    }

    public void setRequestRecieved(boolean requestRecieved) {
        isRequestRecieved = requestRecieved;
    }

    public boolean isRequestSent() {
        return isRequestSent;
    }

    public void setRequestSent(boolean requestSent) {
        isRequestSent = requestSent;
    }

    public boolean isInvited() {
        return isInvited;
    }

    public void setInvited(boolean invited) {
        isInvited = invited;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isVerifyRequest() {
        return verifyRequest;
    }

    public void setVerifyRequest(boolean verifyRequest) {
        this.verifyRequest = verifyRequest;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
