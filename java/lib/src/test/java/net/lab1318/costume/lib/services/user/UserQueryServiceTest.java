package net.lab1318.costume.lib.services.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.lib.services.TestData;

public abstract class UserQueryServiceTest extends UserServiceTest {
    @Test
    public void testGetUserById() throws Exception {
        _putUsers();
        for (final UserEntry entry : TestData.getInstance().getUsers()) {
            assertEquals(entry.getModel(), userQueryService.getUserById(entry.getId()));
        }
    }

    @Test
    public void testGetUsers() throws Exception {
        _putUsers();
        final ImmutableList<UserEntry> actual = _getUsers();
        assertEquals(TestData.getInstance().getUsers().size(), actual.size());
        for (final UserEntry expectedEntry : TestData.getInstance().getUsers()) {
            boolean found = false;
            for (final UserEntry actualEntry : actual) {
                if (actualEntry.getId().equals(expectedEntry.getId())) {
                    found = true;
                    assertEquals(expectedEntry.getModel(), actualEntry.getModel());
                    break;
                }
            }
            assertTrue(found);
        }
    }
}
