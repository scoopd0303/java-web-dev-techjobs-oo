package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField {

    public PositionType(String value) {
        super(value);
    }

    @Override
    String returnClassNameAsString() {
        return "Position Type: ";
    }

}
