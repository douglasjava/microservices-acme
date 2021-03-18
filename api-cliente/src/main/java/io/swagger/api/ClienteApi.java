/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Cliente;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-03-18T00:40:25.494Z")

@Validated
@Api(value = "cliente", description = "the cliente API")
@RequestMapping(value = "")
public interface ClienteApi {

    @ApiOperation(value = "Adicionar um novo cliente", nickname = "addCliente", notes = "", tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/cliente",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addCliente(@ApiParam(value = "Adicionar Cliente" ,required=true )  @Valid @RequestBody Cliente body);


    @ApiOperation(value = "Busca Clientes por CPF", nickname = "buscaClientePorCpf", notes = "", response = Cliente.class, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Cliente.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "cliente not found") })
    @RequestMapping(value = "/cliente/{cpf}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Cliente> buscaClientePorCpf(@ApiParam(value = "",required=true) @PathVariable("cpf") Long cpf);


    @ApiOperation(value = "Buscar todos os clientes", nickname = "buscaTodos", notes = "", response = Cliente.class, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Cliente.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "cliente not found") })
    @RequestMapping(value = "/cliente",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Cliente> buscaTodos();

}
