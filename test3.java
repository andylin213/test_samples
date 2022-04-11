package test;
import third.lib.Sink;

class Rule {
    @Path
    void test(String cmd) {
       Sink.exec(cmd);
    }
}
