package cn.watson.rent.web;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locationInfo")
public class LocationInfoController {



    @GetMapping("/test")
    public ModelMap test(){

        return new ModelMap();
    }

}
