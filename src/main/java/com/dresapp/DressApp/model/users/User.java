package com.dresapp.DressApp.model.users;

import com.dresapp.DressApp.model.clothes.Wardrobe;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {

    @Id
    private String id;
    @Indexed(unique = true)
    private String userName;
    private String password;
    private UserInfo userInfo;
//    private Wardrobe wardrobe;
    //TODO add friends
//    private Friends friends;
    //private Calendar calendar;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    private User(Builder builder) {
        this.id = builder.id;
        this.userName = builder.userName;
        this.password = builder.password;
        this.userInfo = builder.userInfo;
//        this.wardrobe = builder.wardrobe;
    }

    public static Builder newUser() {
        return new Builder();
    }


    public static final class Builder {
        private String id;
        private String userName;
        private String password;
        private UserInfo userInfo;
        private Wardrobe wardrobe;

        public Builder() {
        }

        public User build() {
            return new User(this);
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder person(UserInfo userInfo) {
            this.userInfo = userInfo;
            return this;
        }

        public Builder wardrobe(Wardrobe wardrobe) {
            this.wardrobe = wardrobe;
            return this;
        }
    }
}
