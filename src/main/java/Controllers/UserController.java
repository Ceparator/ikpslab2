package Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.vlsu.lab72.api.UserApi;
import ru.vlsu.lab72.model.User;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController implements UserApi {
    @Override
    public ResponseEntity<Void> createUser(@Valid User body) {
        return null;
    }

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        return null;
    }

    @Override
    public ResponseEntity<List<User>> getUsersInRole(String rolename) {
        return null;
    }
}
