package com.example.lepetitprince;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnMorning, btnDay, btnEvening, btnNight;
    private ImageView imgMorning, imgDay, imgEvening, imgNight;
    private ConstraintLayout layoutMorning;

    public static final int notificationMorning = 1;
    public static final int notificationDay = 2;
    public static final int notificationEvening = 3;
    public static final int notificationNight = 4;

    private static final String CHANNEL_ID = "Prince channel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMorning = (Button) findViewById(R.id.btnMorning);
        btnDay = (Button) findViewById(R.id.btnDay);
        btnEvening = (Button) findViewById(R.id.btnEvening);
        btnNight = (Button) findViewById(R.id.btnNight);
        imgMorning = (ImageView) findViewById(R.id.imgMorning);
        imgDay = (ImageView) findViewById(R.id.imgDay);
        imgEvening = (ImageView) findViewById(R.id.imgEvening);
        imgNight = (ImageView) findViewById(R.id.imgNight);
        layoutMorning = findViewById(R.id.layoutMorning);
    }

    public void btnMorningClick(View view) {
        layoutMorning.setVisibility(View.VISIBLE);
        imgDay.setVisibility(View.INVISIBLE);
        imgEvening.setVisibility(View.INVISIBLE);
        imgNight.setVisibility(View.INVISIBLE);

        NotificationCompat.Builder mBuilder = (NotificationCompat.Builder)
                new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
                        .setSmallIcon(R.drawable.clean)
                        .setContentTitle("????????")
                        .setAutoCancel(true)
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                        .setContentText("???????????????? ?? ?????????????? ???????? ??????????????");
        Intent resultIntent = new Intent(this, MainActivity.class);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);

        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        createChannelIfNeeded(mNotificationManager);
        mNotificationManager.notify(notificationMorning, mBuilder.build());
    }

    public void btnDayClick(View view) {
        layoutMorning.setVisibility(View.INVISIBLE);
        imgDay.setVisibility(View.VISIBLE);
        imgEvening.setVisibility(View.INVISIBLE);
        imgNight.setVisibility(View.INVISIBLE);

        NotificationCompat.Builder mBuilder = (NotificationCompat.Builder)
                new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
                        .setSmallIcon(R.drawable.rose)
                        .setContentTitle("????????")
                        .setAutoCancel(true)
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                        .setContentText("???????????? ????????");
        Intent resultIntent = new Intent(this, MainActivity.class);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);

        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        createChannelIfNeeded(mNotificationManager);
        mNotificationManager.notify(notificationDay, mBuilder.build());
    }

    public void btnEveningClick(View view) {
        layoutMorning.setVisibility(View.INVISIBLE);
        imgDay.setVisibility(View.INVISIBLE);
        imgEvening.setVisibility(View.VISIBLE);
        imgNight.setVisibility(View.INVISIBLE);

        NotificationCompat.Builder mBuilder = (NotificationCompat.Builder)
                new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
                        .setSmallIcon(R.drawable.home)
                        .setContentTitle("??????????")
                        .setAutoCancel(true)
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                        .setContentText("?????????????? ???????? ????????????");
        Intent resultIntent = new Intent(this, MainActivity.class);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);

        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        createChannelIfNeeded(mNotificationManager);
        mNotificationManager.notify(notificationEvening, mBuilder.build());
    }

    public void btnNightClick(View view) {
        layoutMorning.setVisibility(View.INVISIBLE);
        imgDay.setVisibility(View.INVISIBLE);
        imgEvening.setVisibility(View.INVISIBLE);
        imgNight.setVisibility(View.VISIBLE);

        NotificationCompat.Builder mBuilder = (NotificationCompat.Builder)
                new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
                        .setSmallIcon(R.drawable.notinight)
                        .setContentTitle("????????")
                        .setAutoCancel(true)
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setDefaults(NotificationCompat.DEFAULT_ALL)
                        .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                        .setContentText("???????????????????????? ????????????????");
        Intent resultIntent = new Intent(this, MainActivity.class);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);

        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        createChannelIfNeeded(mNotificationManager);
        mNotificationManager.notify(notificationNight, mBuilder.build());
    }

    public static void createChannelIfNeeded(NotificationManager manager) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, CHANNEL_ID, NotificationManager.IMPORTANCE_DEFAULT);
            manager.createNotificationChannel(notificationChannel);
        }
    }

    public void planetClick(View view) {
        Toast myToast1 = Toast.makeText(getApplicationContext(),
                "???????????????? ??-612. ??????????????, ???? ?????????????? ?????????? ?????????????????? ??????????.", Toast.LENGTH_LONG);
        myToast1.show();
    }

    public void breakfastClick(View view) {
        Toast myToast1 = Toast.makeText(getApplicationContext(),
                "?????????????????????? ????????????. ???? ?????? ???????????? ?????????????????????? ??????????????.", Toast.LENGTH_LONG);
        myToast1.show();
    }

    public void roseClick(View view) {
        Toast myToast1 = Toast.makeText(getApplicationContext(),
                "????????. ???? ?????????? ????????????????, ?? ???? ???????? ???????????????? ???????????? ?? ????????????????.", Toast.LENGTH_LONG);
        myToast1.show();
    }

    public void afkVolcanoClick(View view) {
        Toast myToast1 = Toast.makeText(getApplicationContext(), "???????????????? ????????????. ?? ?????? ???????? ?????????? ????????????????????.",
                Toast.LENGTH_LONG);
        myToast1.show();
    }

    public void btnPrinceClick(View view) {
        Toast myToast1 = Toast.makeText(getApplicationContext(), "?????????????????? ??????????", Toast.LENGTH_LONG);
        myToast1.show();
    }
}