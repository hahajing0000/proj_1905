package com.zy.jetpack;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zy.jetpack.databinding.TestBinding1905;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import androidx.databinding.ObservableField;

public class MainActivity extends AppCompatActivity {

    ObservableField<String> targetStr=new ObservableField<>();
    private UserEntity entity;

    private static Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //第三步 拿到DataBinding实例对象
        TestBinding1905 mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //提供数据
        entity = new UserEntity(0,"小明","天津","https://ss3.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/baike/w%3D268/sign=08be89d2cb1b9d168ac79d67cbdfb4eb/b03533fa828ba61ed6abd3224434970a304e5971.jpg");
        //设置数据
        mainBinding.setUser(entity);
        mainBinding.setOwner(this);

        targetStr.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {

                Log.d("123", "onPropertyChanged: ...."+  targetStr.get());
            }
        });
        mContext=this;
    }


    public void doAction(View view,UserEntity userEntity){
        entity.setName("小红");
//        Toast.makeText(this, userEntity.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @BindingAdapter({"imgUrl"})
    public static  void imageViewAdapter(ImageView source,String url){
        Glide.with(mContext).load(url).into(source);
    }
}