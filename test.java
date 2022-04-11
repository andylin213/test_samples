package request;
import org.apache.http.client.fluent.Request;
import test.testlib;

public class Test {

    static String source() { return ""; }
    static void sink(String x) {}
    static String spread(String x) { return ""; }
    static void ignore() {
        String a = source();
        sink(a);
    }
    static void test(String a, String b) {
        sink(b);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public static String show(String name) {
//         Request.Get(name);
        String a = source();
        String aa = spread(a);
        sink(aa);

        String b = testlib.source();
        String bb = testlib.spread(b);
        testlib.sink(bb);

        ignore();
        test("1", "2");
    }
}
