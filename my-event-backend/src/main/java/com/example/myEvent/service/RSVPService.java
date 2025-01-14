package com.example.myEvent.service;

import com.example.myEvent.model.RSVP;
import com.example.myEvent.repository.RSVPRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RSVPService {

    private final RSVPRepository rsvpRepository;

    public RSVPService(RSVPRepository rsvpRepository) {
        this.rsvpRepository = rsvpRepository;
    }

    public RSVP saveRSVP(RSVP rsvp) {
        return rsvpRepository.save(rsvp);
    }

    public List<RSVP> getAllRSVPs() {
        return rsvpRepository.findAll();
    }
}
