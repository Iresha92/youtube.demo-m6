package com.example.m6.switchscreensintent;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class ishkIntentService extends IntentService {

    private static final String TAG="com.example.m6.switchscreensintent";

    public ishkIntentService(){
        super("ishkIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //dz z wt d service does
        Log.i(TAG,"The service has now started");
    }

}



