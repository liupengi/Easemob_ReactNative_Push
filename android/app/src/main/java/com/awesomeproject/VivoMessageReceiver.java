package com.awesomeproject;

import android.content.Context;

import com.vivo.push.sdk.OpenClientPushMessageReceiver;

public class VivoMessageReceiver extends OpenClientPushMessageReceiver {
    @Override
    public void onReceiveRegId(Context context, String regId) {
        super.onReceiveRegId(context, regId);
    }
}
