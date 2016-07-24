package com.application.techio.recyclerviewcardviewdemo;

/**
 * Created by demon on 7/24/2016.
 */
public class MainModel {

    String VersionName;
    String VersionCode;

    public MainModel(String versionName, String versionCode) {
        VersionName = versionName;
        VersionCode = versionCode;
    }

    public String getVersionName() {
        return VersionName;
    }

    public void setVersionName(String versionName) {
        VersionName = versionName;
    }

    public String getVersionCode() {
        return VersionCode;
    }

    public void setVersionCode(String versionCode) {
        VersionCode = versionCode;
    }
}
