package com.xworkz.mappy.runner;

import com.xworkz.mappy.dto.CustomerDto;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomerRunner {
    public static void main(String[] args) {

        CustomerDto customerDto1 = new CustomerDto("Sonal", 101, "sonal@gmail.com", "Bangalore");
        CustomerDto customerDto2 = new CustomerDto("Ravi", 102, "ravi@gmail.com", "Hyderabad");
        CustomerDto customerDto3 = new CustomerDto("Meena", 103, "meena@gmail.com", "Chennai");
        CustomerDto customerDto4 = new CustomerDto("Arjun", 104, "arjun.k@gmail.com", "Delhi");
        CustomerDto customerDto5 = new CustomerDto("Sneha", 105, "sneha.rao@gmail.com", "Pune");
        CustomerDto customerDto6 = new CustomerDto("Vikram", 106, "vikramv@gmail.com", "Mumbai");
        CustomerDto customerDto7 = new CustomerDto("Nisha", 107, "nisha87@gmail.com", "Bhopal");
        CustomerDto customerDto8 = new CustomerDto("Abhishek", 108, "abhishek@gmail.com", "Kolkata");
        CustomerDto customerDto9 = new CustomerDto("Priya", 109, "priyap@gmail.com", "Mysore");
        CustomerDto customerDto10 = new CustomerDto("Deepak", 110, "deepak.k@gmail.com", "Nagpur");
        CustomerDto customerDto11 = new CustomerDto("Lavanya", 111, "lavanya@gmail.com", "Coimbatore");
        CustomerDto customerDto12 = new CustomerDto("Suresh", 112, "suresh.yadav@gmail.com", "Varanasi");
        CustomerDto customerDto13 = new CustomerDto("Anjali", 113, "anjali@gmail.com", "Surat");
        CustomerDto customerDto14 = new CustomerDto("Farhan", 114, "farhan@gmail.com", "Lucknow");
        CustomerDto customerDto15 = new CustomerDto("Divya", 115, "divya.r@gmail.com", "Indore");
        CustomerDto customerDto16 = new CustomerDto("Rohit", 116, "rohit.kumar@gmail.com", "Patna");
        CustomerDto customerDto17 = new CustomerDto("Ananya", 117, "ananya@gmail.com", "Jaipur");
        CustomerDto customerDto18 = new CustomerDto("Karan", 118, "karan.sharma@gmail.com", "Chandigarh");
        CustomerDto customerDto19 = new CustomerDto("Neha", 119, "neha123@gmail.com", "Ahmedabad");
        CustomerDto customerDto20 = new CustomerDto("Amit", 120, "amit.verma@gmail.com", "Noida");
        CustomerDto customerDto21 = new CustomerDto("Ishita", 121, "ishita.m@gmail.com", "Trivandrum");
        CustomerDto customerDto22 = new CustomerDto("Manoj", 122, "manoj@gmail.com", "Thrissur");
        CustomerDto customerDto23 = new CustomerDto("Kavya", 123, "kavya.s@gmail.com", "Hubli");
        CustomerDto customerDto24 = new CustomerDto("Rahul", 124, "rahulreddy@gmail.com", "Guntur");
        CustomerDto customerDto25 = new CustomerDto("Diya", 125, "diya@gmail.com", "Madurai");

        Map<CustomerDto,String[]> customerItemsMap=new HashMap<>();

        customerItemsMap.put(customerDto1,new String[]{"towel","bottle"});
        customerItemsMap.put(customerDto2, new String[]{"smartphone", "earphones", "power bank"});
        customerItemsMap.put(customerDto3, new String[]{"rice 10kg", "toor dal", "sunflower oil", "detergent"});
        customerItemsMap.put(customerDto4, new String[]{"laptop", "mouse"});
        customerItemsMap.put(customerDto5, new String[]{"shampoo", "conditioner", "face wash", "loofah"});
        customerItemsMap.put(customerDto6, new String[]{"washing machine", "laundry basket"});
        customerItemsMap.put(customerDto7, new String[]{"yoga mat", "dumbbells", "protein powder", "gym bag"});
        customerItemsMap.put(customerDto8, new String[]{"curtains", "cushion covers"});
        customerItemsMap.put(customerDto9, new String[]{"olive oil", "pasta", "red chili flakes", "kitchen towel"});
        customerItemsMap.put(customerDto10, new String[]{"air conditioner", "stabilizer"});
        customerItemsMap.put(customerDto11, new String[]{"bookshelf", "study lamp", "notebook"});
        customerItemsMap.put(customerDto12, new String[]{"hair oil", "hair dryer", "comb"});
        customerItemsMap.put(customerDto13, new String[]{"microwave oven", "grill rack"});
        customerItemsMap.put(customerDto14, new String[]{"cashew nuts", "almonds", "raisins", "dates", "honey"});
        customerItemsMap.put(customerDto15, new String[]{"pet shampoo", "dog treats", "pet bed"});
        customerItemsMap.put(customerDto16, new String[]{"mirror", "wall clock", "floor mat"});
        customerItemsMap.put(customerDto17, new String[]{"sneakers", "joggers"});
        customerItemsMap.put(customerDto18, new String[]{"fan", "LED bulb", "extension board"});
        customerItemsMap.put(customerDto19, new String[]{"diary", "gel pen", "sticky notes", "marker"});
        customerItemsMap.put(customerDto20, new String[]{"toothpaste", "toothbrush", "mouthwash"});
        customerItemsMap.put(customerDto21, new String[]{"casual t-shirt", "jeans", "belt", "wallet"});
        customerItemsMap.put(customerDto22, new String[]{"grocery bag", "onion", "tomato", "green chili"});
        customerItemsMap.put(customerDto23, new String[]{"eyeliner", "compact powder", "makeup remover"});
        customerItemsMap.put(customerDto24, new String[]{"mobile charger", "USB cable", "phone case"});
        customerItemsMap.put(customerDto25, new String[]{"fridge", "ice tray", "egg holder"});

        customerItemsMap.keySet().forEach(System.out::println);
        customerItemsMap.values().forEach(System.out::println);

        Set<Map.Entry<CustomerDto,String[]>> entrySet= customerItemsMap.entrySet();

        entrySet.forEach(e->{
            System.out.println("key: "+e.getKey()+", value: "+e.getValue());
        });



    }
}

