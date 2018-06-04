package Controllers;

import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.vlsu.lab72.api.SpecialityApi;
import ru.vlsu.lab72.model.Speciality;

import javax.validation.Valid;

@RestController
public class SpecialityController {


    @RequestMapping(value = "/speciality",
            produces = { "application/json" },
            consumes = { "application/json" },
            method = RequestMethod.POST)
    public ResponseEntity<Speciality> addSpeciality(@ApiParam(value = "Speciality object that needs to be added" ,required=true )  @Valid @RequestBody Speciality body) {
        Speciality spec = new Speciality();
        spec.setCode(body.getCode());
        spec.setName(body.getName());
        return ResponseEntity.accepted().body(spec);
    }

    @Override
    public ResponseEntity<Void> deleteSpeciality(Long specialityId) {
        return null;
    }

    @Override
    public ResponseEntity<Speciality> getSpecialityById(Long specialityId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateSpeciality(Long specialityId, String name, Long code) {
        return null;
    }
}
