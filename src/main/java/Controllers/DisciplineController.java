package Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.vlsu.lab72.api.DisciplineApi;
import ru.vlsu.lab72.model.Discipline;

import javax.validation.Valid;

@RestController
public class DisciplineController implements DisciplineApi {
    @Override
    public ResponseEntity<Discipline> addDiscipline(@Valid Discipline body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteDiscipline(Long disciplineId) {
        return null;
    }

    @Override
    public ResponseEntity<Discipline> getDisciplineById(Long disciplineId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateDiscipline(Long disciplineId, String name) {
        return null;
    }
}
