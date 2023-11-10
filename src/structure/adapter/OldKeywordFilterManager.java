package structure.adapter;

public class OldKeywordFilterManager {

    private ChineseKeywordFilter chineseKeywordFilter = new ChineseKeywordFilter();
    private EnglishKeywordFilter englishKeywordFilter = new EnglishKeywordFilter();

    public String filter(String text){
        text = chineseKeywordFilter.chineseFilter(text);
        text = chineseKeywordFilter.pinyinFilter(text);
        text = englishKeywordFilter.keywordFilter(text);
        return text;
    }
}
