package Task5;

import java.util.ArrayList;

public class InMemoryUserService   implements UserService {

    ArrayList<User> users;
    public InMemoryUserService(ArrayList<User>users){
        this.users=users;
    }
 @Override
    public void addUser(User user) throws UserAlreadyExistException {
        int i = 0;
        for(User u: users){
            if(user.equals(u)){
                i++;
                throw new UserAlreadyExistException("UserALreadyExistException" +  user.getID());
            }
        }
        if(i== 0){
            users.add(user);
        }
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(int userID) {

    }

    @Override
    public User getUser(int userID) throws UserAccountIsBlockedException{
        for(int i = 0; i < users.size();i++){
            if(users.get(i).getID() == userID){
                if(!users.get(i).isStatus()) {

                        throw new UserAccountIsBlockedException("UserAccountIsBlockedException");

                }
                return users.get(i);
            }
        }

        return null;
    }
    @Override
    public void unblockUser(int userID) {

    }

    @Override
    public void blockUser(int userID) {

    }


}
