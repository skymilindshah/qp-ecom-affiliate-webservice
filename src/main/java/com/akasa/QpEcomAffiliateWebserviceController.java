package com.akasa;

import io.micronaut.http.annotation.*;

@Controller("/qp-ecom-affiliate-webservice")
public class QpEcomAffiliateWebserviceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}