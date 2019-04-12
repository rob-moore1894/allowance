package dev.robmoore.allowance.controllers;

import com.twilio.Twilio;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import dev.robmoore.allowance.services.TwilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChoresController {
    @Autowired
    TwilioService textMessage;

    @GetMapping("/chores")
    public String chores() {return "chores";}

//    @PostMapping("/chores")


    }



