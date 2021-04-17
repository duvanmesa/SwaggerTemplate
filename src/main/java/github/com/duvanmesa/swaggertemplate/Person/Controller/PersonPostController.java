package github.com.duvanmesa.swaggertemplate.Person.Controller;

import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

final class PersonPostController {

    @PostMapping(value = "/UpdatePerson",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updatePerson(
            @ApiParam(value="Identificador de Person", required = true)@RequestHeader("id") String id,
            @ApiParam(value="body",required = true)@RequestBody String body
    )
    {
        return new ResponseEntity<>("Usuario Actualizado", HttpStatus.OK);
    }
}
