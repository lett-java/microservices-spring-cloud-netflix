package br.com.flettieri.crud.data.vo;

import java.io.Serializable;

import org.modelmapper.ModelMapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import br.com.flettieri.crud.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder({"id", "nome", "estoque", "preco"})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProdutoVO implements Serializable {

	private static final long serialVersionUID = 8944902505598406678L;

	@EqualsAndHashCode.Include
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("nome")
	private String nome;

	@JsonProperty("estoque")
	private Integer estoque;
	
	@JsonProperty("preco")
	private Double preco;
	
	public static ProdutoVO create(Produto produto) {
		return new ModelMapper().map(produto, ProdutoVO.class);
	}
}
