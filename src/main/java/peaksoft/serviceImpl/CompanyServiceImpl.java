package peaksoft.serviceImpl;

import peaksoft.dao.CompanyDao;
import peaksoft.daoImpl.CompanyDaoImpl;
import peaksoft.entity.Company;
import peaksoft.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
    CompanyDao companyDao = new CompanyDaoImpl();


    @Override
    public void createCompany() {
        companyDao.createCompanyTable();
    }

    @Override
    public void saveCompany(Company company) {
        companyDao.saveCompany(company);

    }

    @Override
    public void deleteCompanyById(Long id) {
        companyDao.deleteCompanyById(id);

    }
}
