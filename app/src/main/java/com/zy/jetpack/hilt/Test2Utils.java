package com.zy.jetpack.hilt;

import android.content.Context;
import android.util.Log;

import com.zy.jetpack.Person2;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.qualifiers.ActivityContext;
import retrofit2.Retrofit;

/**
 * @ProjectName: JetPack1905Demo1
 * @Package: com.zy.jetpack.hilt
 * @ClassName: Test2Utils
 * @Description:
 * @Author: 张跃 企鹅：444511958
 * @CreateDate: 2021/11/11 13:37
 * @UpdateUser: 张跃
 * @UpdateDate: 2021/11/11 13:37
 * @UpdateRemark:
 * @Version: 1.0
 */
@Module
@InstallIn(ApplicationComponent.class)
public class Test2Utils {

    @Person1Ann
    @Binds
    public IPerson providePerson(@ActivityContext Context context){
       return new Person1();
    }

    @Person2Ann
    @Binds
    public IPerson providePerson2(){
        return new Person2();
    }
}
