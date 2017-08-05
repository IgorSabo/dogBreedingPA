package rs.odgajivacnica.model.entities;

import lombok.Getter;
import lombok.Setter;
import rs.odgajivacnica.model.BaseEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Gile on 8/2/2017.
 */
@Entity
@Getter
@Setter
public class Dog extends BaseEntity{

    private String gender;

    private String name;

    @Lob
    private String description;

    private boolean hasPuppies;

    @Column(name = "mainImageName")
    private String mainImageName;

    @OneToMany( mappedBy = "mother", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Puppy> puppies;

    private int age=0;


}
