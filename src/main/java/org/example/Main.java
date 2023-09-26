package org.example;

public class Main {
    public static void main(String[] args){
        PermissionManager permissionManager=new PermissionManager();

        PermissionLevel currentLevel=permissionManager.getCurrentLevel();


        permissionManager.setPermissionLevelName(PermissionLevel.ADMIN);

        System.out.println(permissionManager.getCurrentLevel());

    }
}
