package com.example.user.wetmonitorfcm.wetMonitor;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import static android.content.ContentValues.TAG;

/**
 * Created by USER on 2017/7/18.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService{
    static String Message;
    private Notification n;
    private NotificationManager nm;
    public static final String BROADCAST_ACTION =
            "net.macdidi.broadcast01.action.MYBROADCAST01";

    // 建立準備發送廣播事件的Intent物件
    public static Intent intent = new Intent(BROADCAST_ACTION);
    // 如果需要的話，也可以設定資料到Intent物件
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.e(TAG, "From: " + remoteMessage.getFrom());
        Log.e(TAG, "Title: " + remoteMessage.getNotification().getTitle());
        Log.e(TAG, "Notification Message Body: " + remoteMessage.getNotification().getBody());
        Message=remoteMessage.getNotification().getBody();
        intent.putExtra("message", Message);


        // 發送廣播事件
        sendBroadcast(intent);
        /*  String service = NOTIFICATION_SERVICE;
        nm = (NotificationManager)getSystemService(service);*/
    }
}
