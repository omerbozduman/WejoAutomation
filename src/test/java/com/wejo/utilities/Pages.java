package com.wejo.utilities;

import com.wejo.pages.*;

public class Pages {

    private HomePage homePage;
    private ProductsServicesPage productsServicesPage;
    private WhyWejoPage whyWejoPage;
    private NewsroomPage newsroomPage;


    public HomePage homePage(){
        if(homePage==null){
            homePage = new HomePage();
        }
        return homePage;
    }
    public ProductsServicesPage productsServicesPage(){
        if(productsServicesPage==null){
            productsServicesPage= new ProductsServicesPage();
        }
        return productsServicesPage;
    }

    public WhyWejoPage whyWejoPage(){
        if(whyWejoPage==null){
            whyWejoPage= new WhyWejoPage();
        }
        return whyWejoPage;
    }

    public NewsroomPage newsroomPage(){
        if(newsroomPage==null){
            newsroomPage = new NewsroomPage();
        }
        return newsroomPage;
    }

}
