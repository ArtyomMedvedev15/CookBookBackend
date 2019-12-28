package com.cookbook.controller;

import com.cookbook.dao.interfaces.ContactDao;
import com.cookbook.model.ContactUs;
import com.cookbook.service.interfaces.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/about")
@Controller
public class AboutUsController {

    private final ContactUsService contactUsService;

    @Autowired
    public AboutUsController(ContactUsService contactUsService) {
        this.contactUsService = contactUsService;
    }

    @GetMapping("/aboutUs")
    public String abousUs(){
        return "AboutUs";
    }

    @PostMapping("/addContact")
    public String addContact(@ModelAttribute("Contact")ContactUs contactUs){
        contactUsService.save(contactUs);
        return "redirect:/about/aboutUs";
    }
}
