package br.com.catalisa.stockz.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FornecedorDTO {
    @NotEmpty(message = "Nome do fornecedor não pode ser vazio.")
    private String nome;

    @Email(message = "Digite um email válido. Exemplo: seunome@example.com")
    @NotEmpty(message = "Email não pode estar vazio.")
    private String email;
}
