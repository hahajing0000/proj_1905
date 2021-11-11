package com.zy.jetpack.hilt;

import android.util.Log;

import javax.inject.Inject;

/**
 * @ProjectName: JetPack1905Demo1
 * @Package: com.zy.jetpack.hilt
 * @ClassName: TestUtils
 * @Description:
 * @Author: 张跃 企鹅：444511958
 * @CreateDate: 2021/11/11 13:12
 * @UpdateUser: 张跃
 * @UpdateDate: 2021/11/11 13:12
 * @UpdateRemark:
 * @Version: 1.0
 */
public class TestUtils {
    @Inject
    public TestUtils(){
        //TestUtils.class.getConstructor().newInstance(); new TestUtils();
    }

    public void TestMethod1(){
        Log.d("123", "TestMethod1: ...");
    }
}
