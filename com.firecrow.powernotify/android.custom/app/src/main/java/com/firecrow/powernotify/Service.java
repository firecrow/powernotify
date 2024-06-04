package com.firecrow.powernotify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import android.app.Notification;
import android.app.Person;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Parcel;

/*
const val EXTRA_NOTIFICATION_INTENT = "net.firesilver.sandbox.EXTRA_NOTIFICATION"

const val BUNDLE_TYPE_STRING = 1
const val BUNDLE_TYPE_TEXTLINES = 2
const val BUNDLE_TYPE_IMAGE = 3
const val BUNDLE_TYPE_PEOPLE_LIST = 4
const val BUNDLE_TYPE_PERSON = 5
const val BUNDLE_TYPE_INT = 6
const val BUNDLE_TYPE_BOOL = 7
const val BUNDLE_TYPE_MESSAGES = 8

val fieldWhitelist = mutableMapOf(
        "android.title" to BUNDLE_TYPE_STRING,
        "android.hiddenConversationTitle" to BUNDLE_TYPE_STRING,
        "android.subText" to BUNDLE_TYPE_STRING,
        "android.text" to BUNDLE_TYPE_STRING,
        "android.showWhen" to BUNDLE_TYPE_BOOL,
        "android.textLines" to BUNDLE_TYPE_TEXTLINES,
        "android.people.list" to BUNDLE_TYPE_STRING,
        "android.messages" to BUNDLE_TYPE_MESSAGES,
        "android.infoText" to BUNDLE_TYPE_STRING,
        "android.largeIcon" to BUNDLE_TYPE_IMAGE,
        "android.summaryText" to BUNDLE_TYPE_STRING,
        "android.people.list" to BUNDLE_TYPE_PEOPLE_LIST,
        "android.messagingUser" to BUNDLE_TYPE_PERSON,
        Notification.EXTRA_INFO_TEXT to BUNDLE_TYPE_STRING,
        Notification.EXTRA_TITLE to BUNDLE_TYPE_STRING,
        Notification.EXTRA_TEXT to BUNDLE_TYPE_STRING,
    )
 */

public class Service extends NotificationListenerService {

    //private lateinit var receiver: com.firecrow.powernotify.Receiver;
    public void onCreate() {
        /*
        super.onCreate();
        Log.i("fcrow", "service thread starting")

        receiver = com.firecrow.powernotify.Receiver();
        val filter = IntentFilter();
        filter.addAction(EXTRA_NOTIFICATION_INTENT)
        this.registerReceiver(receiver, filter);
         */
    }

    public void onDestroy() {
        /*
        super.onDestroy();
        this.unregisterReceiver(receiver);
         */
    }

    public void onNotificationPosted(StatusBarNotification sbn) {
        /*
        Log.i("fcrow","posted "+sbn.packageName+": "+sbn.notification.tickerText);

        val intent = Intent(EXTRA_NOTIFICATION_INTENT)
        intent.putExtra("package_name", sbn.packageName)
        intent.putExtra("type", "received");
        val extras = sbn.notification.extras
        val bundle = Bundle();
        for(k in extras.keySet()) {
            val fieldType = fieldWhitelist[k]
            if (fieldType == BUNDLE_TYPE_STRING) {
                bundle.putString(k, extras.getString(k))
            } else if (fieldType == BUNDLE_TYPE_TEXTLINES) {
                var sequence: Array<CharSequence>? = extras.getCharSequenceArray(k)
                sequence?.let {
                    bundle.putCharSequenceArray(k, sequence)
                }
            } else if (fieldType == BUNDLE_TYPE_IMAGE) {
                bundle.putParcelable(k, extras.getParcelable(k))
            } else if (fieldType == BUNDLE_TYPE_INT) {
                bundle.putInt(k, extras.getInt(k))
            } else if (fieldType == BUNDLE_TYPE_BOOL) {
                bundle.putBoolean(k, extras.getBoolean(k))
            } else if (fieldType == BUNDLE_TYPE_PEOPLE_LIST) {
                bundle.putParcelableArrayList(k, extras.getParcelableArrayList(k))
            } else if (fieldType == BUNDLE_TYPE_PERSON) {
                bundle.putParcelable(k, extras.getParcelable(k))
            }
        }
        intent.putExtra("notification", bundle);

        sendBroadcast(intent);
         */
    }

    public void onNotificationRemoved(StatusBarNotification sbn) {
        /*
        val intent = Intent(EXTRA_NOTIFICATION_INTENT)
        intent.putExtra("package_name", sbn.packageName)
        intent.putExtra("type", "removed");

        sendBroadcast(intent);
        */
    }
}
