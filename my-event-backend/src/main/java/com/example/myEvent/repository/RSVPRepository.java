package com.example.myEvent.repository;

import com.example.myEvent.model.RSVP;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RSVPRepository extends JpaRepository<RSVP, Long> {
}
