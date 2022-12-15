package com.graphql.dms.agentdms.dataFetchers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graphql.dms.agentdms.entity.Part;
import com.graphql.dms.agentdms.services.PartService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.netflix.graphql.dgs.context.DgsContext;
@Component
@DgsComponent
public class PartsDataFetcher {

    @Autowired
    PartService partService;

 
    /**
     * This datafetcher resolves the shows field on Query.
     * It uses an @InputArgument to get the titleFilter from the Query if one is defined.
     */
    @DgsQuery(field = "part")
    public Part fetchPartData(@InputArgument("id") String partid) {
 
        return partService.getParts();
    }

    
}
