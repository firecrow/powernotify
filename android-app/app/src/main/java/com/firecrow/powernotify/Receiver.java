package com.firecrow.powernotify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Receiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        /*
        val packageName = intent.getStringExtra("package_name")
        val bundle:Bundle? = intent.extras?.getParcelable("notification")
        Log.i("fcrow", "recieved "+packageName)
        bundle?.let {
            for(k in bundle.keySet()) {
                val bundleType = fieldWhitelist[k]
                if(bundleType == BUNDLE_TYPE_STRING) {
                    Log.i(
                            "fcrow",
                            "received notification -> " + k + ": " + bundle.getString(k).toString()
                    )
                } else if(bundleType == BUNDLE_TYPE_INT) {
                    Log.i(
                            "fcrow",
                            "received notification -> " + k + ": " + bundle.getInt(k).toString()
                    )
                } else if(bundleType == BUNDLE_TYPE_BOOL) {
                    Log.i(
                            "fcrow",
                            "received notification -> " + k + ": " + bundle.getBoolean(k).toString()
                    )
                } else if(bundleType == BUNDLE_TYPE_TEXTLINES) {
                    var lines = bundle.getCharSequenceArray(k)
                    lines?.let {
                        for (l in lines) {
                            Log.i(
                                    "fcrow",
                                    "received notification -> " + k + ": " + l?.toString()
                            )
                        }
                    }
                } else if(bundleType == BUNDLE_TYPE_PEOPLE_LIST) {
                    val people: ArrayList<Parcelable>? = bundle.getParcelableArrayList(k)
                    Log.i("fcrow", "received notification found how many people?: "+people?.size.toString())
                    people?.let {
                        for (p in people) {
                            val person: Person? = p as Person
                            Log.i(
                                    "fcrow",
                                    "received notification people -> " + k + ": "+ p.toString() + " " + p?.name + " " +p?.key
                            )
                        }
                    }
                } else if(bundleType == BUNDLE_TYPE_PERSON) {
                    val person: Person? = bundle.getParcelable(k)
                    Log.i(
                            "fcrow",
                            "received notification  -> person " + k + ": " + person?.name + " " +person?.key
                    )
                }else{
                    Log.i(
                            "fcrow",
                            "received notification -> " + k
                    )
                }
            }
        }
         */
    }
}