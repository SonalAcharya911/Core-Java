package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.internal.UserDetails;
import com.xworkz.extraordinary.internal.UserProfile;

public class UserProfileParseRunner {
    public static void main(String[] args) {
        try {
            UserProfile profile = new UserProfile();
            profile.setName("John");

            UserDetails details = new UserDetails();
            details.setAge(30);
            profile.setDetails(details);

            try {
                int age = profile.getDetails().getAge();
                System.out.println("Age extracted: " + age);
            } catch (Exception e) {
                System.out.println("Failed to extract age: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Profile parsing failed: " + e.getMessage());
        }
    }

}
