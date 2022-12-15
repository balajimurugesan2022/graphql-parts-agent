package com.graphql.dms.agentdms.dataFetchers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graphql.dms.agentdms.entity.PartLocation;
import com.graphql.dms.agentdms.services.PartLocationService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

@Component
@DgsComponent
public class PartLocationDataFetcher {
    @Autowired
    PartLocationService partService;

 
    /**
     * This datafetcher resolves the shows field on Query.
     * It uses an @InputArgument to get the titleFilter from the Query if one is defined.
     */
    @DgsQuery(field = "PartLocation")
    public List<PartLocation> fetchPartLocation(@InputArgument("id") String partid) {
 
        return partService.getPartLocations();
    }
    
}
