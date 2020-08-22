package pojo;

import java.math.BigInteger;

public class People {

    private String nameUnq;
    private BigInteger passportId;

    public String getNameUnq() {
        return nameUnq;
    }

    public void setNameUnq(String nameUnq) {
        this.nameUnq = nameUnq;
    }

    public BigInteger getPassportId() {
        return passportId;
    }

    public void setPassportId(BigInteger passportId) {
        this.passportId = passportId;
    }

    public People () {}
    
}
