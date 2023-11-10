package structure.adapter;

public class Test {

    public static void main(String[] args) {
        OldKeywordFilterManager filter = new OldKeywordFilterManager();
        String text = "你真是个傻逼，一坨shit，i fuck you，真是个sb";
        String s = filter.filter(text);
        System.out.println(s);

        NewKeywordFilterManager newFilter = new NewKeywordFilterManager();
        newFilter.register(new ChineseKeywordFilterAdapter(new ChineseKeywordFilter()));
        newFilter.register(new EnglishKeywordFilterAdapter(new EnglishKeywordFilter()));
        String ss = newFilter.filter(text);
        System.out.println(ss);
    }
}
