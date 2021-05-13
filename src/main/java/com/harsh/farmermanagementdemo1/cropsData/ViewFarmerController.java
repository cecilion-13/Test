package com.harsh.farmermanagementdemo1.cropsData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/farmer_details")
public class ViewFarmerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{email}")
    public FarmerDetails getDetails(@PathVariable("email") String email){
         FarmerDetails farmer = restTemplate.getForObject(
                 "http://farmer-info-service/details/bobMa@gmail.com",
                 FarmerDetails.class);
         return farmer;
    }
}
