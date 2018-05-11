package com.hainet.togglz.spring.boot.sample;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;

public enum Features implements Feature {

    @EnabledByDefault
    @Label("Some feature.")
    FEATURE,

    @SmartPhone
    @Label("iPhone")
    IPHONE,

    @SmartPhone
    @Label("Android")
    ANDROID
}
