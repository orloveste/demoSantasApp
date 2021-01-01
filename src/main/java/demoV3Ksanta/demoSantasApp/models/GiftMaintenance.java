package demoV3Ksanta.demoSantasApp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class GiftMaintenance extends Auditable<String>{
/*    private String id;

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

        @ManyToOne
        @JoinColumn(name="vehicleid", insertable=false, updatable=false)
        private Gift gift;
        private Integer giftid;

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private Date startDate;

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private Date endDate;

        private String price;

        @ManyToOne
        @JoinColumn(name="supplierid", insertable=false, updatable=false)
        private Supplier supplier;
        private Integer supplierid;

        private String remarks;
}
