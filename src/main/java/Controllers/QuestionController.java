package Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.vlsu.lab72.api.QuestionApi;
import ru.vlsu.lab72.model.Question;

import javax.validation.Valid;

@RestController
public class QuestionController implements QuestionApi {
    @Override
    public ResponseEntity<Question> addQuestion(@Valid Question body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteQuestion(Long questionId) {
        return null;
    }

    @Override
    public ResponseEntity<Question> getQuestionById(Long questionId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateQuestion(Long questionId, String question) {
        return null;
    }
}
