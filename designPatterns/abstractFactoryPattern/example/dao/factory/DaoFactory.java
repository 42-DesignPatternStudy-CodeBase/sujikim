package abstractFactoryPattern.example.dao.factory;

import abstractFactoryPattern.example.dao.dao.*;

public abstract class DaoFactory {
    public abstract UserInfoDao createUserInfoDao();
    public abstract ProductDao createProductDao(); 
}