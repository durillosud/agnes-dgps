package br.com.gpds.domain.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

@Validated
@Valid
public record ProjectUpdateRequest(
    @Schema(description = "Identificador do projeto `ignorado ao criar, requerido ao atualizar`") @NotNull Long id,
    @Schema(description = "Descrição do projeto") @Length(min = 3, max = 1024) @NotBlank @NotNull String description,
    @Schema(description = "Idendificador do status do projeto") @NotNull Long statusId,
    @Schema(description = "Idendificador do time de desenvolvimento responsável pelo projeto") @NotNull Long teamId,
    @Schema(description = "Identificador do Product Owner (cliente) do projeto") @NotNull Long customerId
) {
}
