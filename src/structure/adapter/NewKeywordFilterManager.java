package structure.adapter;

import java.util.ArrayList;

public class NewKeywordFilterManager {

    private final List<KeywordFilterAdapter> filters = new ArrayList<>();

    public void register(KeywordFilterAdapter keywordFilterAdapter){
        this.filters.add(keywordFilterAdapter);
    }

    public String filter(String text){
        for (KeywordFilterAdapter filter: filters){
            text = filter.filter(text);
        }
        return text;
    }
}
