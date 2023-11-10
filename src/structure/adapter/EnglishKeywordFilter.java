package structure.adapter;

/**
 * 英文关键词过滤
 */
public class EnglishKeywordFilter {

    private static final String[] keyword = {"fuck","shit"};

    public String keywordFilter(String text){
        for (String s : keyword){
            if (text.contains(s)){
                text = text.replace(s,"小可爱");
            }
        }
        return text;
    }
}
