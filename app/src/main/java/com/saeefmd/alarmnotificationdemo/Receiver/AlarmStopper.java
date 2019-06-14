package com.saeefmd.alarmnotificationdemo.Receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.saeefmd.alarmnotificationdemo.Utilities.MediaController;

public class AlarmStopper extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        MediaController.getInstance(context).stopMusic();
    }
}
