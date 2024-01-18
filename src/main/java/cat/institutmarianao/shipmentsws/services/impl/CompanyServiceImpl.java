package cat.institutmarianao.shipmentsws.services.impl;

import cat.institutmarianao.shipmentsws.exception.NotFoundException;
import cat.institutmarianao.shipmentsws.model.Company;
import cat.institutmarianao.shipmentsws.repositories.CompanyRepository;
import cat.institutmarianao.shipmentsws.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company getById(Long id) {
        return companyRepository.findById(id).orElseThrow(NotFoundException::new);
    }
}
