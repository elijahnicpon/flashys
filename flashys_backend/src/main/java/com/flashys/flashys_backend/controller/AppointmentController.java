package com.flashys.flashys_backend.controller;

import com.flashys.flashys_backend.model.Appointment;
import com.flashys.flashys_backend.service.AppointmentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class AppointmentController {

    @Autowired
    private AppointmentServiceImplementation appointmentServiceImplementation;

    @GetMapping("appointments/{user_id}")
    public List<Appointment> getAcceptedAppointments(@PathVariable String user_id) {
        return appointmentServiceImplementation.getAcceptedAppointmentsByUserIdSortByStart_Time(user_id);
    }

    @GetMapping("appointments/{artist_id}")
    public List<Appointment> getPendingAppointments(@PathVariable String artist_id) {
        return appointmentServiceImplementation.getPendingAppointmentsByArtistIdSortByStart_Time(artist_id);
    }
}
