package records;

import pojo.Human;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name="Humans")
@XmlAccessorType(XmlAccessType.FIELD)
public class Humans {

    @XmlElement(name = "Human")
    private List<Human> humans;

    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public Humans() {}

    public Humans(List<Human> humans) {
        this.humans = humans;
    }
}
