package com.example.user.wetmonitorfcm.wetMonitor;

/**
 * Created by USER on 2017/7/7.
 */

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class BackGroundService extends Service{


    public static boolean service_is_alive = false;
    public static String regist_tag = "";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // TODO Auto-generated method stub
        service_is_alive = true;
        Log.e("service_RUNNN", "RUN");
        startForeground(6, new Notification.Builder(this).build());
        stopService(new Intent(this, com.example.user.wetmonitorfcm.wetMonitor.FakeService.class));

        //Log.e("service_REGIST_TAGGGGGG", regist_tag);
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        service_is_alive = false;
        stopForeground(true);
        Log.e("BackGround_Destory", "Destory'");
        super.onDestroy();
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }

}
