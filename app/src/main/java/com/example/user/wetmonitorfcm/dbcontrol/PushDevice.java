package com.example.user.wetmonitorfcm.dbcontrol;

/**
 * Created by USER on 2017/7/7.
 */

public class PushDevice {
    private String mAddress;
    private String mValue;
    public boolean isEnable = false;
    public boolean isRegist = false;
    public PushDevice(String address ){
        this.mAddress  = address;
    }
    public String getDeviceMac(){
        return this.mAddress;
    }
    void setValue(String value){
        mValue = value;
    }
}
