package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author iftakhar.ahmed
 * @since 11/14/21
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {

    public PrototypeBean(){
        System.out.println("Creating a Prototype Bean!!!!");
    }

    public String getMyScope(){
        return "I am a prototype";
    }
}