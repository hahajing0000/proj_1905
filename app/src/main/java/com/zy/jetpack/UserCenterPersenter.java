package com.zy.jetpack;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * @ProjectName: JetPack1905Demo1
 * @Package: com.zy.jetpack
 * @ClassName: UserCenterPersenter
 * @Description:
 * @Author: 张跃 企鹅：444511958
 * @CreateDate: 2021/11/10 13:42
 * @UpdateUser: 张跃
 * @UpdateDate: 2021/11/10 13:42
 * @UpdateRemark:
 * @Version: 1.0
 */
public class UserCenterPersenter implements LifecycleObserver {//DefaultLifecycleObserver

//    @Override
////    public void onCreate(@NonNull LifecycleOwner owner) {
////        Log.d("123", "onCreate: ....");
////    }
////
////    @Override
////    public void onPause(@NonNull LifecycleOwner owner) {
////        Log.d("123", "onPause: ....");
////    }
////
////    @Override
////    public void onStop(@NonNull LifecycleOwner owner) {
////        Log.d("123", "onStop: ....");
////    }
////
////    @Override
////    public void onDestroy(@NonNull LifecycleOwner owner) {
////        Log.d("123", "onDestroy: ....");
////    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void activityOnCreate(){
        Log.d("123", "activityOnCreate: ...");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void activityOnStop(){
        Log.d("123", "activityOnStop: ...");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void activityOnAny(){
        Log.d("123", "activityOnAny: ...");
    }
}
