package net.lab1318.costume.lib.services.user;

import org.junit.After;
import org.junit.Before;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.lib.services.ServiceTest;
import net.lab1318.costume.lib.services.TestData;

public abstract class UserServiceTest extends ServiceTest {
    public static ImmutableList<UserEntry> putUsers(final UserCommandService userCommandService) throws Exception {
        for (final UserEntry entry : TestData.getInstance().getUsers()) {
            userCommandService.putUser(entry.getId(), entry.getModel());
        }
        return TestData.getInstance().getUsers();
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

    protected final ImmutableList<UserEntry> _putUsers() throws Exception {
        return putUsers(userCommandService);
    }

    protected UserCommandService userCommandService;
    protected IterableUserQueryService userQueryService;
}
