package com.firecrow.powernotify

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.children


class MainActivity : AppCompatActivity() {

    fun showAppList(dest: ViewGroup){
        Log.v("fcrow", "showAppList")
        val inflater: LayoutInflater =
            this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val apps = Fetcher.GetApps()
        val listLayout = inflater.inflate(R.layout.app_list, null)
        val root = listLayout.findViewById<LinearLayout>(R.id.apps)

        apps.forEach { kv ->
            val item = inflater.inflate(R.layout.app_item, null)
            item.findViewById<TextView>(R.id.app_name).text = kv.value.name;
            root.addView(item);
            Log.v("fcrow", "Adding: " + kv.value.name + " count" + root.childCount)
        }

        Log.v("fcrow", "append to dest: " + dest.toString())
        Log.v("fcrow", "append to listLayout: " + listLayout.toString())
        dest.addView(listLayout)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onStart() {
        super.onStart()
        Fetcher.Init(this);
        val root = findViewById<LinearLayout>(R.id.main) as ViewGroup
        showAppList(root);
    }
}