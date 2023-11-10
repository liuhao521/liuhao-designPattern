package structure.adapter;

public class ChineseKeywordFilterAdapter implements KeywordFilterAdapter {

    private ChineseKeywordFilter chineseKeywordFilter;

    public ChineseKeywordFilterAdapter(ChineseKeywordFilter chineseKeywordFilter) {
        this.chineseKeywordFilter = chineseKeywordFilter;
    }

    @Override
    public String filter(String text) {
        text = chineseKeywordFilter.pinyinFilter(text);
        text = chineseKeywordFilter.chineseFilter(text);
        return text;
    }
}
