package peaksoft;

import peaksoft.entity.*;
import peaksoft.service.*;
import peaksoft.serviceImpl.*;
import peaksoft.util.Util;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        CarService carService = new CarServiceImpl();
        CompanyService companyService = new CompanyServiceImpl();
        GarageService garageService = new GarageServiceImpl();
        PersonService personService = new PersonServiceImpl();
        SocialMediaService socialMediaService = new SocialMediaServiceImpl();


//        Car car = new Car("mers","kg");
//        carService.saveCar(car,1L,1L);
//
//        Company company = new Company("Peaksoft","Kyrgyztan");
//        companyService.saveCompany(company);
////
//        Garage garage = new Garage("sfsd","hjbg");
//        garageService.saveGarage(garage,2L);
//
//        Person person = new Person("Mahamatjan",16,"mahamatjan@gmail.com","Male");
//        personService.savePersonTable(person,2L);
//
//        SocialMedia socialMedia = new SocialMedia("sdfsdfsdf");
//        socialMediaService.saveSocialMedia(socialMedia);

        carService.deleteCarById(1L);

    }
}
