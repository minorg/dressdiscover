package net.lab1318.costume.lib.services.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.lib.services.TestData;

public final class UserQueryServiceTest extends UserServiceTest {
    @Test
    public void testGetUserById() throws Exception {
        final ImmutableList<UserEntry> expected = _postUsers();
        for (final UserEntry entry : expected) {
            assertEquals(entry.getModel(), userQueryService.getUserById(entry.getId()));
        }
    }

    @Test
    public void testGetUsers() throws Exception {
        final ImmutableList<UserEntry> expected = _postUsers();
        final ImmutableList<UserEntry> actual = _getUsers();
        assertEquals(TestData.getInstance().getUsers().size(), actual.size());
        for (final UserEntry expectedEntry : expected) {
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
