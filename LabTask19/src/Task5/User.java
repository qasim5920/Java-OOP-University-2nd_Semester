package Task5;

import java.util.ArrayList;
import java.util.Objects;

public class User  {
    private int ID;
    private String name;
    private boolean status;


    public User(int ID, String name, boolean status) {
        this.ID = ID;
        this.name = name;
        this.status = status;
    }
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }


    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name  +
                '}';
    }



    @Override
    public boolean equals(Object obj) {
       if (obj == null){
           return false;
       }
       if(getClass() != obj.getClass()){return false;}
       final User Other = (User) obj ;
       if(this.ID!= Other.ID){return false;}
       return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
