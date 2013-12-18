package specs.support;

import com.djordje.apps.model.Term;

/**
 * Created with IntelliJ IDEA.
 * User: pro
 * Date: 23/10/13
 * Time: 22:20
 * To change this template use File | Settings | File Templates.
 */
public class TermStubs {

    public static Term aSimpleTerm() {
        return new Term("AAA","Acronym which stands for Arrange,Act,Assert. It is a well known unit testing design pattern");
    }

    public static Term aTermWithNoDescription() {
        return new Term("AAA",null);
    }

    public static Term aTermWithNoName() {
        return new Term(null,"Acronym which stands for Arrange,Act,Assert. It is a well known unit testing design pattern");
    }

    public static Term aTermWithExactly400Characters() {
       return new Term("SampleTerm","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
               "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
               "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
               "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
               "xxxxxxxxxxxxxxxxxxxxx");
    }

    public static Term aTermWithMoreThan400Characters() {
        return new Term("SampleTerm","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
                "xxxxxxxxxxxxxxxxxxxxxx");
    }

    public static Term aCustomTermWith(String name, String description) {
        return new Term(name,description);
    }
}
