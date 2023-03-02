package abstractFactoryPattern.example.dao.dao.mysql;

import abstractFactoryPattern.example.dao.UserInfo;
import abstractFactoryPattern.example.dao.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

	public UserInfoMySqlDao() {
	}

	@Override
	public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MYSQL DB " + userInfo);
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MYSQL DB " + userInfo);
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into MYSQL DB " + userInfo);
	}
	
}
