package guru.springframework.sfgdi.repositories;

/**
 * @author iftakhar.ahmed
 * @since 11/14/21
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}