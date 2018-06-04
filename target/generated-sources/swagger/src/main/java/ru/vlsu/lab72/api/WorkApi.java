/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ru.vlsu.lab72.api;

import ru.vlsu.lab72.model.Work;

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

@Api(value = "work", description = "the work API")
public interface WorkApi {

    @ApiOperation(value = "Add work to the list", notes = "adding work", response = Work.class, tags={ "work", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Work.class),
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    
    @RequestMapping(value = "/work",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Work> addWork(@ApiParam(value = "Work object that needs to be added" ,required=true )  @Valid @RequestBody Work body) {
        // do some magic!
        return new ResponseEntity<Work>(HttpStatus.OK);
    }


    @ApiOperation(value = "Deletes a work", notes = "", response = Void.class, tags={ "work", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Work not found", response = Void.class) })
    
    @RequestMapping(value = "/work/delete/{workId}",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> deleteWork(@ApiParam(value = "Work id to delete",required=true ) @PathVariable("workId") Long workId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Find work by ID", notes = "Returns a single work", response = Work.class, tags={ "work", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Work.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "Work not found", response = Void.class) })
    
    @RequestMapping(value = "/work/{workId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Work> getWorkById(@ApiParam(value = "ID of work to return",required=true ) @PathVariable("workId") Long workId) {
        // do some magic!
        return new ResponseEntity<Work>(HttpStatus.OK);
    }

}
