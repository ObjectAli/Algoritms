import org.junit.Test;
import pojo.Human;
import reader.XmlReader;
import service.SortService;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortServiceTest {

    private static SortService sortService = new SortService();

    private static XmlReader xmlReader = new XmlReader();

    @Test
    public void testInsertSort() throws Exception{
        List<Human> humans = xmlReader.humansReader();

        assertEquals(humans.get(0).getNameUnq(), "Иванов Иван Иванович");
        assertEquals(humans.get(0).getPassportId(), 1111);

        assertEquals(humans.get(1).getNameUnq(), "Сергеев Сергей Сергеевич");
        assertEquals(humans.get(1).getPassportId(), 1112);

        humans = sortService.insertSort(humans);

        assertEquals(humans.get(0).getNameUnq(), "Анатольев Анатолий Анатольевич");
        assertEquals(humans.get(0).getPassportId(), 1113);

        assertEquals(humans.get(1).getNameUnq(), "Сергеев Сергей Сергеевич");
        assertEquals(humans.get(1).getPassportId(), 1112);
    }
}
