/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Fatura;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-03-18T00:43:26.400Z")

@Validated
@Api(value = "fatura", description = "the fatura API")
@RequestMapping(value = "")
public interface FaturaApi {

    @ApiOperation(value = "Adicionar um nova Fatura", nickname = "addFatura", notes = "", tags={ "Fatura", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/fatura",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addFatura(@ApiParam(value = "Adicionar Cliente" ,required=true )  @Valid @RequestBody Fatura body);


    @ApiOperation(value = "Busca Faturas por Código", nickname = "buscaFaturaPorCodigo", notes = "", response = Fatura.class, tags={ "Fatura", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Fatura.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Fatura not found") })
    @RequestMapping(value = "/fatura/{codigo}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Fatura> buscaFaturaPorCodigo(@ApiParam(value = "",required=true) @PathVariable("codigo") Long codigo);


    @ApiOperation(value = "Buscar todos as faturas", nickname = "buscaTodasFaturas", notes = "", response = Fatura.class, tags={ "Fatura", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Fatura.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Fatura not found") })
    @RequestMapping(value = "/fatura",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Fatura> buscaTodasFaturas();

}
