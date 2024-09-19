package com.deloitte.lab6.ex6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Lab6Ex6 {
    
	public static List<String> votersList(Map<String, String> peopleMap) throws ParseException {
        List<String> eligibleVoters = new ArrayList<>();
        Date currentDate = new Date();

        for (Map.Entry<String, String> entry : peopleMap.entrySet()) {
            String id = entry.getKey();
            String dob = entry.getValue();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date birthDate = sdf.parse(dob);

            int age = calculateAge(birthDate, currentDate);

            if (age > 18) {
                eligibleVoters.add(id);
            }
        }

        return eligibleVoters;
    }

    public static int calculateAge(Date birthDate, Date currentDate) {
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);
        Calendar today = Calendar.getInstance();
        today.setTime(currentDate);

        int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        return age;
    }

    public static void main(String[] args) throws ParseException {
        Map<String, String> people = new HashMap<>();
        people.put("ID101", "15/08/2005");
        people.put("ID102", "21/09/2000");
        people.put("ID103", "01/01/2010");
        people.put("ID104", "05/06/1990");

        List<String> eligibleVoters = votersList(people);

        System.out.println("Eligible Voters: " + eligibleVoters);
    }
}
