package com.example.broadcastlistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;
public class AirplaneModeChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (isAirplaneModeOn(context.getApplicationContext())){
            Toast.makeText (context,"AirPlane mode is on00-0", Toast. LENGTH_SHORT).show();
        } else {
            Toast.makeText (context,"AlrPlane mode Is off", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isAirplaneModeOn(Context context) {
        return Settings.System.getInt(context.getContentResolver(),Settings.Global.WIFI_ON,0)!=0;
        //return Settings.System.getInt(context.getContentResolver(),Settings.Global.AIRPLANE_MODE_ON,0) !=0;
    }
}
