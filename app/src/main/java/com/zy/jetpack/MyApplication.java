package com.zy.jetpack;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import java.util.Stack;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @ProjectName: JetPack1905Demo1
 * @Package: com.zy.jetpack
 * @ClassName: MyApplication
 * @Description:
 * @Author: 张跃 企鹅：444511958
 * @CreateDate: 2021/11/10 13:14
 * @UpdateUser: 张跃
 * @UpdateDate: 2021/11/10 13:14
 * @UpdateRemark:
 * @Version: 1.0
 */
public class MyApplication extends Application {

    static Stack<Activity> activities=new Stack<>();
    @Override
    public void onCreate() {
        super.onCreate();

        //捕获没有catch的异常
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(@NonNull Thread t, @NonNull Throwable e) {
                StackTraceElement[] stackTrace = e.getStackTrace();

            }
        });

        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
                activities.push(activity);
            }

            @Override
            public void onActivityStarted(@NonNull Activity activity) {

            }

            @Override
            public void onActivityResumed(@NonNull Activity activity) {

            }

            @Override
            public void onActivityPaused(@NonNull Activity activity) {

            }

            @Override
            public void onActivityStopped(@NonNull Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(@NonNull Activity activity) {
                activities.remove(activity);
            }
        });


    }

    public static void closeApp(){
        for (Activity activity:
             activities) {
            activity.finish();
        }
    }
}
