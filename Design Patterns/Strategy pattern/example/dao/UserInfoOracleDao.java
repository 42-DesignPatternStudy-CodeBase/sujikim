public class UserInfoOracleDao implements UserInfoDao {

    private void log(String job, String userId) {
        System.out.println(job + " into ORACLE DB userId = " + userId);
    }

    @Override
    public void insertUser(UserInfo newUserInfo) {
        // Oracle 관련 코드
        log("insert", newUserInfo.getUserId());
    }

    @Override
    public void updateUser(String userId, UserInfo updatedUserInfo) {
        // Oracle 관련 코드
        log("update", userId);
        
    }

    @Override
    public void deleteUser(String userId) {
        // Oracle 관련 코드
        log("delete", userId);        
    }
}
