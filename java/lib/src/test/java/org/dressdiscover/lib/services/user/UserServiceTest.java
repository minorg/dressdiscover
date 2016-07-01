package org.dressdiscover.lib.services.user;

import java.sql.SQLException;

import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.api.models.object.ObjectQuery;
import org.dressdiscover.api.models.user.User;
import org.dressdiscover.api.models.user.UserBookmark;
import org.dressdiscover.api.models.user.UserBookmarkEntry;
import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.models.user.UserId;
import org.dressdiscover.lib.CostumeProperties;
import org.dressdiscover.lib.services.ServiceTest;
import org.dressdiscover.lib.services.ServicesModule;
import org.dressdiscover.lib.services.user.IterableUserQueryService;
import org.dressdiscover.lib.services.user.JdbcUserCommandService;
import org.dressdiscover.lib.services.user.JdbcUserQueryService;
import org.dressdiscover.lib.stores.user.UserBookmarkJdbcTable;
import org.dressdiscover.lib.stores.user.UserJdbcTable;
import org.dressdiscover.testdata.TestData;
import org.junit.After;
import org.junit.Before;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;

public abstract class UserServiceTest extends ServiceTest {
    public static ImmutableList<UserEntry> postUsers(final UserCommandService userCommandService) throws Exception {
        final ImmutableList.Builder<UserEntry> userEntriesBuilder = ImmutableList.builder();
        for (final User user : TestData.getInstance().getUsers()) {
            userEntriesBuilder.add(new UserEntry(userCommandService.postUser(user), user));
        }
        return userEntriesBuilder.build();
    }

    @Before
    public void setUp() throws Exception {
        userCommandService = _getInjector().getInstance(UserCommandService.class);
        userQueryService = _getInjector().getInstance(IterableUserQueryService.class);
        tearDown();
    }

    @After
    public void tearDown() throws Exception {
        userCommandService.deleteUsers();
    }

    protected final ImmutableList<UserEntry> _getUsers() throws Exception {
        return ImmutableList.copyOf(userQueryService.getUsers());
    }

    @Override
    protected final ServicesModule _newServicesModule(final CostumeProperties properties) {
        return new ServicesModule(properties) {
            @Override
            protected void _configureUserCommandService() {
                bind(UserCommandService.class).to(JdbcUserCommandService.class);
            }

            @Override
            protected void _configureUserQueryService() {
                try {
                    bind(UserBookmarkJdbcTable.class).toInstance(
                            new UserBookmarkJdbcTable(properties, "jdbc:h2:mem:test_mem;DB_CLOSE_DELAY=-1"));
                    bind(UserJdbcTable.class)
                            .toInstance(new UserJdbcTable(properties, "jdbc:h2:mem:test_mem;DB_CLOSE_DELAY=-1"));
                } catch (final SQLException e) {
                    throw new IllegalStateException(e);
                }
                bind(IterableUserQueryService.class).to(JdbcUserQueryService.class);
                bind(UserQueryService.class).to(JdbcUserQueryService.class);
            }
        };
    }

    protected final ImmutableList<UserBookmarkEntry> _postObjectIdUserBookmarks(final UserId userId) throws Exception {
        final ImmutableList.Builder<UserBookmarkEntry> resultBuilder = ImmutableList.builder();
        for (int i = 0; i < 2; i++) {
            final UserBookmark userBookmark = UserBookmark.builder().setFolder("My folder")
                    .setName("Test bookmark " + i).setObjectId(ObjectId.parse("institution/collection/object" + i))
                    .setUserId(userId).build();
            resultBuilder.add(new UserBookmarkEntry(userCommandService.postUserBookmark(userBookmark), userBookmark));
        }
        return resultBuilder.build();
    }

    protected final ImmutableList<UserBookmarkEntry> _postObjectQueryUserBookmarks(final UserId userId)
            throws Exception {
        final ImmutableList.Builder<UserBookmarkEntry> resultBuilder = ImmutableList.builder();
        for (int i = 0; i < 2; i++) {
            final UserBookmark userBookmark = UserBookmark.builder().setFolder("My folder")
                    .setName("Test bookmark " + i)
                    .setObjectQuery(ObjectQuery.builder()
                            .setObjectIds(ImmutableSet.of(ObjectId.parse("institution/collection/object" + i))).build())
                    .setUserId(userId).build();
            resultBuilder.add(new UserBookmarkEntry(userCommandService.postUserBookmark(userBookmark), userBookmark));
        }
        return resultBuilder.build();
    }

    protected final ImmutableList<UserBookmarkEntry> _postUserBookmarks(final UserId userId) throws Exception {
        return ImmutableList.<UserBookmarkEntry> builder().addAll(_postObjectIdUserBookmarks(userId))
                .addAll(_postObjectQueryUserBookmarks(userId)).build();
    }

    protected final ImmutableList<UserEntry> _postUsers() throws Exception {
        return postUsers(userCommandService);
    }

    protected UserCommandService userCommandService;
    protected IterableUserQueryService userQueryService;
}
