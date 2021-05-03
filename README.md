# Play! Framework Landing page

## Area sobre a empresa
![](https://raw.githubusercontent.com/antonioalmeidab/play-landing-page/main/about.png)

## Área dos produtos
 A lista de produtos é obtida pelo back-end, onde é simulado um banco de dados com ArrayLists. Como pode ser visto no **app/DataController.java**
![](https://raw.githubusercontent.com/antonioalmeidab/play-landing-page/main/products.png)

```java
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
```

## Área do "Faturamento"
Essa área contém um gráfico do patrimônio total gerido pelo fundo de investimento. O gráfico foi gerado com ChartJS e dados simulados do back-end também simulados como ArrayList. Também pode ser visto no **app/DataController.java**
![](https://raw.githubusercontent.com/antonioalmeidab/play-landing-page/main/revenue.png)

```java
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
                
        ...
        
        
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
```
