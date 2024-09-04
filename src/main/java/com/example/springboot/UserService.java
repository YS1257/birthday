package com.example.springboot;

import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class UserService {
    public long calculateDaysUntilBirthday(User user){
        long daysBetween = 0;
        try {
            LocalDate birthday = user.getBirthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate today = LocalDate.now();
            if (birthday.isBefore(today) || birthday.equals(today)) {
                // If birthday has passed, calculate for next year
                birthday = birthday.plusYears(1);
            }
            daysBetween = Duration.ofDays(DAYS.between(today, birthday)).toDays();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return daysBetween;
    }
}