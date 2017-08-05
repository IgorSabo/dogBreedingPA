package rs.odgajivacnica.model.entities;

import lombok.Getter;
import lombok.Setter;
import rs.odgajivacnica.model.BaseEntity;

import javax.persistence.*;

/**
 * Created by Gile on 8/2/2017.
 */
@Entity
@Getter
@Setter
public class Puppy  extends BaseEntity {


    @ManyToOne
    private Dog mother;

    private int age;


}
