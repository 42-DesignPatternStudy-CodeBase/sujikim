package strategyPattern.example.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class _Main {

    public static UserInfoDao getUserInfoDaoFromPropertyFile() throws FileNotFoundException, IOException {
        String path = "/designPatterns/strategyPattern/example/dao/db.properties";
        System.err.println(System.getProperty("user.dir"));
        FileInputStream fileStream = new FileInputStream(System.getProperty("user.dir") + path);

        Properties properties = new Properties();
        properties.load(fileStream);
        String dbType = properties.getProperty("DBTYPE");

        if (dbType.equals("ORACLE"))
            return new UserInfoOracleDao();
        else if (dbType.equals("MYSQL"))
            return new UserInfoMySqlDao();
        else 
            return new UserInfoMySqlDao();
    }

    public static void main(String[] args) throws IOException {

        UserInfoDao userInfoDao = getUserInfoDaoFromPropertyFile();
        
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setUserName("홍길");
        userInfoDao.insertUser(userInfo);
        
        userInfo.setUserName("홍길동");
        userInfoDao.updateUser(userInfo.getUserId(), userInfo);
        userInfoDao.deleteUser(userInfo.getUserId());
    }
}

