package com.kata.integration;

import com.kata.Paper;
import com.kata.Pencil;
import com.kata.Writer;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AppTest {
    @Test
    public void whenWriterWritesOnPaperTextIsStored() {
        Paper paper = new Paper();
        Pencil pencil = new Pencil();
        Writer writer = new Writer();

        writer.write("text", pencil, paper);
        assertThat(paper.getText(), is("text"));
    }
}
