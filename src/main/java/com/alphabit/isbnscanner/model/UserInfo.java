package com.alphabit.isbnscanner.model;

import javax.persistence.*;

@Entity
@Table(name="USER_INFO")
public class UserInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="UI_PKEY")
    private int uiPKey;

    @Column(name="DEPT")
    private String dept;

    @Column(name="USER_ID")
    private String userId;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="ACCESS_COUNTER")
    private String accessCounter;

    @Column(name="RANK")
    private String rank;

    @Column(name="DESGINATION")
    private String designation;

    @Column(name="TELNO")
    private String telNo;

    @Column(name="HPNO")
    private String hpNo;

    @Column(name="FAX")
    private String fax;

    @Column(name="EMAIL")
    private String email;

    @Column(name="REMARKS")
    private String remarks;

    @Column(name="USER_LEVEL")
    private String userLevel;

    @Column(name="USER_STATUS")
    private String userStatus;

    @Column(name="EFFECTIVE_DATE")
    private String effectiveDate;

    @Column(name="ENROLLED_BY")
    private String enrolledBy;

    @Column(name="ENROLLED_ON")
    private String enrolledOn;

    @Column(name="UPDATED_BY")
    private String updatedBy;

    @Column(name="UPDATED_ON")
    private String updatedOn;

    @Column(name="AUTHORISE_BY")
    private String authoriseBy;

    @Column(name="AUTHORISE_ON")
    private String authoriseOn;

    @Column(name="ISAPIUSER")
    private String isApiUser;

    @Column(name="IMAGEPATH")
    private String imagePath;

    @Column(name="LAST_NOTFICATION_CHK")
    private String lastNotificationCheck;

    @Column(name="USER_LEVEL_ACCOUNTING")
    private String userLevelAccounting;

    @Column(name="USER_LEVEL_PAYROLL")
    private String userLevelPayroll;

    @Column(name="WEB_ACCESS")
    private Short webAccess;

    @Column(name="MANAGER_APP_ACCESS")
    private Short managerAppAccess;

    @Column(name="RIDER_APP_ACCESS")
    private Short riderAppAccess;

    @Column(name="ISACCESS_STOREAPP")
    private Short isAccessStoreApp;

    @Column(name="ISACCESSOWNERAPP")
    private Short isAccessOwnerApp;

    @Column(name="APP_NOTIFICATION_KEY")
    private String appNotificationKey;

    // ----- Getters -----
    public int getUiPKey() { return uiPKey; }
    public String getDept() { return dept; }
    public String getUserId() { return userId; }
    public String getPassword() { return password; }
    public String getUserName() { return userName; }
    public String getAccessCounter() { return accessCounter; }
    public String getRank() { return rank; }
    public String getDesignation() { return designation; }
    public String getTelNo() { return telNo; }
    public String getHpNo() { return hpNo; }
    public String getFax() { return fax; }
    public String getEmail() { return email; }
    public String getRemarks() { return remarks; }
    public String getUserLevel() { return userLevel; }
    public String getUserStatus() { return userStatus; }
    public String getEffectiveDate() { return effectiveDate; }
    public String getEnrolledBy() { return enrolledBy; }
    public String getEnrolledOn() { return enrolledOn; }
    public String getUpdatedBy() { return updatedBy; }
    public String getUpdatedOn() { return updatedOn; }
    public String getAuthoriseBy() { return authoriseBy; }
    public String getAuthoriseOn() { return authoriseOn; }
    public String getIsApiUser() { return isApiUser; }
    public String getImagePath() { return imagePath; }
    public String getLastNotificationCheck() { return lastNotificationCheck; }
    public String getUserLevelAccounting() { return userLevelAccounting; }
    public String getUserLevelPayroll() { return userLevelPayroll; }
    public Short getWebAccess() { return webAccess; }
    public Short getManagerAppAccess() { return managerAppAccess; }
    public Short getRiderAppAccess() { return riderAppAccess; }
    public Short getIsAccessStoreApp() { return isAccessStoreApp; }
    public Short getIsAccessOwnerApp() { return isAccessOwnerApp; }
    public String getAppNotificationKey() { return appNotificationKey; }

    // ----- Setters -----
    public void setUiPKey(int uiPKey) { this.uiPKey = uiPKey; }
    public void setDept(String dept) { this.dept = dept; }
    public void setUserId(String userId) { this.userId = userId; }
    public void setPassword(String password) { this.password = password; }
    public void setUserName(String userName) { this.userName = userName; }
    public void setAccessCounter(String accessCounter) { this.accessCounter = accessCounter; }
    public void setRank(String rank) { this.rank = rank; }
    public void setDesignation(String designation) { this.designation = designation; }
    public void setTelNo(String telNo) { this.telNo = telNo; }
    public void setHpNo(String hpNo) { this.hpNo = hpNo; }
    public void setFax(String fax) { this.fax = fax; }
    public void setEmail(String email) { this.email = email; }
    public void setRemarks(String remarks) { this.remarks = remarks; }
    public void setUserLevel(String userLevel) { this.userLevel = userLevel; }
    public void setUserStatus(String userStatus) { this.userStatus = userStatus; }
    public void setEffectiveDate(String effectiveDate) { this.effectiveDate = effectiveDate; }
    public void setEnrolledBy(String enrolledBy) { this.enrolledBy = enrolledBy; }
    public void setEnrolledOn(String enrolledOn) { this.enrolledOn = enrolledOn; }
    public void setUpdatedBy(String updatedBy) { this.updatedBy = updatedBy; }
    public void setUpdatedOn(String updatedOn) { this.updatedOn = updatedOn; }
    public void setAuthoriseBy(String authoriseBy) { this.authoriseBy = authoriseBy; }
    public void setAuthoriseOn(String authoriseOn) { this.authoriseOn = authoriseOn; }
    public void setIsApiUser(String isApiUser) { this.isApiUser = isApiUser; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }
    public void setLastNotificationCheck(String lastNotificationCheck) { this.lastNotificationCheck = lastNotificationCheck; }
    public void setUserLevelAccounting(String userLevelAccounting) { this.userLevelAccounting = userLevelAccounting; }
    public void setUserLevelPayroll(String userLevelPayroll) { this.userLevelPayroll = userLevelPayroll; }
    public void setWebAccess(Short webAccess) { this.webAccess = webAccess; }
    public void setManagerAppAccess(Short managerAppAccess) { this.managerAppAccess = managerAppAccess; }
    public void setRiderAppAccess(Short riderAppAccess) { this.riderAppAccess = riderAppAccess; }
    public void setIsAccessStoreApp(Short isAccessStoreApp) { this.isAccessStoreApp = isAccessStoreApp; }
    public void setIsAccessOwnerApp(Short isAccessOwnerApp) { this.isAccessOwnerApp = isAccessOwnerApp; }
    public void setAppNotificationKey(String appNotificationKey) { this.appNotificationKey = appNotificationKey; }
}
