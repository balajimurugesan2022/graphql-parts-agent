package com.graphql.dms.agentdms.services;

import org.springframework.stereotype.Service;

import com.graphql.dms.agentdms.entity.PartType;
@Service
public class PartTypeService {
    
    public PartType getPartTypes(){

        return new PartType(1,"RLC_TESTER","ZBOI");
        
    }
}
