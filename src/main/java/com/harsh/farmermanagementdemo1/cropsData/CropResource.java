package com.harsh.farmermanagementdemo1.cropsData;

import com.harsh.farmermanagementdemo1.authenticate.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/crops")
public class CropResource {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/view_Crops")
    public CropItems getAllCrops(){
       CropItems items = restTemplate.getForObject("http://crop-info-service/crops/",CropItems.class);
       return items;
    }

    @GetMapping("/by_Type/{type}")
    public CropItems getCropsByType(@PathVariable("type") String type){
        CropItems items = restTemplate.getForObject("http://crop-info-service/crops/category/"+type,
                CropItems.class);
        return items;
    }
    @GetMapping("/by_Name/{name}")
    public CropItems getCropsByName(@PathVariable("name") String name){
        CropItems items = restTemplate.getForObject("http://crop-info-service/crops/name/"+name,
                CropItems.class);
        return items;
    }


}
