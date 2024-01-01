package org.sid.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class PageEvent {
    private String name;
    private String user;
    private Date date;
    private long duration;
}
