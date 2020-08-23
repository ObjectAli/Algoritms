package pojo;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="Human")
@XmlAccessorType(XmlAccessType.FIELD)
public class Human {

    @XmlElement
    private String nameUnq;
    @XmlElement
    private long passportId;

    public String getNameUnq() {
        return nameUnq;
    }

    public void setNameUnq(String nameUnq) {
        this.nameUnq = nameUnq;
    }

    public long getPassportId() {
        return passportId;
    }

    public void setPassportId(long passportId) {
        this.passportId = passportId;
    }

    public Human() {}

    public Human(String nameUnq, long passportId) {
        this.nameUnq = nameUnq;
        this.passportId = passportId;
    }

    @Override
    public String toString(){
        return "[ nameUnq = " + nameUnq + ", passportId = " + passportId + "]";
    }

}
