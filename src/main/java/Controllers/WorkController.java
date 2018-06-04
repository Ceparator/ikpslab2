package Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.vlsu.lab72.api.WorkApi;
import ru.vlsu.lab72.model.Work;

import javax.validation.Valid;

@RestController
public class WorkController implements WorkApi {
    @Override
    public ResponseEntity<Work> addWork(@Valid Work body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteWork(Long workId) {
        return null;
    }

    @Override
    public ResponseEntity<Work> getWorkById(Long workId) {
        return null;
    }
}
