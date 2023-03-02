package abstractFactoryPattern.example.dao.dao;

import abstractFactoryPattern.example.dao.*;

public interface UserInfoDao {
	public void insertUserInfo(UserInfo userInfo);
    public void updateUserInfo(UserInfo userInfo);
    public void deleteUserInfo(UserInfo userInfo);
}
