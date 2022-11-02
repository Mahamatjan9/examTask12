package peaksoft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import static jakarta.persistence.CascadeType.ALL;
;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Garage  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;

    private String location;

    @OneToOne(cascade = ALL,fetch = FetchType.LAZY)
    private Car cars;


    public Garage(String companyName, String location) {
        this.companyName = companyName;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}