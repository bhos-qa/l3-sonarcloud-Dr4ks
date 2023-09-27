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

}
