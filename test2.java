package xcheck.test;
import third.lib.Source;

class Rule {
    @Path
    void test(String str) {
        String cmd = Source.getParam("cmd");
        Runtime.getRuntime().exec(cmd);
    }
}
