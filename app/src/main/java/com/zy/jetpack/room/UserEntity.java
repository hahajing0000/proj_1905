package com.zy.jetpack.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @ProjectName: JetPack1905Demo1
 * @Package: com.zy.jetpack.room
 * @ClassName: UserEntity
 * @Description:
 * @Author: 张跃 企鹅：444511958
 * @CreateDate: 2021/11/10 14:22
 * @UpdateUser: 张跃
 * @UpdateDate: 2021/11/10 14:22
 * @UpdateRemark:
 * @Version: 1.0
 */
@Entity(tableName = "b_user")
public class UserEntity {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "c_name")
    public String name;

    @ColumnInfo(name = "i_age")
    public int age;
}
