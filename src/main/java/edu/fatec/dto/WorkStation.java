package edu.fatec.dto;

import java.util.List;
import org.springframework.data.annotation.Id;

/**
 *
 * @author KelvinVicenteCosta
 */

public class WorkStation {

    @Id
    private String id;
    private String owner;
    private String location;
    private List<Log> registros;

    public void Workstation(String owner, String location){
        
    }

}
