package com.zy.jetpack;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * @ProjectName: JetPack1905Demo1
 * @Package: com.zy.jetpack
 * @ClassName: UserEntity
 * @Description:
 * @Author: 张跃 企鹅：444511958
 * @CreateDate: 2021/11/9 11:07
 * @UpdateUser: 张跃
 * @UpdateDate: 2021/11/9 11:07
 * @UpdateRemark:
 * @Version: 1.0
 */
public class UserEntity extends BaseObservable {

    private int id;
    private String name;
    private String address;
    private String imgUrl;

    public UserEntity(int id, String name, String address, String imgUrl) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
