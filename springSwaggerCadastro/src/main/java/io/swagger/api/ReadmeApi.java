/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-08-19T02:52:12.827Z")

@Api(value = "readme", description = "the readme API")
public interface ReadmeApi {

    @ApiOperation(value = "Recupera readme da API.", nickname = "readme", notes = "Esta operação retorna o read da API.", tags={ "API", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucesso ao recuperar o readme da API."),
        @ApiResponse(code = 500, message = "Erro interno ao tentar recuperar o readme da API.") })
    @RequestMapping(value = "/readme",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<String> readme();

}
