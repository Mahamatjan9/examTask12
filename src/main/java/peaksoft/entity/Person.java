package peaksoft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    private String email;

    private String gender;



    @ManyToMany(cascade = ALL,fetch = FetchType.EAGER,mappedBy = "persons")
    private List<SocialMedia> socialMedia = new ArrayList<>();


    @ManyToOne(cascade = {DETACH,REFRESH,MERGE,PERSIST},fetch = FetchType.LAZY)
    private Company compnanies;

    @OneToMany(cascade = ALL,fetch = FetchType.EAGER,mappedBy = "persons")
    private List<Car> cars;

    public Person(String name, int age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
