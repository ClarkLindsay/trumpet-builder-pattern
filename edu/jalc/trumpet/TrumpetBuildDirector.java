package edu.jalc.trumpet;

import edu.jalc.trumpet.trumpet.Trumpet;

public class TrumpetBuildDirector {

    private TrumpetBuilderImpl builder;

    public TrumpetBuildDirector(final TrumpetBuilderImpl builder) {
        this.builder = builder;
    }

    public String construct() {
        return "Trumpet, " + builder.withHighQualityEtching() + ", " + builder.useSilver() + ", " + builder.comesWithMute();
    }

    public static void main(final String[] arguments) {
        TrumpetBuilderImpl builder = new TrumpetBuilderImpl();
        TrumpetBuildDirector trumpetBuildDirector = new TrumpetBuildDirector(builder);
        System.out.println(trumpetBuildDirector.construct());
    }
}