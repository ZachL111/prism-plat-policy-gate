package io.portfolio;

public final class PolicyTest {
    public static void main(String[] args) {
        var signalcase_1 = new Policy.Signal(66, 107, 11, 24, 11);
        if (Policy.score(signalcase_1) != 104) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_1).equals("review")) throw new AssertionError("decision mismatch");
        var signalcase_2 = new Policy.Signal(97, 88, 9, 18, 10);
        if (Policy.score(signalcase_2) != 188) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_2).equals("accept")) throw new AssertionError("decision mismatch");
        var signalcase_3 = new Policy.Signal(100, 96, 19, 15, 11);
        if (Policy.score(signalcase_3) != 208) throw new AssertionError("score mismatch");
        if (!Policy.classify(signalcase_3).equals("accept")) throw new AssertionError("decision mismatch");
    }
}
