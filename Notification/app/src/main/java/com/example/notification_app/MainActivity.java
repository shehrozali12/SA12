package com.example.notification_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private NotificationManagerCompat notificationManagerCompat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationManagerCompat = NotificationManagerCompat.from(this);
    }
    public void ShowNotfication(View view) {
        Notification notification =new NotificationCompat.Builder(this,"adfasdf")
                .setSmallIcon(R.drawable.ic_baseline_account_balance_24)
                .setContentTitle("Title")
                .setContentText("It is the text of the notificaton")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();
        notificationManagerCompat.notify(1,notification);
    }
}