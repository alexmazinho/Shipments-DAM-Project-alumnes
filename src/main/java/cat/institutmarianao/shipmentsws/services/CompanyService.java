package cat.institutmarianao.shipmentsws.services;

import cat.institutmarianao.shipmentsws.model.Company;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public interface CompanyService {
    List<Company> findAll();

    Company getById(@NotBlank Long id);
}
