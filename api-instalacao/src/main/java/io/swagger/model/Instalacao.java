package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Endereco;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Instalacao
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-03-18T00:44:08.387Z")


public class Instalacao   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("cliente")
  private Long cliente = null;

  @JsonProperty("dataInstalacao")
  private OffsetDateTime dataInstalacao = null;

  @JsonProperty("enderecoCobranca")
  private Endereco enderecoCobranca = null;

  public Instalacao id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Instalacao cliente(Long cliente) {
    this.cliente = cliente;
    return this;
  }

  /**
   * Get cliente
   * @return cliente
  **/
  @ApiModelProperty(value = "")


  public Long getCliente() {
    return cliente;
  }

  public void setCliente(Long cliente) {
    this.cliente = cliente;
  }

  public Instalacao dataInstalacao(OffsetDateTime dataInstalacao) {
    this.dataInstalacao = dataInstalacao;
    return this;
  }

  /**
   * Get dataInstalacao
   * @return dataInstalacao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDataInstalacao() {
    return dataInstalacao;
  }

  public void setDataInstalacao(OffsetDateTime dataInstalacao) {
    this.dataInstalacao = dataInstalacao;
  }

  public Instalacao enderecoCobranca(Endereco enderecoCobranca) {
    this.enderecoCobranca = enderecoCobranca;
    return this;
  }

  /**
   * Get enderecoCobranca
   * @return enderecoCobranca
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Endereco getEnderecoCobranca() {
    return enderecoCobranca;
  }

  public void setEnderecoCobranca(Endereco enderecoCobranca) {
    this.enderecoCobranca = enderecoCobranca;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instalacao instalacao = (Instalacao) o;
    return Objects.equals(this.id, instalacao.id) &&
        Objects.equals(this.cliente, instalacao.cliente) &&
        Objects.equals(this.dataInstalacao, instalacao.dataInstalacao) &&
        Objects.equals(this.enderecoCobranca, instalacao.enderecoCobranca);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cliente, dataInstalacao, enderecoCobranca);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instalacao {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
    sb.append("    dataInstalacao: ").append(toIndentedString(dataInstalacao)).append("\n");
    sb.append("    enderecoCobranca: ").append(toIndentedString(enderecoCobranca)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

