package The_IoC_Container.Customizing_the_Nature_of_a_Bean;

import org.springframework.beans.factory.DisposableBean;

public class DisposableExampleBean implements DisposableBean {
    @Override
    public void destroy() throws Exception {
        // do some destruction work (like releasing pooled connections)
    }
}
