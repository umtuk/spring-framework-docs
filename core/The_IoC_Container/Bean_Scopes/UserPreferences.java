package The_IoC_Container.Bean_Scopes;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Component
public class UserPreferences {
    // do something ...
}
