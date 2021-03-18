package io.swagger.api;

import io.swagger.model.Instalacao;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-03-18T00:44:08.387Z")

@Controller
public class InstalacaoApiController implements InstalacaoApi {

    private static final Logger log = LoggerFactory.getLogger(InstalacaoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InstalacaoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addInstalacao(@ApiParam(value = "Adicionar Instalação" ,required=true )  @Valid @RequestBody Instalacao body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Instalacao> buscaInstalacaoPorCodigo(@ApiParam(value = "",required=true) @PathVariable("codigo") Long codigo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Instalacao>(objectMapper.readValue("{  \"cliente\" : 6,  \"enderecoCobranca\" : {    \"cidade\" : \"cidade\",    \"complemento\" : \"complemento\",    \"numero\" : 5,    \"logradouro\" : \"logradouro\",    \"bairro\" : \"bairro\",    \"id\" : 1,    \"cep\" : \"cep\"  },  \"id\" : 0,  \"dataInstalacao\" : \"2000-01-23T04:56:07.000+00:00\"}", Instalacao.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Instalacao>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Instalacao>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Instalacao> buscaTodasInstalacao() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Instalacao>(objectMapper.readValue("{  \"cliente\" : 6,  \"enderecoCobranca\" : {    \"cidade\" : \"cidade\",    \"complemento\" : \"complemento\",    \"numero\" : 5,    \"logradouro\" : \"logradouro\",    \"bairro\" : \"bairro\",    \"id\" : 1,    \"cep\" : \"cep\"  },  \"id\" : 0,  \"dataInstalacao\" : \"2000-01-23T04:56:07.000+00:00\"}", Instalacao.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Instalacao>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Instalacao>(HttpStatus.NOT_IMPLEMENTED);
    }

}
