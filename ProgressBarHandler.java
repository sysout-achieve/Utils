package com.sysoutachieve.testdatehandle;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class ProgressBarHandler {

    Activity activity;
    public ProgressBarHandler(Activity activity){
        this.activity = activity;
    }

    public ProgressBar setProgressBar(ProgressBar progressBar){     //기본 indicator setting(indicator의 색깔, 설정값을 결정하여 progressbar setting)
        progressBar.setIndeterminate(true);
        progressBar.getIndeterminateDrawable().setColorFilter(Color.parseColor("#067a77"), PorterDuff.Mode.MULTIPLY);
        return progressBar;
    }

    public void startIndicator(ProgressBar progressBar){        //설정한 progressbar 화면 노출, 화면 클릭 불가하게 설정
        progressBar.setVisibility(View.VISIBLE);
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    }

    public void finishIndicator(ProgressBar progressBar){       //loading이 끝나면 progressbar 제거 및 화면 터치 활성화
        progressBar.setVisibility(View.GONE);
        activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
    }

}
