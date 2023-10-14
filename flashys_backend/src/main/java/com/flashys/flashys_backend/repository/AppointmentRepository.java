package com.flashys.flashys_backend.repository;

import com.flashys.flashys_backend.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {

}
