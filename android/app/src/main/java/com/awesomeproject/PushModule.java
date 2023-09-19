package com.awesomeproject;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.xiaomi.mipush.sdk.MiPushClient;
import org.json.JSONException;
import org.json.JSONObject;

public class PushModule extends ReactContextBaseJavaModule {
    private ReactApplicationContext reactContext;
    public PushModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "PushModule";
    }
    /**
     从RN界面里面调用该方法
     **/
    @ReactMethod
    public void getDeviceToken(){
        MainApplication.getReactPackage().mModule.sendDataToJS( MiPushClient.getRegId(MainApplication.getContext()));


    }

    public void sendDataToJS(String deviceToken){
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("deviceToken",deviceToken);
            jsonObject.put("deviceName","这里是证书名称");

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                .emit("deviceToken",jsonObject.toString());
    }



}

