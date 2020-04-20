package Assignment3;

import java.sql.*;

public class DbUserService implements UserService {
    private Connection connection;
    private PreparedStatement preparedStatement = null;

    public DbUserService() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost/infosys", "root", "rizimore,,,");
    }

    @Override
    public void addUser(User user) throws SQLException {
        this.preparedStatement = connection.prepareStatement("INSERT INTO users(name, gender, phone, status) VALUES(?, ?, ?, ?)");
        this.preparedStatement.setString(1, user.getName());
        this.preparedStatement.setString(2, user.getGender());
        this.preparedStatement.setString(3, user.getPhone());
        this.preparedStatement.setBoolean(4, user.getStatus());
        this.preparedStatement.executeUpdate();
    }

    @Override
    public void updateUser(User user) throws SQLException {
        if (this.getUser(user.getId()) != null) {
            this.preparedStatement = this.connection.prepareStatement("UPDATE users SET name = ?, gender = ?, phone = ?, status = ? WHERE id = ?");
            this.preparedStatement.setString(1, user.getName());
            this.preparedStatement.setString(2, user.getGender());
            this.preparedStatement.setString(3, user.getPhone());
            this.preparedStatement.setBoolean(4, user.getStatus());
            this.preparedStatement.setInt(5, user.getId());
            int n = this.preparedStatement.executeUpdate();

            if (n >= 1) {
                System.out.printf("User (%d) successfully updated from database.\n", user.getId());
            } else {
                System.out.println("There is no any user with this ID.");
            }
        }
    }

    @Override
    public void deleteUser(int userID) throws SQLException {
        if (this.getUser(userID) != null) {
            this.preparedStatement = this.connection.prepareStatement("DELETE FROM users WHERE id = ?");
            this.preparedStatement.setInt(1, userID);
            int n = this.preparedStatement.executeUpdate();

            if (n >= 1) {
                System.out.printf("User (%d) successfully deleted from database.\n", userID);
            } else {
                System.out.println("There is no any user with this ID.");
            }
        }
    }

    @Override
    public User getUser(int userID) throws SQLException {
        User user = null;

        this.preparedStatement = this.connection.prepareStatement("SELECT * FROM users WHERE id = ?");
        this.preparedStatement.setInt(1, userID);
        ResultSet resultSet = this.preparedStatement.executeQuery();

        while (resultSet.next()) {
            user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setGender(resultSet.getString("gender"));
            user.setPhone(resultSet.getString("phone"));
            user.setStatus(resultSet.getBoolean("status"));
        }

        return user;
    }

    @Override
    public void unblockUser(int userID) throws SQLException {
        this.preparedStatement = this.connection.prepareStatement("UPDATE users SET status = ? WHERE id = ?");
        this.preparedStatement.setBoolean(1, true);
        this.preparedStatement.setInt(2, userID);
        int n = this.preparedStatement.executeUpdate();

        if (n >= 1) {
            System.out.printf("User (%d) successfully unblock from database.\n", userID);
        } else {
            System.out.println("There is no any user with this ID.");
        }
    }

    @Override
    public void blockUser(int userID) throws SQLException {
        this.preparedStatement = this.connection.prepareStatement("UPDATE users SET status = ? WHERE id = ?");
        this.preparedStatement.setBoolean(1, false);
        this.preparedStatement.setInt(2, userID);
        int n = this.preparedStatement.executeUpdate();

        if (n >= 1) {
            System.out.printf("User (%d) successfully blocked from database.\n", userID);
        } else {
            System.out.println("There is no any user with this ID.");
        }
    }

    @Override
    public ResultSet getAllUsers() throws SQLException {
        this.preparedStatement = this.connection.prepareStatement("SELECT * FROM users");
        return this.preparedStatement.executeQuery();
    }
}
