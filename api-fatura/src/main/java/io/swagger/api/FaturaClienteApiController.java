package io.swagger.api;

import io.swagger.model.Fatura;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-03-18T00:43:26.400Z")

@Controller
public class FaturaClienteApiController implements FaturaClienteApi {

    private static final Logger log = LoggerFactory.getLogger(FaturaClienteApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FaturaClienteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Fatura> buscaFaturaPorCpf(@ApiParam(value = "",required=true) @PathVariable("cpf") Long cpf) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Fatura>(objectMapper.readValue("{  \"cliente\" : 1,  \"valorLeitura\" : \"valorLeitura\",  \"instalacao\" : 5,  \"dataLeitura\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : 0,  \"valorConta\" : 5,  \"codigoFatura\" : 6}", Fatura.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Fatura>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Fatura>(HttpStatus.NOT_IMPLEMENTED);
    }

}
