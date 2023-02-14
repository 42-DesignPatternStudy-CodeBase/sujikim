public interface UserInfoDao {
    public void insertUser(UserInfo newUserInfo);
    public void updateUser(String userId, UserInfo updatedUserInfo);
    public void deleteUser(String userId);
}
