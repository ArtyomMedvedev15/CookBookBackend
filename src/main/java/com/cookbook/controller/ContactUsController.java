package com.cookbook.controller;

import com.cookbook.model.ContactUs;
import com.cookbook.model.Subscribe_on_letter;
import com.cookbook.service.interfaces.ContactUsService;
import com.cookbook.service.interfaces.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/contact")
@Controller
public class ContactUsController {

    private final SubscribeService subscribeService;
    private final ContactUsService contactUsService;

    @Autowired
    public ContactUsController(ContactUsService contactUsService, @Qualifier("getSubscribeService") SubscribeService subscribeService) {
        this.contactUsService = contactUsService;
        this.subscribeService = subscribeService;
    }

    @GetMapping("/contactUs")
    public String contactUs(){
        return "ContactUs";
    }

    @PostMapping("/addContacts")
    public String addContacts(@ModelAttribute("Contact")ContactUs contactUs){
        contactUsService.save(contactUs);
        return "redirect:/contact/contactUs";
    }

    @PostMapping("/addSubscribe")
    public String addSubscribe(@ModelAttribute("subscribe")Subscribe_on_letter subscribe){
        subscribeService.save(subscribe);
        return "redirect:/contact/contactUs";
    }


}
