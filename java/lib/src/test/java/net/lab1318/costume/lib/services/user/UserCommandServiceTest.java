package net.lab1318.costume.lib.services.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.lib.services.TestData;

public abstract class UserCommandServiceTest extends UserServiceTest {
    @Test
    public void testDeleteUserById() throws Exception {
        assertEquals(0, _getUsers().size());
        _putUsers();
        for (final UserEntry userEntry : TestData.getInstance().getUsers()) {
            userQueryService.getUserById(userEntry.getId());
            userCommandService.deleteUserById(userEntry.getId());
            try {
                userQueryService.getUserById(userEntry.getId());
                fail();
            } catch (final NoSuchUserException e) {
            }
        }
    }

    @Test
    public void testDeleteUsers() throws Exception {
        assertEquals(0, _getUsers().size());
        _putUsers();
        assertNotEquals(0, _getUsers().size());
        userCommandService.deleteUsers();
        assertEquals(0, _getUsers().size());
    }

    @Test
    public void testPutUsers() throws Exception {
        assertEquals(0, _getUsers().size());
        _putUsers();
        assertEquals(TestData.getInstance().getUsers().size(), _getUsers().size());
    }
}
