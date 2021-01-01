package demoV3Ksanta.demoSantasApp.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class GiftModel extends CommonObject {
}
