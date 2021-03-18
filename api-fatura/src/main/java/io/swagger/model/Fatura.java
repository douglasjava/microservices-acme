package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Fatura
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-03-18T00:43:26.400Z")


public class Fatura   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("codigoFatura")
  private Long codigoFatura = null;

  @JsonProperty("cliente")
  private Long cliente = null;

  @JsonProperty("dataLeitura")
  private OffsetDateTime dataLeitura = null;

  @JsonProperty("valorLeitura")
  private String valorLeitura = null;

  @JsonProperty("valorConta")
  private Integer valorConta = null;

  @JsonProperty("instalacao")
  private Long instalacao = null;

  public Fatura id(Long id) {
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

  public Fatura codigoFatura(Long codigoFatura) {
    this.codigoFatura = codigoFatura;
    return this;
  }

  /**
   * Get codigoFatura
   * @return codigoFatura
  **/
  @ApiModelProperty(value = "")


  public Long getCodigoFatura() {
    return codigoFatura;
  }

  public void setCodigoFatura(Long codigoFatura) {
    this.codigoFatura = codigoFatura;
  }

  public Fatura cliente(Long cliente) {
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

  public Fatura dataLeitura(OffsetDateTime dataLeitura) {
    this.dataLeitura = dataLeitura;
    return this;
  }

  /**
   * Get dataLeitura
   * @return dataLeitura
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDataLeitura() {
    return dataLeitura;
  }

  public void setDataLeitura(OffsetDateTime dataLeitura) {
    this.dataLeitura = dataLeitura;
  }

  public Fatura valorLeitura(String valorLeitura) {
    this.valorLeitura = valorLeitura;
    return this;
  }

  /**
   * Get valorLeitura
   * @return valorLeitura
  **/
  @ApiModelProperty(value = "")


  public String getValorLeitura() {
    return valorLeitura;
  }

  public void setValorLeitura(String valorLeitura) {
    this.valorLeitura = valorLeitura;
  }

  public Fatura valorConta(Integer valorConta) {
    this.valorConta = valorConta;
    return this;
  }

  /**
   * Get valorConta
   * @return valorConta
  **/
  @ApiModelProperty(value = "")


  public Integer getValorConta() {
    return valorConta;
  }

  public void setValorConta(Integer valorConta) {
    this.valorConta = valorConta;
  }

  public Fatura instalacao(Long instalacao) {
    this.instalacao = instalacao;
    return this;
  }

  /**
   * Get instalacao
   * @return instalacao
  **/
  @ApiModelProperty(value = "")


  public Long getInstalacao() {
    return instalacao;
  }

  public void setInstalacao(Long instalacao) {
    this.instalacao = instalacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fatura fatura = (Fatura) o;
    return Objects.equals(this.id, fatura.id) &&
        Objects.equals(this.codigoFatura, fatura.codigoFatura) &&
        Objects.equals(this.cliente, fatura.cliente) &&
        Objects.equals(this.dataLeitura, fatura.dataLeitura) &&
        Objects.equals(this.valorLeitura, fatura.valorLeitura) &&
        Objects.equals(this.valorConta, fatura.valorConta) &&
        Objects.equals(this.instalacao, fatura.instalacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, codigoFatura, cliente, dataLeitura, valorLeitura, valorConta, instalacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fatura {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    codigoFatura: ").append(toIndentedString(codigoFatura)).append("\n");
    sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
    sb.append("    dataLeitura: ").append(toIndentedString(dataLeitura)).append("\n");
    sb.append("    valorLeitura: ").append(toIndentedString(valorLeitura)).append("\n");
    sb.append("    valorConta: ").append(toIndentedString(valorConta)).append("\n");
    sb.append("    instalacao: ").append(toIndentedString(instalacao)).append("\n");
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

