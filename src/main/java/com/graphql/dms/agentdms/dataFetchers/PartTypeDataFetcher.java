package com.graphql.dms.agentdms.dataFetchers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graphql.dms.agentdms.entity.PartType;
import com.graphql.dms.agentdms.services.PartTypeService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

@Component
@DgsComponent
public class PartTypeDataFetcher {


    @Autowired
    PartTypeService partTypeService;

    @DgsQuery(field = "partType")
    public PartType fetchPartTypes(@InputArgument("id") String partid) {
 
        return partTypeService.getPartTypes();


    }
}
