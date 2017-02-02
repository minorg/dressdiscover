package org.dressdiscover.lib.services.user;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.dressdiscover.api.models.user.User;
import org.dressdiscover.api.models.user.UserBookmarkEntry;
import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.services.user.DuplicateUserBookmarkException;
import org.dressdiscover.api.services.user.NoSuchUserException;
import org.dressdiscover.testdata.TestData;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

public final class JdbcUserCommandServiceTest extends UserServiceTest {
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

        try {
            _postObjectIdUserBookmarks(userEntry.getId());
            fail();
        } catch (final DuplicateUserBookmarkException e) {
        }

        try {
            _postObjectQueryUserBookmarks(userEntry.getId());
            fail();
        } catch (final DuplicateUserBookmarkException e) {
        }
    }

    @Test
    public void testPutUser() throws Exception {
        assertEquals(0, _getUsers().size());
        final UserEntry expected = _postUsers().iterator().next();
        final String newEmailAddress = "testother@example.com";
        userCommandService.putUser(expected.getId(),
                User.builder(expected.getModel()).setEmailAddress(newEmailAddress).build());
        final User actual = userQueryService.getUserById(expected.getId());
        assertNotEquals(expected.getModel(), actual);
        assertEquals(newEmailAddress, actual.getEmailAddress());
    }
}
