package com.zy.jetpack.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * @ProjectName: JetPack1905Demo1
 * @Package: com.zy.jetpack.room
 * @ClassName: AppDatabase
 * @Description:
 * @Author: 张跃 企鹅：444511958
 * @CreateDate: 2021/11/10 14:29
 * @UpdateUser: 张跃
 * @UpdateDate: 2021/11/10 14:29
 * @UpdateRemark:
 * @Version: 1.0
 */
@Database(entities = {UserEntity.class},version = 1)
public abstract   class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
