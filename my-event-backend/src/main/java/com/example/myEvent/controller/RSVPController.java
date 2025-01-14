package com.example.myEvent.controller;

import com.example.myEvent.model.RSVP;
import com.example.myEvent.service.RSVPService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/rsvps")
public class RSVPController {

    private final RSVPService rsvpService;

    public RSVPController(RSVPService rsvpService) {
        this.rsvpService = rsvpService;
    }

    @PostMapping
    public ResponseEntity<RSVP> createRSVP(@RequestBody RSVP rsvp) {
        return ResponseEntity.ok(rsvpService.saveRSVP(rsvp));
    }

    @GetMapping
    public ResponseEntity<List<RSVP>> getAllRSVPs() {
        return ResponseEntity.ok(rsvpService.getAllRSVPs());
    }
}
