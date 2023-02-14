public class UserInfoMySqlDao implements UserInfoDao {

    private void log(String job, String userId) {
        System.out.println(job + " into MYSQL DB userId = " + userId);
    }

    @Override
    public void insertUser(UserInfo newUserInfo) {
        // Mysql 관련 코드
        log("insert", newUserInfo.getUserId());
    }

    @Override
    public void updateUser(String userId, UserInfo updatedUserInfo) {
        // Mysql 관련 코드
        log("update", userId);
        
    }

    @Override
    public void deleteUser(String userId) {
        // Mysql 관련 코드
        log("delete", userId);
    }
}
