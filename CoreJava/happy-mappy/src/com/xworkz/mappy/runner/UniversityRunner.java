package com.xworkz.mappy.runner;

import com.xworkz.mappy.dto.UniversityDto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniversityRunner {
    public static void main(String[] args) {
        UniversityDto universityDto1 = new UniversityDto("IIT Bombay", "Mumbai", 1958);
        UniversityDto universityDto2 = new UniversityDto("IIT Delhi", "New Delhi", 1961);
        UniversityDto universityDto3 = new UniversityDto("IIT Madras", "Chennai", 1959);
        UniversityDto universityDto4 = new UniversityDto("IIT Kanpur", "Kanpur", 1959);
        UniversityDto universityDto5 = new UniversityDto("IIT Kharagpur", "Kharagpur", 1951);
        UniversityDto universityDto6 = new UniversityDto("NIT Trichy", "Tiruchirapalli", 1964);
        UniversityDto universityDto7 = new UniversityDto("NIT Surathkal", "Mangalore", 1960);
        UniversityDto universityDto8 = new UniversityDto("NIT Warangal", "Warangal", 1959);
        UniversityDto universityDto9 = new UniversityDto("NIT Calicut", "Kozhikode", 1961);
        UniversityDto universityDto10 = new UniversityDto("BITS Pilani", "Pilani", 1964);
        UniversityDto universityDto11 = new UniversityDto("Anna University", "Chennai", 1978);
        UniversityDto universityDto12 = new UniversityDto("Delhi University", "New Delhi", 1922);
        UniversityDto universityDto13 = new UniversityDto("Jadavpur University", "Kolkata", 1955);
        UniversityDto universityDto14 = new UniversityDto("Osmania University", "Hyderabad", 1918);
        UniversityDto universityDto15 = new UniversityDto("Amrita University", "Coimbatore", 2003);
        UniversityDto universityDto16 = new UniversityDto("VIT University", "Vellore", 1984);
        UniversityDto universityDto17 = new UniversityDto("SRM University", "Chennai", 1985);
        UniversityDto universityDto18 = new UniversityDto("Shiv Nadar University", "Greater Noida", 2011);
        UniversityDto universityDto19 = new UniversityDto("Ashoka University", "Sonepat", 2014);
        UniversityDto universityDto20 = new UniversityDto("Christ University", "Bangalore", 1969);
        UniversityDto universityDto21 = new UniversityDto("Mumbai University", "Mumbai", 1857);
        UniversityDto universityDto22 = new UniversityDto("Pune University", "Pune", 1949);
        UniversityDto universityDto23 = new UniversityDto("Banaras Hindu University", "Varanasi", 1916);
        UniversityDto universityDto24 = new UniversityDto("Aligarh Muslim University", "Aligarh", 1875);
        UniversityDto universityDto25 = new UniversityDto("Jawaharlal Nehru University", "New Delhi", 1969);

        Map<String, String> deptMap1 = new HashMap<>();
        deptMap1.put("Computer Science", "Dr. Rao");
        deptMap1.put("Electrical", "Dr. Mehta");
        deptMap1.put("Mechanical", "Dr. Sinha");

        Map<String, String> deptMap2 = new HashMap<>();
        deptMap2.put("Civil", "Dr. Patel");
        deptMap2.put("Architecture", "Dr. Verma");

        Map<String, String> deptMap3 = new HashMap<>();
        deptMap3.put("Biotech", "Dr. Sharma");
        deptMap3.put("Chemical", "Dr. Singh");
        deptMap3.put("CSE", "Dr. Nair");
        deptMap3.put("AI & ML", "Dr. Prakash");

        Map<String, String> deptMap4 = new HashMap<>();
        deptMap4.put("Electronics", "Dr. Khan");
        deptMap4.put("Physics", "Dr. Das");

        Map<String, String> deptMap5 = new HashMap<>();
        deptMap5.put("Mathematics", "Dr. Menon");
        deptMap5.put("Statistics", "Dr. Reddy");
        deptMap5.put("Economics", "Dr. Gupta");

        Map<String, String> deptMap6 = new HashMap<>();
        deptMap6.put("Information Tech", "Dr. Sundar");
        deptMap6.put("Mechanical", "Dr. Rana");
        deptMap6.put("EEE", "Dr. Joseph");

        Map<String, String> deptMap7 = new HashMap<>();
        deptMap7.put("Mining", "Dr. Bose");
        deptMap7.put("Computer Science", "Dr. Sen");

        Map<String, String> deptMap8 = new HashMap<>();
        deptMap8.put("Civil", "Dr. Roy");
        deptMap8.put("CSE", "Dr. Dey");
        deptMap8.put("AI & DS", "Dr. Chitra");

        Map<String, String> deptMap9 = new HashMap<>();
        deptMap9.put("Metallurgy", "Dr. Iyer");
        deptMap9.put("Instrumentation", "Dr. Thakur");

        Map<String, String> deptMap10 = new HashMap<>();
        deptMap10.put("Electronics", "Dr. Jay");
        deptMap10.put("Nano Tech", "Dr. Anu");
        deptMap10.put("Physics", "Dr. Pillai");

        Map<String, String> deptMap11 = new HashMap<>();
        deptMap11.put("CSE", "Dr. Bala");
        deptMap11.put("ECE", "Dr. Devi");

        Map<String, String> deptMap12 = new HashMap<>();
        deptMap12.put("History", "Dr. Bose");
        deptMap12.put("Political Science", "Dr. Kamat");
        deptMap12.put("English", "Dr. Rao");

        Map<String, String> deptMap13 = new HashMap<>();
        deptMap13.put("Mechanical", "Dr. Das");
        deptMap13.put("EEE", "Dr. Vishnu");

        Map<String, String> deptMap14 = new HashMap<>();
        deptMap14.put("Commerce", "Dr. Sinha");
        deptMap14.put("Law", "Dr. Raj");

        Map<String, String> deptMap15 = new HashMap<>();
        deptMap15.put("Cybersecurity", "Dr. Thomas");
        deptMap15.put("Data Science", "Dr. Biju");

        Map<String, String> deptMap16 = new HashMap<>();
        deptMap16.put("IT", "Dr. Rajesh");
        deptMap16.put("Physics", "Dr. Krishna");
        deptMap16.put("Biotech", "Dr. Ashok");

        Map<String, String> deptMap17 = new HashMap<>();
        deptMap17.put("CSE", "Dr. Leela");
        deptMap17.put("EEE", "Dr. Noor");
        deptMap17.put("Business", "Dr. Thomas");

        Map<String, String> deptMap18 = new HashMap<>();
        deptMap18.put("Economics", "Dr. Arya");
        deptMap18.put("Philosophy", "Dr. Mathew");
        deptMap18.put("Political Science", "Dr. Shirin");

        Map<String, String> deptMap19 = new HashMap<>();
        deptMap19.put("Sociology", "Dr. Jain");
        deptMap19.put("Psychology", "Dr. Kumari");

        Map<String, String> deptMap20 = new HashMap<>();
        deptMap20.put("MBA", "Dr. Asha");
        deptMap20.put("Commerce", "Dr. Balan");

        Map<String, String> deptMap21 = new HashMap<>();
        deptMap21.put("Marine Engg", "Dr. Vasudev");
        deptMap21.put("Applied Physics", "Dr. Iqbal");
        deptMap21.put("CSE", "Dr. Surya");

        Map<String, String> deptMap22 = new HashMap<>();
        deptMap22.put("Law", "Dr. Manohar");
        deptMap22.put("History", "Dr. Jacob");

        Map<String, String> deptMap23 = new HashMap<>();
        deptMap23.put("Astronomy", "Dr. Rahul");
        deptMap23.put("Maths", "Dr. Gopal");
        deptMap23.put("Computer Applications", "Dr. Latha");

        Map<String, String> deptMap24 = new HashMap<>();
        deptMap24.put("Fine Arts", "Dr. Amina");
        deptMap24.put("Theology", "Dr. Kabir");

        Map<String, String> deptMap25 = new HashMap<>();
        deptMap25.put("International Studies", "Dr. Rao");
        deptMap25.put("Social Sciences", "Dr. Meenakshi");
        deptMap25.put("Linguistics", "Dr. Bhaskar");


        Map<UniversityDto, Map<String, String>> universityDepartmentsMap = new HashMap<>();

        universityDepartmentsMap.put(universityDto1, deptMap1);
        universityDepartmentsMap.put(universityDto2, deptMap2);
        universityDepartmentsMap.put(universityDto3, deptMap3);
        universityDepartmentsMap.put(universityDto4, deptMap4);
        universityDepartmentsMap.put(universityDto5, deptMap5);
        universityDepartmentsMap.put(universityDto6, deptMap6);
        universityDepartmentsMap.put(universityDto7, deptMap7);
        universityDepartmentsMap.put(universityDto8, deptMap8);
        universityDepartmentsMap.put(universityDto9, deptMap9);
        universityDepartmentsMap.put(universityDto10, deptMap10);
        universityDepartmentsMap.put(universityDto11, deptMap11);
        universityDepartmentsMap.put(universityDto12, deptMap12);
        universityDepartmentsMap.put(universityDto13, deptMap13);
        universityDepartmentsMap.put(universityDto14, deptMap14);
        universityDepartmentsMap.put(universityDto15, deptMap15);
        universityDepartmentsMap.put(universityDto16, deptMap16);
        universityDepartmentsMap.put(universityDto17, deptMap17);
        universityDepartmentsMap.put(universityDto18, deptMap18);
        universityDepartmentsMap.put(universityDto19, deptMap19);
        universityDepartmentsMap.put(universityDto20, deptMap20);
        universityDepartmentsMap.put(universityDto21, deptMap21);
        universityDepartmentsMap.put(universityDto22, deptMap22);
        universityDepartmentsMap.put(universityDto23, deptMap23);
        universityDepartmentsMap.put(universityDto24, deptMap24);
        universityDepartmentsMap.put(universityDto25, deptMap25);

        System.out.println("=========values===========");
        universityDepartmentsMap.values().forEach(System.out::println);
        System.out.println("=========keys===========");
        universityDepartmentsMap.keySet().forEach(System.out::println);

        Set<Map.Entry<UniversityDto,Map<String,String>>> entrySet=universityDepartmentsMap.entrySet();

        entrySet.forEach(e->{
            System.out.println("university: "+e.getKey().getName()+", HODs: "+e.getValue());
        });

    }
}
