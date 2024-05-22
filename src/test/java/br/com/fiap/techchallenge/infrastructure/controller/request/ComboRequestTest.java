package br.com.fiap.techchallenge.infrastructure.controller.request;

import br.com.fiap.techchallenge.infrastructure.controllers.request.ProdutoRequest;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(staticName = "criaComboRequestTest")
public class ComboRequestTest {
    private List<ProdutoRequest> produtos;
}