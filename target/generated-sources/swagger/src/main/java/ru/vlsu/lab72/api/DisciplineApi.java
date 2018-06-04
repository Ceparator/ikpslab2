/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ru.vlsu.lab72.api;

import ru.vlsu.lab72.model.Discipline;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-21T15:09:33.921+03:00")

@Api(value = "discipline", description = "the discipline API")
public interface DisciplineApi {

    @ApiOperation(value = "Add discipline to the university", notes = "adding discipline", response = Discipline.class, tags={ "discipline", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Discipline.class),
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    
    @RequestMapping(value = "/discipline",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Discipline> addDiscipline(@ApiParam(value = "Discipline object that needs to be added" ,required=true )  @Valid @RequestBody Discipline body) {
        // do some magic!
        return new ResponseEntity<Discipline>(HttpStatus.OK);
    }


    @ApiOperation(value = "Deletes a discipline", notes = "", response = Void.class, tags={ "discipline", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Discipline not found", response = Void.class) })
    
    @RequestMapping(value = "/discipline/delete/{disciplineId}",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> deleteDiscipline(@ApiParam(value = "Discipline id to delete",required=true ) @PathVariable("disciplineId") Long disciplineId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Find discipline by ID", notes = "Returns a single discipline", response = Discipline.class, tags={ "discipline", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Discipline.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Discipline not found", response = Void.class) })
    
    @RequestMapping(value = "/discipline/{disciplineId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Discipline> getDisciplineById(@ApiParam(value = "ID of discipline to return",required=true ) @PathVariable("disciplineId") Long disciplineId) {
        // do some magic!
        return new ResponseEntity<Discipline>(HttpStatus.OK);
    }


    @ApiOperation(value = "Updates a discipline", notes = "", response = Void.class, tags={ "discipline", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    
    @RequestMapping(value = "/discipline/{disciplineId}",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> updateDiscipline(@ApiParam(value = "ID of discipline that needs to be updated",required=true ) @PathVariable("disciplineId") Long disciplineId,@ApiParam(value = "Updated name of the discipline", required=true) @RequestPart(value="name", required=true)  String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
