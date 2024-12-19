package com.patientcare.controller;

import com.patientcare.entity.EmailRequest;
import com.patientcare.service.EmailNotificationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alerts")
@AllArgsConstructor
public class AlertController {

    private final EmailNotificationService emailService;

    // Send an email alert
    @PostMapping("/email")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) {
        emailService.sendEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getBody());
        return ResponseEntity.ok("Email sent successfully to " + emailRequest.getTo());
    }


}
