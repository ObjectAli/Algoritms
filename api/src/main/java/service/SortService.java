package service;

import pojo.Human;

import java.util.ArrayList;
import java.util.List;

public class SortService {

    public List<Human> insertSort(List<Human> inputList) {
        List<Human> sortList = new ArrayList<>();
        while(!inputList.isEmpty()){
            int posHumanWithMaxAge = getPosHumanWithMaxAge(inputList);
            sortList.add(inputList.get(posHumanWithMaxAge));
            inputList.remove(inputList.get(posHumanWithMaxAge));
        }
        return sortList;
    }

    public int getPosHumanWithMaxAge(List<Human> list){
        int maxAge = 0;
        int position = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getAge() > maxAge){
                maxAge = list.get(i).getAge();
                position = i;
            }
        }
        return position;
    }
}
