package controllers;

import models.ContactInfo;
import models.Product;
import models.Revenue;

import java.time.Period;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class DataController {
    public List<Product> productsList;
    public List<Revenue> monthlyRevenue;
    public ContactInfo contactInfo;

    public List<Product> getProductsList() {
        return productsList;
    }

    public List<Revenue> getLast6MonthsRevenue() {
        List<Revenue> lastMonthsRevenue = new ArrayList<>();
        YearMonth nowYearMonth = YearMonth.now();
        YearMonth sixMonthsAgo = nowYearMonth.minus(Period.ofMonths(7));


        for (Revenue revenue : this.monthlyRevenue) {
            if (revenue.yearMonth.isAfter(sixMonthsAgo)) {
                lastMonthsRevenue.add(revenue);
            }
        }

        return lastMonthsRevenue;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
    public DataController() {
        this.productsList = new ArrayList<>();
        this.productsList.add(new Product(
                "Safe",
                "Renda fixa",
                "Fundo de ativos de renda fixa. Focado em investidores que desejam baixos riscos."));
        this.productsList.add(new Product(
                "Multiple",
                "Ações",
                "Fundo de ações de ativos nacionais. Para quem deseja se expor ao mercado financeiro."));
        this.productsList.add(new Product(
                "World",
                "Internacional",
                "Fundo de ações de ativos internacionais. Opção para quem deseja expandir os horizontes."));

        this.contactInfo = new ContactInfo(
                "(81) 99876-1234",
                "contato@play.com.br",
                "Rua XPTO, 123");

        this.monthlyRevenue = new ArrayList<>();
        this.monthlyRevenue.add(new Revenue(
                12.1,
                4,
                2020));
        this.monthlyRevenue.add(new Revenue(
                13.231,
                5,
                2020));
        this.monthlyRevenue.add(new Revenue(
                13.1,
                6,
                2020));
        this.monthlyRevenue.add(new Revenue(
                16.2,
                7,
                2020));
        this.monthlyRevenue.add(new Revenue(
                14.731,
                8,
                2020));
        this.monthlyRevenue.add(new Revenue(
                17.4,
                9,
                2020));
        this.monthlyRevenue.add(new Revenue(
                17.13,
                10,
                2020));
        this.monthlyRevenue.add(new Revenue(
                17.9,
                11,
                2020));
        this.monthlyRevenue.add(new Revenue(
                22.3,
                12,
                2020));
        this.monthlyRevenue.add(new Revenue(
                21.84,
                1,
                2021));
        this.monthlyRevenue.add(new Revenue(
                23.04,
                2,
                2021));
        this.monthlyRevenue.add(new Revenue(
                26.1,
                3,
                2021));
        this.monthlyRevenue.add(new Revenue(
                26.61,
                4,
                2021));
    }




}
