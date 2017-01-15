package com.ld.silentoncall;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class BlueReceiver extends BroadcastReceiver {



    final String pressed = "false";
    BluetoothAdapter btAdapter = BluetoothAdapter.getDefaultAdapter();
     MainActivity ma=new MainActivity();
    private AudioManager amanager;


    @Override
    public void onReceive(Context context, Intent intent) {

        Log.v("MPR", "Its Ringing");
        Toast.makeText(context, "SR", Toast.LENGTH_SHORT).show();

        if (intent.getStringExtra(TelephonyManager.EXTRA_STATE).equals(
                TelephonyManager.EXTRA_STATE_RINGING)) {
            Log.v("MPR", "Its Ringing");
            Toast.makeText(context, "SR", Toast.LENGTH_SHORT).show();

            // isRinging = true;
            if (MainActivity.proxValue == 0) {
                amanager = (AudioManager) context
                        .getSystemService(Context.AUDIO_SERVICE);
                amanager.setRingerMode(0x00000000);
                // isRinging = false;
                Log.v("MPR", "Its Ringing");
                Toast.makeText(context, "SR", Toast.LENGTH_SHORT).show();

            }
            Toast.makeText(context, "SR", Toast.LENGTH_SHORT).show();

            Log.v("MPR", "Its Ringing");



        }

    }

}