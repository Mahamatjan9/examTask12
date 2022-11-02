package peaksoft.dao;

import peaksoft.entity.Company;

public interface CompanyDao {

    void createCompanyTable();

    void saveCompany(Company company);

    void deleteCompanyById(Long id);
}
