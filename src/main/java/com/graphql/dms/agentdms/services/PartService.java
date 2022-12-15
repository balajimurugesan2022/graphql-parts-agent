package com.graphql.dms.agentdms.services;
import org.springframework.stereotype.Service;
import com.graphql.dms.agentdms.entity.Part;
@Service
public class PartService {

    public Part getParts(){

        return new Part(1,"RLC_TESTER","85$");
        
    }
    
}
