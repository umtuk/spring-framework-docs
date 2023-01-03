package The_IoC_Container.Bean_Scopes;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
public class LoginAction {
    // do something ...
}
