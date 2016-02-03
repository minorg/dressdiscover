package net.lab1318.costume.lib.services.user;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.thryft.native_.EmailAddress;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserBookmarkEntry;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.lib.services.TestData;

public final class UserCommandServiceTest extends UserServiceTest {
    @Test
    public void testDeleteUserBookmarkById() throws Exception {
        final UserEntry userEntry = _postUsers().get(0);
        final ImmutableList<UserBookmarkEntry> expected = _postUserBookmarks(userEntry.getId());
        assertThat(expected.size(), greaterThan(1));
        for (final UserBookmarkEntry userBookmarkEntry : expected) {
            userCommandService.deleteUserBookmarkById(userBookmarkEntry.getId());
            break;
        }
        assertEquals(expected.size() - 1, userQueryService.getUserBookmarksByUserId(userEntry.getId()).size());
    }

    @Test
    public void testDeleteUserById() throws Exception {
        assertEquals(0, _getUsers().size());
        {
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
        assertEquals(0, _getUsers().size());
        {
            final ImmutableList<UserEntry> expected = _postUsers();
            for (final UserEntry userEntry : expected) {
                _postUserBookmarks(userEntry.getId());
                assertThat(userQueryService.getUserBookmarksByUserId(userEntry.getId()), not(empty()));
                userCommandService.deleteUserById(userEntry.getId());
                // Deleting the user should delete associated bookmarks
                assertThat(userQueryService.getUserBookmarksByUserId(userEntry.getId()), empty());
                break;
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
    public void testPostUserBookmark() throws Exception {
        final UserEntry userEntry = _postUsers().get(0);
        _postUserBookmarks(userEntry.getId());
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
