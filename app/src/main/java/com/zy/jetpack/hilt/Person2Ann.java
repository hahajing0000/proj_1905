package com.zy.jetpack.hilt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * @ProjectName: JetPack1905Demo1
 * @Package: com.zy.jetpack.hilt
 * @ClassName: Person2Ann
 * @Description:
 * @Author: 张跃 企鹅：444511958
 * @CreateDate: 2021/11/11 14:23
 * @UpdateUser: 张跃
 * @UpdateDate: 2021/11/11 14:23
 * @UpdateRemark:
 * @Version: 1.0
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Person2Ann {
}
