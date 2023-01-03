package The_IoC_Container.Customizing_the_Nature_of_a_Bean;

import org.springframework.beans.factory.InitializingBean;

public class InitializingExampleBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        // do some initialization work
    }
}
