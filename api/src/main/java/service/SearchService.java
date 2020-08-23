package service;

import pojo.Human;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SearchService {

    /**
     * Binary search for list<Human>
     * @param list  - list for search
     * @param searchValue - value for search
     * @return object where searchValue equals passportId
     */
    public Human binarySearch (List<Human> list, long searchValue){
        if (list == null || list.isEmpty())
            return null;

        //the sort by field the passportId asc
        list = list.stream().sorted(Comparator.comparing(Human::getPassportId)).collect(Collectors.toList());

        //the lower and upper bounds to search
        int low = 0;
        int high = list.size() - 1;

        while (low <= high){
            int mid = (low  + high) / 2;
            long guess = list.get(mid).getPassportId();
            if (guess == searchValue)
                return list.get(mid);
            if (guess > searchValue)
                high = mid - 1;
            else low = mid + 1;
        }
        return null;
    }
}
