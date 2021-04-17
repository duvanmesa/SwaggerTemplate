package github.com.duvanmesa.swaggertemplate.Person.Controller;


import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

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
final class PersonGetController {

    @GetMapping(value="/GetPersonHistorical",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getPersonHistorical(@RequestBody String body){
        return new ResponseEntity<>("El usuario: "+body + "No esta autorizado", HttpStatus.UNAUTHORIZED);
    }

    @GetMapping(value="/GetPersonById",produces = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<String> getPersonById(@RequestParam String id){
        return new ResponseEntity<>("El Usuario: "+id,HttpStatus.SERVICE_UNAVAILABLE);
    }

}
