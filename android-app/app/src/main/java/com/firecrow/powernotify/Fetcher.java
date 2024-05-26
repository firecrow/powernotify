package com.firecrow.powernotify;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import java.util.HashMap;
import java.util.List;

public class Fetcher {
    static PackageManager pm = null;
    static boolean initialized = false;
    static HashMap<String, ApplicationInfo> apps = null;
    public static void Init(Context ctx) {
        PackageManager pm = ctx.getPackageManager();
        Fetcher.initialized = true;
    }

    public static void GatherApps() {
        HashMap<String, ApplicationInfo> data = new HashMap<String, ApplicationInfo>();
        List<ApplicationInfo> list = pm.getInstalledApplications(PackageManager.GET_META_DATA);

        for(int i = 0, l = list.size(); i < l; i++) {
            ApplicationInfo info = list.get(i);
            data.put(info.packageName, info);
        }

        apps = data;
    }

    public static HashMap<String, ApplicationInfo> GetApps(){
        if(!initialized){
            return null;
        }

        if(apps == null){
            GatherApps();
        }

        return apps;
    }
}