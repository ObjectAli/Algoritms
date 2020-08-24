package pojo;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Human")
@XmlAccessorType(XmlAccessType.FIELD)
public class Human {

    @XmlElement
    private String nameUnq;
    @XmlElement
    private long passportId;
    @XmlElement
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human() {
    }

    public Human(String nameUnq, long passportId, int age) {
        this.nameUnq = nameUnq;
        this.passportId = passportId;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[ nameUnq = " + nameUnq + ", passportId = " + passportId + ", age = " + age  +  " ]";
    }

}
