import pojo.Human;
import reader.XmlReader;
import service.SearchService;
import service.SortService;

import javax.xml.bind.JAXBException;
import java.util.List;

public class Application {

    private static SearchService searchService = new SearchService();

    private static SortService sortService = new SortService();

    private static XmlReader xmlReader = new XmlReader();

    public static void main(String[] args) throws JAXBException {
        List<Human> humans = xmlReader.humansReader();

        Human human = searchService.binarySearch(humans, 1112);
        System.out.println(human);

        humans = sortService.insertSort(humans);
        for (Human human1 : humans)
            System.out.println(human1.toString());
    }
}
