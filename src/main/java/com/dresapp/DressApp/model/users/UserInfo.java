package com.dresapp.DressApp.model.users;

public class UserInfo {

    private String name;
    private String lastName;
    private String address;
    private int age;
    private BodyDescription bodyDescription;

    public UserInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BodyDescription getBodyDescription() {
        return bodyDescription;
    }

    public void setBodyDescription(BodyDescription bodyDescription) {
        this.bodyDescription = bodyDescription;
    }

    private UserInfo(Builder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.age = builder.age;
        this.bodyDescription = builder.bodyDescription;
    }

    public static Builder newPerson() {
        return new Builder();
    }


    public static final class Builder {
        private String name;
        private String lastName;
        private String address;
        private int age;
        private BodyDescription bodyDescription;

        public Builder() {
        }

        public UserInfo build() {
            return new UserInfo(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder bodyDescription(BodyDescription bodyDescription) {
            this.bodyDescription = bodyDescription;
            return this;
        }
    }
}
