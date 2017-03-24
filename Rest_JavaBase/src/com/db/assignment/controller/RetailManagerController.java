package com.db.assignment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.assignment.model.RetailManager;

@RestController
public class RetailManagerController {  
    
   
    @RequestMapping("/retailManager")
    public RetailManager retailManager(@RequestParam(value="shopAddNum", defaultValue="shopAddNum") String shopAddNum,@RequestParam(value="shopName", defaultValue="World") String name,@RequestParam(value="postcode", defaultValue="postcode") String postcode) {
    	
    	return new RetailManager(shopAddNum,
                name,postcode);
        /*return new RetailManagerShop(shopAddNum,
                             name,postcode,shopLongitude,shopLatitude);*/
    }
    
    
    /*private static IpAddressLookupData _getResponse(String uri) throws IOException {
    	uri= "https://geocoder.cit.api.here.com/6.2/geocode.json?searchtext=200%20S%20Mathilda%20Sunnyvale%20CA&app_ id=DemoAppId01082013GAL&app_code=AJKnXv84fjrb0KIHawS0Tg&gen=8";

    	  HttpClient client = new HttpClient();
    	  GetMethod get = new GetMethod(uri);

    	  client.executeMethod(get);

    	  String respStr = get.getResponseBodyAsString();

    	  return new IpAddressLookupData(respStr);
    	}*/
}
