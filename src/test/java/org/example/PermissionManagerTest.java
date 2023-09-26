package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class PermissionManagerTest {
    @Test
    public void testGetCurrentLevel(){
        PermissionManager permissionManager=new PermissionManager();

        assertEquals(PermissionLevel.USER,permissionManager.getCurrentLevel());
    }

    @Test
    public void testSetCurrentLevel(){
        PermissionManager permissionManager=new PermissionManager();

        permissionManager.setPermissionLevelName(PermissionLevel.ADMIN);

        assertEquals(PermissionLevel.ADMIN,permissionManager.getCurrentLevel());
    }

    @Test
    public void testGetPermissionLevelName(){
        PermissionManager permissionManager=new PermissionManager();

        assertEquals("Admin",permissionManager.getPermissionLevelName(PermissionLevel.ADMIN));
        assertEquals("Developer",permissionManager.getPermissionLevelName(PermissionLevel.DEVELOPER));
        assertEquals("User",permissionManager.getPermissionLevelName(PermissionLevel.USER));

    }
}
