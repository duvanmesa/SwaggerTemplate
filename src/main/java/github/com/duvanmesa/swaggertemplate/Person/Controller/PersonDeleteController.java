package github.com.duvanmesa.swaggertemplate.Person.Controller;


import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Accion exitosa"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 501, message = "Not Implemented"),
        @ApiResponse(code = 502, message = "Bad Gateway"),
        @ApiResponse(code = 503, message = "Service Unavailable"),
        @ApiResponse(code = 504, message = "Gateway Timeout"),
        @ApiResponse(code = 505, message = "HTTP Version Not Supported"),
        @ApiResponse(code = 400, message = "Bad request")
})
public class PersonDeleteController {
    @DeleteMapping(value = "/DeletePerson",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deletePerson(
            @ApiParam(value="Identificador de Person", required = true)@RequestHeader("id") String id,
            @ApiParam(value="body",required = true)@RequestBody String body
            )
    {
        return new ResponseEntity<>("Usuario Eliminado", HttpStatus.OK);
    }
}
