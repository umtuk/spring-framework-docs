package The_IoC_Container.Annotation_based_Container_Configuration;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class SessionScopedService {
}
