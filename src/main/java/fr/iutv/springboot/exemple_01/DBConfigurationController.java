package fr.iutv.springboot.exemple_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "configurations/database")
public class DBConfigurationController {

    @Autowired
    private DbConfiguration dbConfiguration;

    @GetMapping("/host")
    public String getDbHost(){
        return "host : "+this.dbConfiguration.getHost();
    }

    @GetMapping("/port")
    public String getDbPort(){
        return "port : "+this.dbConfiguration.getPort();
    }

    @GetMapping("/name")
    public String getDbName(){
        return "name : "+this.dbConfiguration.getName();
    }

    @GetMapping(value = "/all", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "host", dbConfiguration.getHost(),
                "port", dbConfiguration.getPort(),
                "name", dbConfiguration.getName()));
    }
}
