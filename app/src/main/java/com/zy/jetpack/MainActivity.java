package com.zy.jetpack;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zy.jetpack.databinding.TestBinding1905;
import com.zy.jetpack.room.AppDatabase;

import java.util.List;
import java.util.concurrent.Executors;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.room.Room;
import androidx.room.RoomDatabase;

public class MainActivity extends AppCompatActivity {

    ObservableField<String> targetStr = new ObservableField<>();
    private UserEntity entity;

    private static Context mContext;

    MutableLiveData<String> liveDataSource = new MutableLiveData<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        UserCenterPersenter userCenterPersenter = new UserCenterPersenter();
        this.getLifecycle().addObserver(userCenterPersenter);

//        Rxjava.as(AutoDisponse<>.aa(lifecycleOwner))


//        savedInstanceState.getString("name");
//        txtName.setText();

        liveDataSource.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.d("123", "LiveData Value onChanged: " + s);
            }
        });


        //第三步 拿到DataBinding实例对象
        TestBinding1905 mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //提供数据
        entity = new UserEntity(0, "小明", "天津", "https://ss3.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/baike/w%3D268/sign=08be89d2cb1b9d168ac79d67cbdfb4eb/b03533fa828ba61ed6abd3224434970a304e5971.jpg");
        //设置数据
        mainBinding.setUser(entity);
        mainBinding.setOwner(this);

        targetStr.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {

                Log.d("123", "onPropertyChanged: ...." + targetStr.get());
            }
        });

//        Button btn=new Button(this);
//        btn.post(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//        btn.invalidate();
//        btn.postInvalidate();
        mContext = this;
    }

//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putString("name",txtName.getText().toString());
//    }
//
//    @Override
//    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//    }

    public void doAction(View view, UserEntity userEntity) {
        entity.setName("小红");
//        Toast.makeText(this, userEntity.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
//        this.getFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
//            @Override
//            public void onBackStackChanged() {
//
//            }
//        });

//        if (Build.VERSION.SDK_INT >= 26) {
//            this.getFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() {
//                @Override
//                public void onFragmentPreAttached(FragmentManager fm, Fragment f, Context context) {
//                    super.onFragmentPreAttached(fm, f, context);
//                }
//
//                @Override
//                public void onFragmentAttached(FragmentManager fm, Fragment f, Context context) {
//                    super.onFragmentAttached(fm, f, context);
//                }
//
//                @Override
//                public void onFragmentPreCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
//                    super.onFragmentPreCreated(fm, f, savedInstanceState);
//                }
//
//                @Override
//                public void onFragmentCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
//                    super.onFragmentCreated(fm, f, savedInstanceState);
//                }
//
//                @Override
//                public void onFragmentActivityCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
//                    super.onFragmentActivityCreated(fm, f, savedInstanceState);
//                }
//
//                @Override
//                public void onFragmentViewCreated(FragmentManager fm, Fragment f, View v, Bundle savedInstanceState) {
//                    super.onFragmentViewCreated(fm, f, v, savedInstanceState);
//                }
//
//                @Override
//                public void onFragmentStarted(FragmentManager fm, Fragment f) {
//                    super.onFragmentStarted(fm, f);
//                }
//
//                @Override
//                public void onFragmentResumed(FragmentManager fm, Fragment f) {
//                    super.onFragmentResumed(fm, f);
//                }
//
//                @Override
//                public void onFragmentPaused(FragmentManager fm, Fragment f) {
//                    super.onFragmentPaused(fm, f);
//                }
//
//                @Override
//                public void onFragmentStopped(FragmentManager fm, Fragment f) {
//                    super.onFragmentStopped(fm, f);
//                }
//
//                @Override
//                public void onFragmentSaveInstanceState(FragmentManager fm, Fragment f, Bundle outState) {
//                    super.onFragmentSaveInstanceState(fm, f, outState);
//                }
//
//                @Override
//                public void onFragmentViewDestroyed(FragmentManager fm, Fragment f) {
//                    super.onFragmentViewDestroyed(fm, f);
//                }
//
//                @Override
//                public void onFragmentDestroyed(FragmentManager fm, Fragment f) {
//                    super.onFragmentDestroyed(fm, f);
//                }
//
//                @Override
//                public void onFragmentDetached(FragmentManager fm, Fragment f) {
//                    super.onFragmentDetached(fm, f);
//                }
//            }, false);
//
//        } else {
//
//        }
    }

    @BindingAdapter({"imgUrl"})
    public static void imageViewAdapter(ImageView source, String url) {
        Glide.with(mContext).load(url).into(source);
    }

//    private Handler mainHandler=new Handler(Looper.getMainLooper());
//    private void updateUI(Runnable runnable){
//        if (Looper.getMainLooper().getThread()==Thread.currentThread()){
//            runnable.run();
//        }
//        else{
//            mainHandler.post(runnable);
//        }
//    }

    public void doLiveDataTestAction(View view) {
//        liveDataSource.setValue("123");

//        runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });

        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mHandler.postDelayed(this, 1000);
//                Log.d("123", "run: ...........");
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    //主线程
                    liveDataSource.setValue("LiveData Msg");
                } else {
                    //子线程
                    liveDataSource.postValue("LiveData Msg");
                }


            }
        }, 1000);
    }

    public void doRoomAction(View view){

        Executors.newFixedThreadPool(2).submit(new Runnable() {
            @Override
            public void run() {
                RoomDatabase.Builder<AppDatabase> testDB = Room.databaseBuilder(MainActivity.this, AppDatabase.class, "testDB");
                AppDatabase db = testDB.build();
                com.zy.jetpack.room.UserEntity userEntity=new com.zy.jetpack.room.UserEntity();
                userEntity.name="小红";
                userEntity.age=11;
                db.userDao().insertUser(userEntity);

                List<com.zy.jetpack.room.UserEntity> list = db.userDao().findByName("小红");

                Log.d("123", "doRoomAction: "+list.size()+" "+list.get(0));
            }
        });

    }

    private Handler mHandler = new Handler();
}