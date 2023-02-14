package strategyPattern.example.dao;

public class UserInfoMsSqlDao implements UserInfoDao {

    private void log(String job, String userId) {
        System.out.println(job + " into MSSQL DB userId = " + userId);
    }

    @Override
    public void insertUser(UserInfo newUserInfo) {
        // MSsql 관련 코드
        log("insert", newUserInfo.getUserId());
    }

    @Override
    public void updateUser(String userId, UserInfo updatedUserInfo) {
        // MSsql 관련 코드
        log("update", userId);
        
    }

    @Override
    public void deleteUser(String userId) {
        // MSsql 관련 코드
        log("delete", userId);
    }
}
