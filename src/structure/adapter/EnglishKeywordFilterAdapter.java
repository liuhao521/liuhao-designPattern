package structure.adapter;

public class EnglishKeywordFilterAdapter implements KeywordFilterAdapter{

    private EnglishKeywordFilter englishKeywordFilter;

    public EnglishKeywordFilterAdapter(EnglishKeywordFilter englishKeywordFilter) {
        this.englishKeywordFilter = englishKeywordFilter;
    }

    @Override
    public String filter(String filter) {
        return englishKeywordFilter.keywordFilter(filter);
    }
}
