package com.aq.subscribers.repository;

import com.aq.subscribers.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class SubscriberRepository extends JpaRepository<Subscriber, Long> {
        List<Subscriber> findByName(String name);
        List<Subscriber> findByEmail(String email);
}
