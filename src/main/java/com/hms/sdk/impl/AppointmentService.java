package com.hms.sdk.impl;

import com.hms.sdk.core.IAppointmentService;

public class AppointmentService implements IAppointmentService {

    @Override
    public void updateAppointment(String s, Object o) {
        System.out.println("Updated Appointment with value" + s);
    }
}
