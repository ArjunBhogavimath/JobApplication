package com.ArjunCode.jobapp.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();

    boolean updateCompany(Company updatedCompany, Long id);
    Company getCompanyById();
    String deleteCompany();

    void createCompany(Company company);
}
