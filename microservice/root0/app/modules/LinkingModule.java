package modules;

import com.google.inject.AbstractModule;

/**
 * LinkingModule . Created at 8/31/2018 2:30 PM by @author Timur Isachenko
 * @isatimur | † be patient and test it! †
 */
public class LinkingModule extends AbstractModule {
    @Override
    protected void configure() {

        // Подключение всех необходимых сервисов, DAO и job-ов по образу:

//        bind(RateService.class).to(RateServiceImpl.class);

//        bind(UserDao.class).to(UserDaoImpl.class);

//        bind(ExpiredUserInviteCleanerJob.class).asEagerSingleton();
    }
}
