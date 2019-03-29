package com.example.lenovo.myapplication;

import android.Manifest;
import android.content.Context;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.cj.ScreenShotUtil.ScreentShotUtil;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicksfd(View view) {
        Context context = view.getContext();
//        ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
//        int id = view.getId();
//        TextView viewById = findViewById(R.id.text);
//        String str = "";
        String mSavedPath = "/sdcard/Download/screen"+new SimpleDateFormat("HHmmss").format(new Date()) +".png";
//        try {
//            Runtime.getRuntime().exec("screencap -p " + mSavedPath);
//        } catch (Exception e) {
//            e.printStackTrace();
//            str += "\n"+"截图失败"+e.getMessage();
//        }
//        str += "\n"+"截图成功";
//        File file = new File("/sdcard/Download");
//        str += "\n"+"文件存在"+file.exists();
//        try {
//            File[] list = file.listFiles();
//            str += "\n"+"文件数量"+list.length;
//        } catch (Exception e) {
//            str += "\n"+"xiaji文件:"+e.getMessage();
//        }
        ScreentShotUtil instance = ScreentShotUtil.getInstance();
        instance.takeScreenshot(context,mSavedPath);
//        viewById.setText(str);
//        ScreenCaptureUtil instance = ScreenCaptureUtil.getInstance();
//        byte[] screenCapBytes = instance.getScreenCapBytes();
//        System.out.println(screenCapBytes.length);
        Log.i("sfdsf","yes");
    }
}
