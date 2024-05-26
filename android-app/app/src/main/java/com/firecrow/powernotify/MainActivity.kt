package com.firecrow.powernotify

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    val inflater: LayoutInflater =
        this.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    fun showAppList(dest: ViewGroup){
        val apps = Fetcher.GetApps()
        val listLayout = inflater.inflate(R.layout.app_list, null)
        val root = listLayout.findViewById<LinearLayout>(R.id.apps)

        apps.forEach { kv ->
            val item = inflater.inflate(R.layout.app_item, null)
            item.findViewById<TextView>(R.id.app_name).text = kv.value.name;
            root.addView(item);
        }

        dest.addView(root)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        Fetcher.Init(this);

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val root = findViewById<LinearLayout>(R.id.main) as ViewGroup
        showAppList(root);

    }
}