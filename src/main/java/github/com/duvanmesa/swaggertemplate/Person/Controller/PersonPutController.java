package github.com.duvanmesa.swaggertemplate.Person.Controller;


import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Accion exitosa"),
        @ApiResponse(code = 500, message = "Internal Server Error"),
        @ApiResponse(code = 501, message = "Not Implemented"),
        @ApiResponse(code = 502, message = "Bad Gateway"),
        @ApiResponse(code = 503, message = "Service Unavailable"),
        @ApiResponse(code = 504, message = "Gateway Timeout"),
        @ApiResponse(code = 505, message = "HTTP Version Not Supported")
})
final class PersonPutController {

    @PutMapping(value = "/PersonSingUpper", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> putPersonSignUpper(@RequestBody String body){
        System.out.println(body);
        return new ResponseEntity<>("Exitoso",HttpStatus.OK);
    }

}
