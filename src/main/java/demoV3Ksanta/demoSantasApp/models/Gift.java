package demoV3Ksanta.demoSantasApp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Gift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "gifttypeid", insertable = false, updatable = false)
    private GiftType giftType;
    private Integer gifttypeid;

    private String giftNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date acquisitionDate;
    private String description;

    @ManyToOne
    @JoinColumn(name="giftmakeid", insertable=false, updatable=false)
    private GiftMake giftMake;
    private Integer vehiclemakeid;

    private String power;
    private String batteryCapacity;

    @ManyToOne
    @JoinColumn(name="giftstatusid", insertable=false, updatable=false)
    private GiftStatus giftStatus;
    private Integer giftstatusid;

    private String netWeight;

    @ManyToOne
    @JoinColumn(name="elveid", insertable=false, updatable=false)
    private Elve inCharge;
    private Integer elveid;

    @ManyToOne
    @JoinColumn(name="giftmodelid", insertable=false, updatable=false)
    private GiftModel giftModel;
    private Integer giftmodelid;

    @ManyToOne
    @JoinColumn(name="locationid", insertable=false, updatable=false)
    private Location currentLocation;
    private Integer locationid;

    private String remarks;
}
