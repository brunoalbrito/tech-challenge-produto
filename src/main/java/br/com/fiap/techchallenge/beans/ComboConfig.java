package br.com.fiap.techchallenge.beans;

import br.com.fiap.techchallenge.application.gateways.ComboGateway;
import br.com.fiap.techchallenge.application.gateways.ProdutoGateway;
import br.com.fiap.techchallenge.application.usecases.combo.CriaComboInteractor;
import br.com.fiap.techchallenge.application.usecases.combo.ListaComboInteractor;
import br.com.fiap.techchallenge.infrastructure.controllers.mappers.ComboDtoMapper;
import br.com.fiap.techchallenge.infrastructure.persistence.gateways.ComboRepositoryGateway;
import br.com.fiap.techchallenge.infrastructure.persistence.repository.ComboRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComboConfig {

    @Bean
    CriaComboInteractor criaComboInteractor(ComboGateway comboGateway, ProdutoGateway produtoGateway) {
        return new CriaComboInteractor(comboGateway, produtoGateway);
    }

    @Bean
    ListaComboInteractor listaComboInteractor(ComboGateway comboGateway) {
        return new ListaComboInteractor(comboGateway);
    }

    @Bean
    ComboGateway comboGateway(ComboRepository comboRepository) {
        return new ComboRepositoryGateway(comboRepository);
    }

    @Bean
    ComboDtoMapper comboDtoMapper() {
        return new ComboDtoMapper();
    }
}