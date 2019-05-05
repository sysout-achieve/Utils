package com.guiving.guiverb;

import android.app.Activity;
import android.content.Context;

public class IndicatorSingleton {

    private static IndicatorSingleton _Instance;

    private IndicatorSingleton(){
        //생성자앞에 private으로 선언하면서,
        //다른 클래스에서 new 키워드를 사용하여 인스턴스를 만들 수 있는 여지를 막음.
    }

    public static IndicatorSingleton getInstance(){
        if(_Instance == null){
            _Instance = new IndicatorSingleton();
        }
        return _Instance;
    }

    public void progressON(Activity activity) {
        LoadingBarHandler.progressON(activity, null);
    }

    public void progressON(Activity activity, String message) {
        LoadingBarHandler.progressON(activity, message);
    }

    public void progressOFF() {
        LoadingBarHandler.progressOFF();
    }
}
