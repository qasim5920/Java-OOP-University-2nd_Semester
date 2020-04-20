package Assignment3;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface UserService {
    void addUser(User user) throws SQLException;
    void updateUser( User user) throws SQLException;
    void deleteUser(int userID) throws SQLException;
    User getUser(int userID) throws SQLException;
    void unblockUser(int userID) throws SQLException;
    void blockUser(int userID) throws SQLException;
    ResultSet getAllUsers() throws SQLException;
}
