package structure.adapter;

/**
 * 英文关键词过滤
 */
public class ChineseKeywordFilter {

    private static final String[] chineseKeyword = {"傻逼","脑残"};
    private static final String[] pinyinKeyword = {"sb"};

    public String chineseFilter(String text){
        for (String s : chineseKeyword){
            if (text.contains(s)){
                text = text.replace(s,"小可爱");
            }
        }
        return text;
    }

    public String pinyinFilter(String text){
        for (String s : pinyinKeyword){
            if (text.contains(s)){
                text = text.replace(s,"小可爱");
            }
        }
        return text;
    }
}
