package net.lab1318.costume.lib.services.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.thryft.native_.EmailAddress;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.lib.services.TestData;

public final class UserCommandServiceTest extends UserServiceTest {
    @Test
    public void testDeleteUserById() throws Exception {
        assertEquals(0, _getUsers().size());
        final ImmutableList<UserEntry> expected = _postUsers();
        for (final UserEntry userEntry : expected) {
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
        _postUsers();
        assertNotEquals(0, _getUsers().size());
        userCommandService.deleteUsers();
        assertEquals(0, _getUsers().size());
    }

    @Test
    public void testPostUser() throws Exception {
        assertEquals(0, _getUsers().size());
        _postUsers();
        assertEquals(TestData.getInstance().getUsers().size(), _getUsers().size());
    }

    @Test
    public void testPutUser() throws Exception {
        assertEquals(0, _getUsers().size());
        final UserEntry expected = _postUsers().iterator().next();
        final EmailAddress newEmailAddress = new EmailAddress("testother@example.com");
        userCommandService.putUser(expected.getId(),
                User.builder(expected.getModel()).setEmailAddress(newEmailAddress).build());
        final User actual = userQueryService.getUserById(expected.getId());
        assertNotEquals(expected.getModel(), actual);
        assertEquals(newEmailAddress, actual.getEmailAddress());
    }
}
