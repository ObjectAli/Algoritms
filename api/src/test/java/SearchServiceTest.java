import org.junit.Test;
import pojo.Human;
import reader.XmlReader;
import service.SearchService;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchServiceTest {

    private static SearchService searchService = new SearchService();

    private static XmlReader xmlReader = new XmlReader();

    @Test
    public void testBinarySearch() throws Exception{
        List<Human> humans = xmlReader.humansReader();
        Human human = searchService.binarySearch(humans, 1112);

        assertEquals(human.getNameUnq(), "Сергеев Сергей Сергеевич");
        assertEquals(human.getPassportId(), 1112);
    }
}
