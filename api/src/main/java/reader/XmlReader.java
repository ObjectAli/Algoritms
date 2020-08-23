package reader;

import constants.Constants;
import pojo.Human;
import records.Humans;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class XmlReader {

    public List<Human> humansReader() throws JAXBException {
        File file = new File(Constants.HUMANS_XML_PATH);
        // create JAXB context and unmarshaller
        JAXBContext context = JAXBContext.newInstance(Humans.class);
        Unmarshaller um = context.createUnmarshaller();

        Humans humans = (Humans) um.unmarshal(file);
        return humans.getHumans();
    }
}
