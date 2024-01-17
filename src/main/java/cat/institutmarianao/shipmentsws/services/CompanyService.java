package cat.institutmarianao.shipmentsws.services;

import cat.institutmarianao.shipmentsws.model.Company;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public interface CompanyService {

    List<Company> findAll(String fullName);

    Company getByUsername(@NotBlank String username);

    Company save(@NotNull @Valid Company user);

    Company update(@NotNull @Valid Company user);

    void deleteByUsername(@NotBlank String username);
}
