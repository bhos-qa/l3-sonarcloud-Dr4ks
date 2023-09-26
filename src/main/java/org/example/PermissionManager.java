package org.example;

import javax.naming.NoPermissionException;

public class PermissionManager {
    private PermissionLevel mCurrentLevel=PermissionLevel.USER;

    public PermissionLevel getCurrentLevel(){
        return  mCurrentLevel;
    }

    public void setPermissionLevelName(PermissionLevel mCurrentLevel){
        this.mCurrentLevel=mCurrentLevel;
    }

    public String getPermissionLevelName(PermissionLevel permissionLevel){
        return switch (permissionLevel) {
            case ADMIN -> "Admin";
            case DEVELOPER -> "Developer";
            case USER -> "User";
            default -> throw new IllegalArgumentException("Invalid permission level");
        };
    }
}
