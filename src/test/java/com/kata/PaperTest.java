package com.kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaperTest {

    private Paper subject;

    @Before
    public void setup() {
        subject = new Paper();
    }
    @Test
    public void textShouldBeStoredInAPaper() {
        subject.add("text");
        assertThat(subject.getText(), is("text"));
    }
    @Test
    public void textShouldBeAddedToPaper() {
        subject.add("first text");
        assertThat(subject.getText(), is("first text"));

        subject.add(" more text");
        assertThat(subject.getText(), is("first text more text"));
    }
}
