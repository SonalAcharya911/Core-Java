package com.xworkz.linkedCustomer.map;

import com.xworkz.linkedCustomer.dto.JobDTO;
import com.xworkz.linkedCustomer.dto.SecurityDTO;

import java.util.HashMap;
import java.util.Map;

public class SecurityMap {
    public static Map<Integer, SecurityDTO> getSecurityMap() {

        Map<Integer, JobDTO> jobDTOMap=JobMap.getJobMap();
        Map<Integer, SecurityDTO> securityDTOMap = new HashMap<>();

        securityDTOMap.put(1, new SecurityDTO("Tiger Security", 5, true, jobDTOMap.get(1)));
        securityDTOMap.put(2, new SecurityDTO("Hawk Eye", 3, false, jobDTOMap.get(2)));
        securityDTOMap.put(3, new SecurityDTO("Shield Force", 6, true, jobDTOMap.get(3)));
        securityDTOMap.put(4, new SecurityDTO("Falcon Services", 2, false, jobDTOMap.get(4)));
        securityDTOMap.put(5, new SecurityDTO("Sentinel Guards", 4, true, jobDTOMap.get(5)));
        securityDTOMap.put(6, new SecurityDTO("Panther Security", 5, true, jobDTOMap.get(6)));
        securityDTOMap.put(7, new SecurityDTO("Alpha Protection", 3, false, jobDTOMap.get(7)));
        securityDTOMap.put(8, new SecurityDTO("Eagle Watch", 6, true, jobDTOMap.get(8)));
        securityDTOMap.put(9, new SecurityDTO("SecureTech", 2, true, jobDTOMap.get(9)));
        securityDTOMap.put(10, new SecurityDTO("Black Rhino", 4, false, jobDTOMap.get(10)));
        securityDTOMap.put(11, new SecurityDTO("Tiger Security", 5, true, jobDTOMap.get(11)));
        securityDTOMap.put(12, new SecurityDTO("Hawk Eye", 4, false, jobDTOMap.get(12)));
        securityDTOMap.put(13, new SecurityDTO("Shield Force", 6, true, jobDTOMap.get(13)));
        securityDTOMap.put(14, new SecurityDTO("Falcon Services", 3, false, jobDTOMap.get(14)));
        securityDTOMap.put(15, new SecurityDTO("Sentinel Guards", 5, true, jobDTOMap.get(15)));
        securityDTOMap.put(16, new SecurityDTO("Panther Security", 4, true, jobDTOMap.get(16)));
        securityDTOMap.put(17, new SecurityDTO("Alpha Protection", 3, true, jobDTOMap.get(17)));
        securityDTOMap.put(18, new SecurityDTO("Eagle Watch", 6, false, jobDTOMap.get(18)));
        securityDTOMap.put(19, new SecurityDTO("SecureTech", 2, true, jobDTOMap.get(19)));
        securityDTOMap.put(20, new SecurityDTO("Black Rhino", 5, true, jobDTOMap.get(20)));
        securityDTOMap.put(21, new SecurityDTO("Tiger Security", 4, true, jobDTOMap.get(21)));
        securityDTOMap.put(22, new SecurityDTO("Hawk Eye", 3, false, jobDTOMap.get(22)));
        securityDTOMap.put(23, new SecurityDTO("Shield Force", 5, true, jobDTOMap.get(23)));
        securityDTOMap.put(24, new SecurityDTO("Falcon Services", 2, false, jobDTOMap.get(24)));
        securityDTOMap.put(25, new SecurityDTO("Sentinel Guards", 4, true, jobDTOMap.get(25)));
        securityDTOMap.put(26, new SecurityDTO("Panther Security", 3, true, jobDTOMap.get(26)));
        securityDTOMap.put(27, new SecurityDTO("Alpha Protection", 6, true, jobDTOMap.get(27)));
        securityDTOMap.put(28, new SecurityDTO("Eagle Watch", 2, false, jobDTOMap.get(28)));
        securityDTOMap.put(29, new SecurityDTO("SecureTech", 4, true, jobDTOMap.get(29)));
        securityDTOMap.put(30, new SecurityDTO("Black Rhino", 5, true, jobDTOMap.get(30)));

        return securityDTOMap;
    }
}
