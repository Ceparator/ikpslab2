package Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.vlsu.lab72.api.YmkApi;
import ru.vlsu.lab72.model.YMK;

import javax.validation.Valid;

@RestController
public class YmkController implements YmkApi {
    @Override
    public ResponseEntity<YMK> addYMK(@Valid YMK body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteYMK(Long ymkId) {
        return null;
    }

    @Override
    public ResponseEntity<YMK> getYMKById(Long ymkId) {
        return null;
    }
}
