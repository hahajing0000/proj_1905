package com.zy.jetpack.room;

import java.util.List;

import androidx.databinding.InverseBindingAdapter;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

/**
 * @ProjectName: JetPack1905Demo1
 * @Package: com.zy.jetpack.room
 * @ClassName: UserDao
 * @Description:
 * @Author: 张跃 企鹅：444511958
 * @CreateDate: 2021/11/10 14:24
 * @UpdateUser: 张跃
 * @UpdateDate: 2021/11/10 14:24
 * @UpdateRemark:
 * @Version: 1.0
 */
@Dao
public interface UserDao {
    @Query("select * from b_user where c_name = :username")
    List<UserEntity> findByName(String username);

    @Insert
    void insertUser(UserEntity... users);

    @Delete
    void deleteUser(UserEntity userEntity);
}
