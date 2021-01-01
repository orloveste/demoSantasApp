package demoV3Ksanta.demoSantasApp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GiftHire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private int id;

    @ManyToOne
    @JoinColumn(name= "vehicleid", insertable=false, updatable=false)
    private Gift gift;
    private Integer giftid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOut;

    private String timeOut;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateIn;

    private String timeIn;

    @ManyToOne
    @JoinColumn(name="childid", insertable=false, updatable=false)
    private Child child;
    private Integer clientid;

    @ManyToOne
    @JoinColumn(name="locationid", insertable=false, updatable=false)
    private Location location;
    private Integer locationid;

    private String price;

    private String remarks;
}
