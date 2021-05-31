//package ua.lviv.iot.controller;
//
//import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
//import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//
//@Component
//@Endpoint(id="healthcheck")
//public class HealthCheckController {
//
//    @ReadOperation
//    public HttpStatus healthcheck() {
//
//        return HttpStatus.OK;
//    }
//}

package ua.lviv.iot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HealthCheckController {
    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    public ResponseEntity healthCheckResponse() {
        return new ResponseEntity<>("Healthy", HttpStatus.OK);
    }
}