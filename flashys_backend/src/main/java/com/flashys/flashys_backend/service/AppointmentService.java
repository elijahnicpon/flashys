package com.flashys.flashys_backend.service;

import com.flashys.flashys_backend.model.Appointment;

import java.util.Date;
import java.util.List;

public interface AppointmentService {

    List<Appointment> getAcceptedAppointmentsByUserIdSortByStart_Time(String userid);
    List<Appointment> getPendingAppointmentsByArtistIdSortByStart_Time(String artistId);
    Appointment createAppointment(Appointment appointment);
    Appointment getAppointmentById(String appointmentId);
    List<Appointment> getAllAppointments();
    void deleteAppointment(String appointmentId);
}
