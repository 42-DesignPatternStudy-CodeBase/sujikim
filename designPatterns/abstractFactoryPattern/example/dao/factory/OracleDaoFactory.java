package abstractFactoryPattern.example.dao.factory;

import abstractFactoryPattern.example.dao.dao.*;
import abstractFactoryPattern.example.dao.dao.oracle.*;

public class OracleDaoFactory extends DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();  
    }
    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao(); 
    }
}