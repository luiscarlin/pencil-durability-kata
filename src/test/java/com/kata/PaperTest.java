package com.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaperTest {
    @Test
    public void textShouldBeStoredInAPaper() {
        Paper paper = new Paper();
        paper.add("text");
        assertThat(paper.getText(), is("text"));
    }
}
