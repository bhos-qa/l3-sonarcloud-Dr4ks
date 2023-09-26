package org.example;

public enum PermissionLevel {
    ADMIN("Admin"),
    DEVELOPER("Developer"),
    USER("User");

    final   String  name;

    PermissionLevel(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
