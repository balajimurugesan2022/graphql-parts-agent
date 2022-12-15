package com.graphql.dms.agentdms.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.graphql.dms.agentdms.entity.PartLocation;
@Service
public class PartLocationService {
    public List<PartLocation> getPartLocations(){

        List<PartLocation> partLocations = new ArrayList<>();
        partLocations.add(new PartLocation(1,"RLC_TESTER","CHENNAI, INDIA"));
        partLocations.add(new PartLocation(1,"RLC_TESTER","DELHI, INDIA"));
        partLocations.add(new PartLocation(1,"RLC_TESTER","KARAIKAL, INDIA"));
        return partLocations;

        
        
    }
}
